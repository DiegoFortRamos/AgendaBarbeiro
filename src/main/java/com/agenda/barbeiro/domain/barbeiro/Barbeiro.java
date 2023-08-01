package com.agenda.barbeiro.domain.barbeiro;

import com.agenda.barbeiro.domain.endereco.AtualizaEnderecoDTO;
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
    private Long id_barbeiro;
    private String nome;
    private String sobrenome;
    private String nascimento;
    private String cpf;
    private String email;
    @Embedded
    private Endereco endereco;



    public Barbeiro(CadastroBarbeiroDTO dados){
        this.nome = dados.nome();
        this.sobrenome = dados.sobrenome();
        this.nascimento = dados.nascimento();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.endereco = dados.endereco();

    }

    public void updateBarbeiro  (AtualizaBarbeiroDTO dados){
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.sobrenome() != null){
            this.sobrenome = dados.sobrenome();
        }
        if (dados.nascimento() != null){
            this.sobrenome = dados.sobrenome();
        }
        if (dados.cpf() != null){
            this.cpf = dados.cpf();
        }
        if (dados.email() != null){
            this.email = dados.email();
        }
        if (dados.endereco() != null){
            this.endereco.updateEndereco(dados.endereco());
        }
    }





}
