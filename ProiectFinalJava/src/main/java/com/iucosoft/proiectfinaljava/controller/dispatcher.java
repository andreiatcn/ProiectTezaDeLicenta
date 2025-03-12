package com.iucosoft.proiectfinaljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author atacu
 */
@Controller
public class dispatcher {

    @GetMapping("/{pageName}")
    public String switchPage(@PathVariable("pageName") String pageName) {
        switch (pageName) {
            case "home":
                return "homePage";  // Returns home.jsp (in /WEB-INF/pages/)
            case "accountPage":
                return "cms/accountPage";  // Returns consultatii.jsp (in /WEB-INF/pages/)
            case "adminOrderBuyPage":
                return "cms/adminOrderBuyPage";  // Returns consultatii.jsp (in /WEB-INF/pages/)
            case "adminOrderSellPage":
                return "cms/adminOrderSellPage";  // Returns despreNoi.jsp (in /WEB-INF/pages/)
            case "adminPage":
                return "cms/adminPage";  // Returns cariere.jsp (in /WEB-INF/pages/)
            case "cart":
                return "cms/cartPage";  
            case "login":
                return "loginPage"; 
            case "registrationPage":
                return "registrationPage";    
            default:
                return "error";  // Returns error.jsp if the page name is invalid
        }
    }
}