/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetofinal;

/**
 *
 * @author Dyogo
 */
public class AulaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video ("Aula 12 de PHP");
        v[2] = new Video("Aula com o Cantu");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto ("Creuza", 31, "F", "creu");
        
        Visualizacao view[] = new Visualizacao[5];
        view[0] = new Visualizacao(g[0], v[0]);
        view[0].avaliar();
        System.out.println(view[0].toString());
        
        view[1] = new Visualizacao(g[0], v[1]);
        view[1].avaliar(7);
        System.out.println(view[1].toString());
        
        view[2] = new Visualizacao(g[1], v[0]);
        view[2].avaliar(87.4);
        System.out.println(view[2].toString());
        
       /* System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(g[0].toString()); */
       
    }
    
}
