package com.agenda.barbeiro.domain.endereco;

import jakarta.validation.constraints.NotNull;

public record CadastroEnderecoDTO(
        @NotNull
        String pais,
        @NotNull
        String estado,
        @NotNull
        String cidade,
        @NotNull
        String cep,

        String complemento,

        int numero,

        String logradouro
) {

}
