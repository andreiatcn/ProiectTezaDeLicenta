package com.iucosoft.proiectfinaljava.dao;

import com.iucosoft.proiectfinaljava.entities.Product;
import java.util.List;

/**
 *
 * @author tacua
 */
public interface ProductDaoIntf extends GenericDaoIntf<Product, Integer> {

    List<Product> findAll();

}
