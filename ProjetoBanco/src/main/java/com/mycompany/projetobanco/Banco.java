/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetobanco;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class Banco {
    Scanner teclado = new Scanner(System.in);
    Random num = new Random();
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public Banco(){
        status = false;
        saldo = 0;
    }
    public void Decidir(){
        int decide; 
        System.out.println("O que deseja fazer? ");
        System.out.println("[1] Abrir conta");
        System.out.println("[2] Fechar conta");
        System.out.println("[3] Deposito");
        System.out.println("[4] Sacar");
        System.out.println("[5] Pagar Mensal");
        System.out.println("[0] Sair");
        decide = teclado.nextInt();
        switch(decide){
            case 1:
                abrirConta();
                Decidir();
                break;
            case 2:
                fecharConta();
                Decidir();
                break;
            case 3:
                System.out.println("Valor atual: " + this.saldo);
                System.out.println("Qual sera o valor depositado? ");
                depositar(teclado.nextDouble());
                Decidir();
                break;
            case 4:
                System.out.println("Valor atual: " + this.saldo);
                System.out.println("Qual sera o valor sacado? ");
                sacar(teclado.nextInt());
                Decidir();
                break;
            case 5:
                pagarMensalidade();
                Decidir();
                break;
            case 0:
                break;
            default: 
                Decidir();
                break;
        }
    }
    
    public void abrirConta(){
        System.out.println("Insira seu nome: ");
         setDono(teclado.next());
        do {
        System.out.println("Qual tipo de conta deseja abrir?");
        System.out.println("Conta Corrente - CC");
        System.out.println("Conta poupanca -- CP");
        tipo = teclado.next();
        } while (!tipo.equals("CC") && !tipo.equals("CP"));
        numConta = num.nextInt(1000) + 1000; 
        if (tipo.equals("CC")) {
            saldo += 50;
        }
        else{
            saldo += 150;
        }
        status =  true;
    }
    public void fecharConta(){
        if (saldo == 0 && status == false) {
            System.out.println("Impossivel fechar conta!");
        }
        else{
            numConta = 0;
            status = false;
        }
    }
    public void depositar(double deposito){
        if (status == true) {
           saldo += deposito; 
        }
        
    }
    public double sacar(double saque){
        if (saldo - saque >= 0 && status == true ) {
            saldo -= saque;
            return saque;
        } else{
            return 0; 
        }
    }
    public void pagarMensalidade(){
        saldo -= 12;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
