package com.iucosoft.proiectfinaljava.services.impl;

import com.iucosoft.proiectfinaljava.dao.ProductDaoIntf;
import com.iucosoft.proiectfinaljava.entities.Product;
import com.iucosoft.proiectfinaljava.services.ProductServiceIntf;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tacua
 */
@Service("productService")
public class ProductServiceImpl extends GenericServiceImpl<Product, Integer> implements ProductServiceIntf {

    @Autowired
    ProductDaoIntf productDao;

    @Override
    public List<Product> findAll() {

        List<Product> list = new ArrayList<>();
        try {
            list = productDao.findAll();
            System.out.println("am scos lista cu succes cu findAll" + list);
        } catch (Exception e) {
            LOG.severe(e.toString());
        }
        return list;

    }

    @Override
    public List<Product> findByNameContaining(String name) {
        List<Product> list = new ArrayList<>();
        try {
            list = productDao.findByNameContaining(name);
            System.out.println("Searched products by name: " + name + ", found: " + list.size());
        } catch (Exception e) {
            LOG.severe("Error searching products by name: " + e.toString());
        }
        return list;
    }

}
