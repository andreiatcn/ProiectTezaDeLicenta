package com.iucosoft.proiectfinaljava.controller;

import com.iucosoft.proiectfinaljava.entities.Product;
import com.iucosoft.proiectfinaljava.services.ElasticsearchServiceIntf;
import com.iucosoft.proiectfinaljava.services.ProductServiceIntf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author
 */
@Controller
public class ProductSearchController {

    private static final Logger LOG = Logger.getLogger(ProductSearchController.class.getName());

    @Autowired
    private ProductServiceIntf productService;
    
    @Autowired
    private ElasticsearchServiceIntf elasticsearchService;

    @GetMapping("/productSearch")
    public String showSearchPage() {
        return "productSearchPage";
    }

    @PostMapping("/productSearch")
    public String searchProducts(@RequestParam("productName") String productName, Model model) {
        List<Product> searchResults = new ArrayList<>();
        
        try {
            // Search for products in Elasticsearch
            searchResults = elasticsearchService.searchProducts(productName);
            LOG.log(Level.INFO, "Found {0} products in Elasticsearch matching: {1}", new Object[]{searchResults.size(), productName});
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "Error searching products in Elasticsearch: {0}", e.getMessage());
            // Fallback to database search if Elasticsearch fails
            searchResults = productService.findByNameContaining(productName);
            LOG.log(Level.INFO, "Fallback to database - found {0} products matching: {1}", 
                    new Object[]{searchResults.size(), productName});
        }
        
        // Add the search results to the model
        model.addAttribute("searchResults", searchResults);
        model.addAttribute("searchPerformed", true);
        model.addAttribute("searchQuery", productName);
        
        return "productSearchPage";
    }
}
