package com.agenda.barbeiro.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String cep;
    private String complemento;
    private int numero;
    private String logradouro;

   public Endereco(CadastroEnderecoDTO dados){
       this.pais = dados.pais();
       this.estado = dados.estado();
       this.cidade = dados.cidade();
       this.cep = dados.cep();
       this.complemento = dados.complemento();
       this.numero = dados.numero();
       this.logradouro = dados.complemento();
   }


    public void updateEndereco(AtualizaEnderecoDTO dados) {
        if (dados.pais() != null){
            this.pais = dados.pais();
        }
        if (dados.estado() != null){
            this.estado = dados.estado();
        }
        if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
        if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if (dados.numero() != 0){
            this.numero = dados.numero();
        }
        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
    }
}
