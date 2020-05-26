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
public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if (frase.equals("Cachorro fofinho!")) {
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora){
        if (hora < 12) {
            System.out.println("Abanar");
        } 
        else if (hora < 18) {
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("Ignorar");
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanarrr");
        }
        else{
            System.out.println("Rosnar e morder");
        }
    }
    public void reagir(double peso, int idade){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }
            else{
                System.out.println("Latir");
            }
        }
        else{
            if (peso < 10) {
                System.out.println("Rosnar");
            }
            else{
                System.out.println("Ignorar");
            }
        }
    }
}
