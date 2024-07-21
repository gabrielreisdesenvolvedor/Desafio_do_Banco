/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio_do_banco.Pessoa;

import com.mycompany.desafio_do_banco.conta.Conta;

/**
 *
 * @author gabriel
 */
public class Cliente extends Pessoa{
    
    private Conta conta;
    
    public Cliente(){};

    public Cliente(String nome, String endereco) {
        super(nome, endereco);
    }
    
    public Cliente(String nome, String endereco, Conta conta) {
        super(nome, endereco);
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
