package com.starwars.demo.projeto.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 50)
    private String genero;

    @Column(nullable = false)
    private float avaliacao;

    @Column(nullable = false)
    private int duracao;

    @Column(columnDefinition = "TEXT")
    private String sinopse;
}
