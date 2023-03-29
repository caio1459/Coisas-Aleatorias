package com.unialfa.aula5.controller;

import com.unialfa.aula5.model.Comentario;
import com.unialfa.aula5.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComentarioController {

    @Autowired
    private ComentarioService service;

    @RequestMapping("/")
    public String iniciar(Model model) {
        model.addAttribute("bemVindo",
                "Bem vindo ao nosso formulário");

        return "formulario";
    }

    @PostMapping("enviar")
    public String enviar(Comentario comentario){
        service.salvar(comentario);

        //service.listarComentarios().forEach(c -> {
        //System.out.println(c.getTexto());
        //});

        return "redirect:/lista";  //lista comentarios
    }
    @GetMapping("lista")
    public String listar(Model model){
        model.addAttribute("bemVindo",
                "Lista de comentarios");

        model.addAttribute("comentarios", service.listarComentarios());


        return"lista";
    }

}
