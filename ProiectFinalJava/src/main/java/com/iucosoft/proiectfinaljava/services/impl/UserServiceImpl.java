package com.iucosoft.proiectfinaljava.services.impl;

import com.iucosoft.proiectfinaljava.entities.User;
import com.iucosoft.proiectfinaljava.services.UserServiceIntf;
import org.springframework.stereotype.Service;

/**
 *
 * @author tacua
 */
@Service("userService")
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserServiceIntf {

}
