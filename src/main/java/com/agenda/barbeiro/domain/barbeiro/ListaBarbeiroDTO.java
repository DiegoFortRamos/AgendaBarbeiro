package com.agenda.barbeiro.domain.barbeiro;

public record ListaBarbeiroDTO(
        Long id_barbeiro,
        String nome,
        String sobrenome,
        String nascimento,
        String cpf,
        String email

) {
    public ListaBarbeiroDTO(Barbeiro barbeiro){
        this(
                barbeiro.getId_barbeiro(),
                barbeiro.getNome(),
                barbeiro.getSobrenome(),
                barbeiro.getNascimento(),
                barbeiro.getCpf(),
                barbeiro.getEmail());
    }
}
