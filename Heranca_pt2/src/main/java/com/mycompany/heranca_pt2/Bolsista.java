/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.heranca_pt2;

/**
 *
 * @author Dyogo
 */
public class Bolsista extends Alunos {
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa...");
    }

    @Override 
    public void pagarMensalidade(){
        System.out.println("Bolsista paganda a mensalidade...");
    }
    
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
}
