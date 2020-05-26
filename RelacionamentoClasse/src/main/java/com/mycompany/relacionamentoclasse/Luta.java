/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relacionamentoclasse;

import java.util.Random;

/**
 *
 * @author Dyogo
 */
public class Luta {
    //Atributos 
    private Lutador desafiado; 
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada!");
        } else{
            System.out.println("Impossivel marcar luta!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        Random resultado = new Random();
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("========== RESULTADO DA LUTA ===========");
            switch(resultado.nextInt(3)){ // 0, 1 e 2
                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("Deu empate!");
                    break;
                case 1:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    break;
                case 2:
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    break;
            }
            
        }
        else{
            System.out.println("Luta nao aprovada");
        }
    }
    
    // Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
