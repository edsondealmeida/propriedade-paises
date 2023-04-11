package com.propriedadepaises.api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Paises")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Capital")
    private String capital;

    @Column(name = "Regiao")
    private String regiao;

    @Column(name = "Sub_regiao")
    private String sub_regiao;

    @Column(name = "Area")
    private int area;
}