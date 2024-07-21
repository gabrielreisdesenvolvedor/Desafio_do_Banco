/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio_do_banco;

import com.mycompany.desafio_do_banco.conta.Conta;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Desafio_do_Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem vindo!");
        System.out.println("1 - Abrir conta");
        System.out.println("2 - Depositar");
        System.out.print("Qual sua escolha: ");
        Integer escolha = scanner.nextInt();
        
        if(escolha == 1){
            Conta.abrirConta();
        }
    }
}
