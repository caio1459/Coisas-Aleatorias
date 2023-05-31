package com.unialfa.academico.service;

import com.unialfa.academico.model.Aluno;
import com.unialfa.academico.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    public Aluno salvar(Aluno aluno){
        return repository.save(aluno);
    }
    public List<Aluno> listarTodos(){
        return repository.findAll();
    }
}
