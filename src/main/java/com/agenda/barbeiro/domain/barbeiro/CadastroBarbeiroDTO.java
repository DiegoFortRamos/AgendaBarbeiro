package com.agenda.barbeiro.domain.barbeiro;


import com.agenda.barbeiro.domain.endereco.Endereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record CadastroBarbeiroDTO(
        @NotNull
        String nome,
        @NotNull
        String sobrenome,
        @NotNull
        String nascimento,
        @NotNull
        @CPF
        String cpf,
        @Email
        String email,
        @NotNull
        Endereco endereco

) {
}
