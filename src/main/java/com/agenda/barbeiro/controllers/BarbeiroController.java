package com.agenda.barbeiro.controllers;

import com.agenda.barbeiro.domain.barbeiro.Barbeiro;
import com.agenda.barbeiro.domain.barbeiro.CadastroBarbeiroDTO;
import com.agenda.barbeiro.domain.barbeiro.DetalhaBarbeiroDTO;
import com.agenda.barbeiro.repositories.BarbeiroRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("barbeiros")
public class BarbeiroController {
    private BarbeiroRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid CadastroBarbeiroDTO dados, UriComponentsBuilder uriBuilder){
        var barbeiro = repository.save(new Barbeiro(dados));
        var uri = uriBuilder.path("/barbeiros/{id}").buildAndExpand(barbeiro.getId()).toUri();

        return ResponseEntity.created(uri).body(new DetalhaBarbeiroDTO(barbeiro));
    }


}
