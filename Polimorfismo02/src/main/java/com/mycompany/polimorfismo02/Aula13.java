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
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m1 = new Mamifero();
        Lobo l1 = new Lobo();
        Cachorro c1 = new Cachorro();
        
        m1.emitirSom();
        l1.emitirSom();
        c1.emitirSom();
        
        c1.reagir("Cachorro mau!");
        c1.reagir(true);
        c1.reagir(17);
        c1.reagir(12.5, 7);
    }
    
}
