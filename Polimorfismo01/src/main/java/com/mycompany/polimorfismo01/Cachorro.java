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
public class Cachorro extends Mamifero {
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    public void esconderOsso(){
        System.out.println("Escondendo osso");
    }
    
    @Override 
    public void emitirSom(){
        System.out.println("Au Au Au");
    }
}
