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
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Animal a1 = new Animal();
       Mamifero m1 = new Mamifero();
       Reptil r1 = new Reptil();
       Canguru c1 = new Canguru();
       Cachorro k1 =  new Cachorro();
       m1.locomover();
       r1.locomover();
       c1.locomover();
       c1.emitirSom();
       k1.emitirSom();
    }
    
}
