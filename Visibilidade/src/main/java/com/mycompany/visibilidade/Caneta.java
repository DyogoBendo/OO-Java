/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.visibilidade;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta; 
    protected int carga; 
    private boolean tampado;
    
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampado: " + this.tampado);
    }
    
    public void rabiscar(){
        if (tampado) {
            System.out.println("Impossivel rabiscar");
        }
        else{
            System.out.println("Rabiscado com sucesso");
        }
    }
    public void tampar(){
        tampado = true;
    }
    public void destampar(){
        tampado = false;
    }
}
