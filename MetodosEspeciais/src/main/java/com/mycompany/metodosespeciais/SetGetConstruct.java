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
public class SetGetConstruct {
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    public SetGetConstruct(String modelo, double ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
      /* public SetGetConstruct(String m, double p, String c){ // Metodo construtor, tem o mesmo nome da classe 
        setModelo(m);
        setPonta(p);
        this.cor = c;
        tampar();
    } 
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public double getPonta(){
        return this.ponta;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setPonta(double p){
        this.ponta = p;
    }
    */
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    } 

  
    
    
   
}
