package com.unialfa.academico.controller;

import com.unialfa.academico.model.Curso;
import com.unialfa.academico.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("curso")
public class CursoController {
    @Autowired
    private CursoService service;

    @GetMapping("/lista")
    public String iniciarLista(Model model){
        model.addAttribute("boasVindas","Lista de Cursos");
        model.addAttribute("listaDeCursos", service.listarTodos());
        return "curso/lista";
    }
    @GetMapping("/formulario")
    public String iniciarFormulario(Model model, Curso curso){
        model.addAttribute("boasVindas","Cadastro de Cursos");
        return "curso/formulario";
    }
    @PostMapping("/salvar")
    public String salvar(Curso curso){
        service.salvar(curso);
        return "redirect:/curso/lista";
    }
    @GetMapping("/alterar/{id}")
    public String alterar(@PathVariable long id, Model model){
        model.addAttribute("boasVindas","Cadastro de Cursos");
        model.addAttribute("curso", service.buscarPorId(id));
        return "curso/formulario";
    }
    @GetMapping("/remover/{id}")
    public String remover(@PathVariable long id){
        service.remover(id);
        return "redirect:/curso/lista";
    }
}
