/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetobanco;

import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class AcessoBanco {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Banco jub = new Banco();
        jub.Decidir();
        
    }
    
}
