package com.iucosoft.proiectfinaljava.dao.impl;

import com.iucosoft.proiectfinaljava.dao.UserDaoIntf;
import com.iucosoft.proiectfinaljava.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tacua
 */
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDaoIntf {

    public UserDaoImpl() {
        super(User.class);
    }


}
