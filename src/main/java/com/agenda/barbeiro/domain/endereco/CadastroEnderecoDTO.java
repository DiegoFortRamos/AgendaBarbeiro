package com.agenda.barbeiro.domain.endereco;

public record CadastroEnderecoDTO(
        String rua,
        String cidade,
        String estado,
        String pais,
        String cep
) {
}
