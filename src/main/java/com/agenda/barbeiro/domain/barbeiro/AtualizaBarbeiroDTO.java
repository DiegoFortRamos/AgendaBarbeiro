package com.agenda.barbeiro.domain.barbeiro;

import com.agenda.barbeiro.domain.endereco.AtualizaEnderecoDTO;
import com.agenda.barbeiro.domain.endereco.CadastroEnderecoDTO;

public record AtualizaBarbeiroDTO(
        Long id_barbeiro,
        String nome,
        String sobrenome,
        String nascimento,
        String cpf,
        String email,
        AtualizaEnderecoDTO endereco


) {
}
