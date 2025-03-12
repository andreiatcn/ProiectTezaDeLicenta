package com.iucosoft.proiectfinaljava.dao.impl;

import com.iucosoft.proiectfinaljava.dao.GenericDaoIntf;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author atacu
 */
@Repository("genericDao")
public class GenericDaoImpl<E, K extends Serializable> implements GenericDaoIntf<E, K> {

    @Autowired
    SessionFactory sessionFactory;
    Class<E> typeParameterClass;

    public GenericDaoImpl() {
    }

    public GenericDaoImpl(Class<E> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    @Override
    public K save(E entity) {
        System.out.println("am ajuns an dao ");
        Session session = sessionFactory.getCurrentSession();
        return (K) session.save(entity);
    }

    @Override
    public void update(E entity) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(entity);
    }

    @Override
    public void delete(K key) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        E entity = findById(key);
        if (entity != null) {
            session.delete(entity);
            session.getTransaction().commit();
        }
    }

    @Override
    public E findById(K key) {
        Session session = sessionFactory.getCurrentSession();
        return (E) session.get(typeParameterClass, key);
    }

    @Override
    public List<E> list() {
        Session session = sessionFactory.getCurrentSession();
        String hql = "from " + typeParameterClass.getName();
        List<E> list = session.createQuery(hql, typeParameterClass).getResultList();
        return list;
    }
}
