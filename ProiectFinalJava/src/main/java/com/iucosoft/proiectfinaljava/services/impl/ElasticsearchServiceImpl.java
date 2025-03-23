package com.iucosoft.proiectfinaljava.services.impl;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.iucosoft.proiectfinaljava.entities.Product;
import com.iucosoft.proiectfinaljava.services.ElasticsearchServiceIntf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.elastic.clients.elasticsearch._types.query_dsl.TextQueryType;

/**
 * Implementation of the Elasticsearch service
 */
@Service
public class ElasticsearchServiceImpl implements ElasticsearchServiceIntf {

    private static final Logger LOG = Logger.getLogger(ElasticsearchServiceImpl.class.getName());
    private static final String PRODUCTS_INDEX = "products";

    @Autowired
    private ElasticsearchClient elasticsearchClient;

    @Override
    public List<Product> searchProducts(String query) throws IOException {
        List<Product> results = new ArrayList<>();

        try {
            
            
            
            // Create a fuzzy match query that searches for the query string in the "name" field
            
            Query improvedQuery = Query.of(q -> q
                    .multiMatch(mm -> mm
                        .fields("name^4", "description")
                        .query(query)
                        .type(TextQueryType.BestFields)
                        .fuzziness("2") // Handles up to 2 character typos
                        .prefixLength(1) // Optimizes fuzzy matching
                    )
                );

            // Execute the search
            SearchResponse<Map> searchResponse = elasticsearchClient.search(s -> s
                    .index(PRODUCTS_INDEX)
                    .query(improvedQuery),
                    Map.class);
            

            // Process the search results
            for (Hit<Map> hit : searchResponse.hits().hits()) {
                Map<String, Object> sourceMap = hit.source();
                if (sourceMap != null) {
                    Product product = mapToProduct(sourceMap);
                    results.add(product);
                }
            }
            
            LOG.log(Level.INFO, "Found {0} products matching query: {1}", new Object[]{results.size(), query});
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error searching in Elasticsearch: {0}", e.getMessage());
            throw e;
        }

        return results;
    }

    /**
     * Maps a source map from Elasticsearch to a Product entity
     * Only maps name, description (des), and price fields
     * 
     * @param sourceMap the source map from Elasticsearch
     * @return the mapped Product entity
     */
    private Product mapToProduct(Map<String, Object> sourceMap) {
        Product product = new Product();
        
        // Only extract name, description, and price as requested
        if (sourceMap.containsKey("id")) {
            product.setId(Integer.parseInt(sourceMap.get("id").toString()));
        }
        
        if (sourceMap.containsKey("name")) {
            product.setName((String) sourceMap.get("name"));
        }
        
        if (sourceMap.containsKey("des")) {
            product.setDes((String) sourceMap.get("des"));
        }
        
        if (sourceMap.containsKey("price")) {
            product.setPrice(Float.parseFloat(sourceMap.get("price").toString()));
        }
        
        return product;
    }
}
