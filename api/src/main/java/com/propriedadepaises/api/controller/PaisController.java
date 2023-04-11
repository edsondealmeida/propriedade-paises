package com.propriedadepaises.api.controller;

import com.propriedadepaises.api.models.Pais;
import com.propriedadepaises.api.repository.PaisRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaisController {

    @Autowired
    private PaisRepository paisRepository;

    @PostMapping("/paises")
    @Transactional
    public ResponseEntity creatingPais(@RequestBody Pais pais){
        return ResponseEntity.status(HttpStatus.CREATED).body(paisRepository.save(pais));
    }

    @GetMapping("/paises")
    public ResponseEntity<List<Pais>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(paisRepository.findAll());
    }

    @GetMapping("/paises/{id}")
    public ResponseEntity<Optional<Pais>> findOnePais(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(paisRepository.findById(id));
    }
}