/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relacionamentoclasse;

/**
 *
 * @author Dyogo
 */
public class UEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador[6];
        String nome[] = {"Pretty Boy", "Putscript", "Snapshadow", 
        "Dead Code", "UFOCobol", "Nerdaart"};
        String nacionalidade[] = {"Franca", "Brasil", "EUA", 
        "Australia", "Brasil", "EUA"};
        int idade[] = {31, 29, 35, 28, 37, 30};
        double altura[] = {1.75, 1.68, 1.65, 1.93, 1.70, 1.81};
        double peso[] = {68.9, 57.8, 80.9, 81.6, 119.3, 105.7};
        int vitorias[] = {11, 14, 12, 13, 5, 12};
        int derrotas[] = {2, 2, 2, 0, 4, 2};
        int empates[] = {1, 3, 1, 2, 4, 4};
        
        for (int i = 0; i < 6; i++) {
            l[i] = new Lutador(nome[i], nacionalidade[i], idade[i], altura[i], peso[i], vitorias[i], derrotas[i],empates[i]);
        }
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        
    }
    
    
    
}
