/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo02;

/**
 *
 * @author Dyogo
 */
public abstract class Animal {
    protected int idade;
    protected double peso;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public abstract void emitirSom();
    public abstract void alimentar();
    public abstract void locomover();
}
