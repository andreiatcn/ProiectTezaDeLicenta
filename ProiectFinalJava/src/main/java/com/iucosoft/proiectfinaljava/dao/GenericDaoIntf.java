/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.proiectfinaljava.dao;

import java.util.List;

/**
 *
 * @author tacua
 */
public interface GenericDaoIntf<E, K> {
    
     public K save(E entity);

    public E findById(K key);

    public void update(E entity);

    public void delete(K key);

    public List<E> list();
    
}
