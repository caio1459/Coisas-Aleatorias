package com.unialfa.academico.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "CODIGO_CURSO")
    private Long id;

    @Column(name = "NOME_CURSO")
    private String nome;

    @Column(name = "DURACAO_CURSO")
    private  Integer duracao;

    @Column(name = "PUBLICACAO_CURSO")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publicacao;

}
