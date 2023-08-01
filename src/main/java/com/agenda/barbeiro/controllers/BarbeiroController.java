package com.agenda.barbeiro.controllers;

import com.agenda.barbeiro.domain.barbeiro.*;
import com.agenda.barbeiro.repositories.BarbeiroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("barbeiros")
public class BarbeiroController {

    @Autowired
    private BarbeiroRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity post(@RequestBody @Valid CadastroBarbeiroDTO dados, UriComponentsBuilder uriBuilder){
        var barbeiro = repository.save(new Barbeiro(dados));
        var uri = uriBuilder.path("/barbeiros/{id}").buildAndExpand(barbeiro.getId_barbeiro()).toUri();

        return ResponseEntity.created(uri).body(new DetalhaBarbeiroDTO(barbeiro));
    }

    @GetMapping
    public ResponseEntity<Page<ListaBarbeiroDTO>> getAll(@PageableDefault(size = 5,sort = "nome") Pageable paginacao){
        var page = repository.findAll(paginacao).map(ListaBarbeiroDTO::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getBarbeiro (@PathVariable Long id){
        var barbeiro = repository.getReferenceById(id);
        return ResponseEntity.ok(new DetalhaBarbeiroDTO(barbeiro));
    }

    @PutMapping
    @Transactional
    public ResponseEntity putBarbeiro(@RequestBody AtualizaBarbeiroDTO dados){
        var barbeiro = repository.getReferenceById(dados.id_barbeiro());
        barbeiro.updateBarbeiro(dados);

        return ResponseEntity.ok(new DetalhaBarbeiroDTO(barbeiro));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteBarbeiro(@PathVariable Long id){
         repository.deleteById(id);

       return ResponseEntity.noContent().build();
    }




}
