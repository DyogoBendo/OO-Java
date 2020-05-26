/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade_livro;

/**
 *
 * @author Dyogo
 */
public class Aula_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1] );
        l[2] = new Livro("java avancado", "Maria Candido", 800, p[0]);
        l[1].abrir();
        l[1].avancarPag();
        System.out.println(l[1].Detalhes());
        
    }
    
}
