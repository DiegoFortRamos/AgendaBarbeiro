package com.agenda.barbeiro.domain.endereco;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public Endereco(CadastroEnderecoDTO dados){
        this.rua = dados.rua();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
        this.pais = dados.pais();
        this.cep = dados.cep();
    }
}
