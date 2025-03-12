package com.iucosoft.proiectfinaljava.dao.impl;

import com.iucosoft.proiectfinaljava.dao.OrderSellDaoIntf;
import com.iucosoft.proiectfinaljava.entities.OrderSell;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tacua
 */
@Repository("orderSellDao")
public class OrderSellDaoImpl extends GenericDaoImpl<OrderSell, Integer> implements OrderSellDaoIntf {

    public OrderSellDaoImpl() {
        super(OrderSell.class);
    }


}
