package com.fivecode.fcingresoegresothymeleaf.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final Logger LOG = Logger.getLogger(""+IndexController.class);

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal User user){
        LOG.log(Level.INFO, "index");
        LOG.log(Level.INFO, "usuario :" + user);
        var mensaje = "Bienvenidos ";
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("user", user);
        return "index";
    }
}
