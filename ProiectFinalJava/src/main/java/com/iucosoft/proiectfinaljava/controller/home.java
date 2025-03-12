package com.iucosoft.proiectfinaljava.controller;

import com.iucosoft.proiectfinaljava.entities.Product;
import com.iucosoft.proiectfinaljava.services.OrderSellServiceIntf;
import com.iucosoft.proiectfinaljava.services.ProductServiceIntf;
import com.iucosoft.proiectfinaljava.util.ImageUtil;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author tacua
 */
@Controller
public class home {

    @Autowired
    ProductServiceIntf productService;

    @Autowired
    OrderSellServiceIntf orderSellServiceIntf;

    @GetMapping("")
    public String AfiseazLista(Model model, @ModelAttribute Product listProducts, @ModelAttribute String base64Image) throws IOException {

        List<Product> listProducts1 = productService.findAll();

        model.addAttribute("listProducts", listProducts1);

//        byte[] image = Files.readAllBytes(Paths.get("C:\\Users\\tacua\\OneDrive\\Desktop\\java\\C1\\mavenproject1\\ProiectFinalJava\\src\\main\\webapp\\images\\Andreia.png"));
        Product product = productService.findById(25);

        byte[] image = product.getImage();

        base64Image = Base64.getEncoder().encodeToString(image);

        model.addAttribute("base64Image", base64Image);

        System.out.println("image to base64Image = " + base64Image);

        return "homePage";
    }

}
