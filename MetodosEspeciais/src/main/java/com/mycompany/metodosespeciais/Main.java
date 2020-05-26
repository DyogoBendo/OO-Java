/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodosespeciais;

/**
 *
 * @author Dyogo
 */
public class Main {

    public static void main(String[] args) {
        SetGetConstruct c1 = new SetGetConstruct("Azaleia", 0.9, "Preto");
        
        c1.status();
        
        c1.setModelo("Bic");
        // c1.modelo = "Bic";
        
        c1.setPonta(0.7);
        // c1.ponta = 0.7;
        
        // c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo()
        + " de ponta " + c1.getPonta());
    }
    
}
