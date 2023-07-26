package com.agenda.barbeiro.domain.barbeiro;

import com.agenda.barbeiro.domain.endereco.Endereco;

public record DetalhaBarbeiroDTO (
        Long id,
        String nome,
        String sobrenome,
        String dataNascimento,
        String cpf,
        Endereco endereco

){
    public DetalhaBarbeiroDTO(Barbeiro barbeiro){
        this(
                barbeiro.getId(),
                barbeiro.getNome(),
                barbeiro.getDataNascimento(),
                barbeiro.getSobrenome(),
                barbeiro.getCpf(),
                barbeiro.getEndereco());
    }
}
