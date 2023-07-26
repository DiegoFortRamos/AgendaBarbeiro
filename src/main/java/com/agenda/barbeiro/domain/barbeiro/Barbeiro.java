package com.agenda.barbeiro.domain.barbeiro;

import com.agenda.barbeiro.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "barbeiros")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Barbeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String cpf;
    @Embedded
    private Endereco endereco;

    public Barbeiro(CadastroBarbeiroDTO dados){
        this.nome = dados.nome();
        this.sobrenome = dados.sobrenome();
        this.dataNascimento = dados.dataNascimento();
        this.cpf = dados.cpf();
        this.endereco = dados.endereco();
    }



}
