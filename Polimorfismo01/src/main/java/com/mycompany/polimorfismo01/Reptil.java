/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo01;

/**
 *
 * @author Dyogo
 */
public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("Rastejando...");
    }
    @Override 
    public void alimentar(){
        System.out.println("Comer frutas...");
        
    }
    @Override 
    public void emitirSom(){
        System.out.println("Som de reptil...");
        
    }
}
