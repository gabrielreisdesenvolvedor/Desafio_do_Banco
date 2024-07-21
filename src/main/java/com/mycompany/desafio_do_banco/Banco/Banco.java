/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio_do_banco.Banco;

/**
 *
 * @author gabriel
 */
public class Banco {
    
     
    private Integer agencia = 8217;
    private String endereco = "Rua Sebastião de Lima";
    private String descricao = "Um banco para você e sua família!";

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Banco: "+ "agencia: " + agencia + ", endereco: " + endereco + ", descricao: " + descricao + '}';
    }
    
    
}
