package com.agenda.barbeiro.domain.barbeiro;

import com.agenda.barbeiro.domain.endereco.Endereco;

public record DetalhaBarbeiroDTO (
        Long id_barbeiro,
        String nome,
        String sobrenome,
        String nascimento,
        String cpf,
        String email,
        Endereco endereco


){
    public DetalhaBarbeiroDTO(Barbeiro barbeiro){
        this(
                barbeiro.getId_barbeiro(),
                barbeiro.getNome(),
                barbeiro.getNascimento(),
                barbeiro.getSobrenome(),
                barbeiro.getCpf(),
                barbeiro.getEmail(),
                barbeiro.getEndereco()

        );
    }


}
