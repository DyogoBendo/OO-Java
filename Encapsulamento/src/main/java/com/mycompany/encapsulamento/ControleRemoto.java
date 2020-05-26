/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author Dyogo
 */
public class ControleRemoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controle c = new Controle();
        c.menosVolume();
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
