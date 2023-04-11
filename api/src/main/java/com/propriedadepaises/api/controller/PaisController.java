package com.propriedadepaises.api.controller;

import com.propriedadepaises.api.models.Pais;
import com.propriedadepaises.api.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PaisController {

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping("/paises")
    public ResponseEntity<List<Pais>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(paisRepository.findAll());
    }

    @GetMapping("/paises/{id}")
    public ResponseEntity<Optional<Pais>> findOnePais(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(paisRepository.findById(id));
    }
}