package com.iucosoft.proiectfinaljava.services;

import com.iucosoft.proiectfinaljava.entities.Product;
import java.io.IOException;
import java.util.List;

/**
 * Interface for Elasticsearch operations
 */
public interface ElasticsearchServiceIntf {
    
    /**
     * Search for products by name in Elasticsearch
     * 
     * @param query the search query
     * @return list of products matching the query
     * @throws IOException if an error occurs during the search
     */
    List<Product> searchProducts(String query) throws IOException;
}
