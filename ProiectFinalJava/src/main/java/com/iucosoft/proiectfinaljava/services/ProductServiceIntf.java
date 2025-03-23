package com.iucosoft.proiectfinaljava.services;

import com.iucosoft.proiectfinaljava.entities.Product;
import java.util.List;

/**
 *
 * @author tacua
 */
public interface ProductServiceIntf extends GenericServiceIntf<Product, Integer> {

    List<Product> findAll();
    
    List<Product> findByNameContaining(String name);
}
