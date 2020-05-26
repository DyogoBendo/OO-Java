/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encapsulamento;

import java.util.HashSet;

/**
 *
 * @author Dyogo
 */
public class Controle implements Controlador {
    
   //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Metodos especiais
    
    private void setVolume(int volume){
        this.volume = volume;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    private int getVolume(){
        return this.volume;
    }
    private boolean isLigado(){
        return this.ligado;
    }
    private boolean isTocando(){
        return this.tocando;
    }
    
    public Controle(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false); 
    }
    
    // Metodos abstratos

    @Override // Sobrescrever - Desconsidero a programacao anterior e programa agora 
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ta ligado");
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligou");
    }

    @Override
    public void abrirMenu(){
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Tocando: " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume() ; i+= 10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i+= 10) {
                System.out.print("|");
            }
            System.out.println("");
        } 
        else{
            System.out.println("Impossivel modificar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i+= 10) {
                System.out.print("|");
            }
            System.out.println("");
        }
        else{
            System.out.println("Impossivel modifcar o volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
        else{
            System.out.println("Impossivel colocar no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }else{
            System.out.println("Impossivel tirar do mudo!");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else{
            System.out.println("Impossivel dar play");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else{
            System.out.println("Impossivel pausar");
        }
    }
}
