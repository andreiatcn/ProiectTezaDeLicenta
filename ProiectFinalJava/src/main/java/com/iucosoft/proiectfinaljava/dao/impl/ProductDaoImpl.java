package com.iucosoft.proiectfinaljava.dao.impl;
import com.iucosoft.proiectfinaljava.dao.ProductDaoIntf;
import com.iucosoft.proiectfinaljava.entities.Product;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tacua
 */
@Repository("productDao")
public class ProductDaoImpl extends GenericDaoImpl<Product, Integer> implements ProductDaoIntf {

    private static final Logger LOG = Logger.getLogger(ProductDaoImpl.class.getName());

    public ProductDaoImpl() {
        super(Product.class);
    }

    @Override
    public List<Product> findAll() {
        Session session = sessionFactory.openSession();
        try {
            String hql = "FROM Product"; // SELECT * FROM Product în HQL
            Query<Product> query = session.createQuery(hql, Product.class);
            return query.getResultList();
        } catch (Exception e) {
            LOG.severe("Error finding all products: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        Session session = sessionFactory.openSession();
        try {
            String hql = "FROM Product WHERE lower(name) LIKE lower(:productName)";
            Query<Product> query = session.createQuery(hql, Product.class);
            query.setParameter("productName", "%" + name + "%");
            return query.getResultList();
        } catch (Exception e) {
            LOG.severe("Error searching products by name: " + e.getMessage());
            return Collections.emptyList();
        }
    }

}
