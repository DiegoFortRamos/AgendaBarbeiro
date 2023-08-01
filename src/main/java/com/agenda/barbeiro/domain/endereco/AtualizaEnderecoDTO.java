package com.agenda.barbeiro.domain.endereco;

import java.util.function.LongFunction;

public record AtualizaEnderecoDTO(
        Long id_barbeiro,
        String pais,
        String estado,
        String cidade,
        String cep,
        int numero,
        String complemento,
        String logradouro


) {
}
