/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio_do_banco.conta;

import com.mycompany.desafio_do_banco.Banco.Banco;
import com.mycompany.desafio_do_banco.Pessoa.Cliente;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Conta {
    
    private Banco banco;
    private TipoDeConta tipo;
    private Double saldo;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(Banco banco, TipoDeConta tipo, Double saldo, Cliente cliente) {
        this.banco = banco;
        this.tipo = tipo;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public TipoDeConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeConta tipo) {
        this.tipo = tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "banco=" + banco + ", Conta tipo=" + tipo + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
    
    public static void abrirConta(){
        Cliente cliente = new Cliente();
        
        Banco banco = new Banco();
        
        Conta conta = new Conta();
        conta.setBanco(banco);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nOlá, bem-vindo ao nosso sistema.");
        System.out.println("Se deseja criar uma conta conosco precisamos de alguns dados.");
        System.out.print("Seu nome: ");
        String nomeDoCliente = scanner.nextLine();
        cliente.setNome(nomeDoCliente);
        System.out.print("Seu endereço: ");
        String enderecoDoCliente = scanner.nextLine();
        cliente.setEndereco(enderecoDoCliente);
        
        conta.setCliente(cliente);
        
        System.out.println("\n1- Conta Corrente");
        System.out.println("2- Conta Poupança");
        System.out.print("Que tipo de conta?: ");
        Byte tipoConta = scanner.nextByte();
        if(tipoConta == 1){
            conta.setTipo(TipoDeConta.CORRENTE);
        } else{
            conta.setTipo(TipoDeConta.POUPANÇA);
        }
        
        System.out.print("Deseja fazer algum depósito inicial? : ");
        String respostaDeposito = scanner.next();
        if(respostaDeposito.equalsIgnoreCase("Sim")){
             System.out.print("Digite o valor do seu depósito: ");
             Double valorDeposito = scanner.nextDouble();
             conta.setSaldo(valorDeposito);
             System.out.println("Deposito de " + valorDeposito + " realizado com sucesso!");
        }else{
            conta.setSaldo(0.0);
        }
        
       System.out.println("\nBem vindo");
       System.out.println(conta.toString());
    }
    
    public static void Depositar(Double valor){
        Conta conta = new Conta();
        conta.setSaldo(valor);
    }
}
