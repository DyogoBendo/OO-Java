package com.mycompany.polimorfismo01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dyogo
 */
public abstract class Animal {
    protected int idade;
    protected double peso;
    protected int membros; 

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    protected int getMembros() {
        return membros;
    }

    protected void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal{" + "idade=" + idade + ", peso=" + peso + ", membros=" + membros + '}';
    }
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
