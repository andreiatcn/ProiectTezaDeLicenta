package com.iucosoft.proiectfinaljava.dao.impl;

import com.iucosoft.proiectfinaljava.dao.OrderBuyDaoIntf;
import com.iucosoft.proiectfinaljava.entities.OrderBuy;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tacua
 */
@Repository("orderBuyDao")
public class OrderBuyDaoImpl extends GenericDaoImpl<OrderBuy, Integer> implements OrderBuyDaoIntf {

    public OrderBuyDaoImpl() {
        super(OrderBuy.class);
    }


}
