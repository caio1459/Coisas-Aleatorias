package com.unialfa.academico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String iniciar(Model model){
        model.addAttribute("boasVindas", "Boas Vindas ao Sistema Unialfa");
        return "index";
    }
}
