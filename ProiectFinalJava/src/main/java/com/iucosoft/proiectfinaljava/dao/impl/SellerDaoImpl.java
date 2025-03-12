/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.proiectfinaljava.dao.impl;

import com.iucosoft.proiectfinaljava.dao.SellerDaoIntf;
import com.iucosoft.proiectfinaljava.entities.Seller;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tacua
 */
@Repository("sellerDao")
public class SellerDaoImpl extends GenericDaoImpl<Seller, Integer> implements SellerDaoIntf {

    public SellerDaoImpl() {
        super(Seller.class);
    }


}
