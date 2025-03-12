package com.iucosoft.proiectfinaljava.services;

import java.util.List;

/**
 *
 * @author atacu
 */
public interface GenericServiceIntf<E, K> {

//    public E init();
    public K save(E entity);

    public E findById(K key);

    public void update(E entity);

    public void delete(K key);

    public List<E> list();
}
