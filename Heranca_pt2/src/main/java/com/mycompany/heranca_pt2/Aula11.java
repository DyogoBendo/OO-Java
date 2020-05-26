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
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Pessoa p1 = new Pessoa();
       Visitante v1 = new Visitante();
       v1.setSexo("M");
       v1.setIdade(37);
       v1.setNome("Alek");
        System.out.println(v1.toString());
        
        Alunos a1 = new Alunos();
        a1.setNome("Liberia");
        a1.setCurso("Info");
        a1.setIdade(17);
        a1.setMatricula(239);
        a1.setSexo("F");
        System.out.println(a1.toString() + ", curso=" + 
                a1.getCurso() + ", matricula=" + a1.getMatricula());
       a1.pagarMensalidade();
       
       Bolsista b1 = new Bolsista();
       b1.pagarMensalidade();
    }
    
}
