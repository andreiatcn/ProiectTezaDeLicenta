package com.iucosoft.proiectfinaljava.controller;

import com.iucosoft.proiectfinaljava.entities.User;
import com.iucosoft.proiectfinaljava.services.UserServiceIntf;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class register {

    private static final Logger LOG = Logger.getLogger(register.class.getName());

    @Autowired
    UserServiceIntf userServicesIntf;

    @PostMapping("/registrationPage")
    public String processRegister() {

        String pageRedirect = "";
        try {

            User user = new User(0, "pipera", "pipera", "Viorel", "Bulac", 78667788, "admin");
            userServicesIntf.save(user);
            LOG.info("salvat cu success!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 " + user);

//          
            pageRedirect = "home";

        } catch (Exception ex) {
            LOG.info("eroare la try!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            pageRedirect = "error";
        }
        return pageRedirect;

    }
}
