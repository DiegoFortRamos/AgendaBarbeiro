package com.agenda.barbeiro.domain.barbeiro;

import com.agenda.barbeiro.domain.endereco.Endereco;

public record CadastroBarbeiroDTO(
        String nome,
        String sobrenome,
        String dataNascimento,
        String cpf,
        Endereco endereco
) {
}
