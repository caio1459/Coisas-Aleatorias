package com.unialfa.aula5.service;

import com.unialfa.aula5.model.Comentario;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ComentarioService {

    private List<Comentario> comentarios = new ArrayList<>();

    public void salvar(Comentario comentario){
        comentario.setPublicacao(LocalDateTime.now());
        comentarios.add(comentario);
    }

    public List<Comentario> listarComentarios() {
        return comentarios;
    }
}