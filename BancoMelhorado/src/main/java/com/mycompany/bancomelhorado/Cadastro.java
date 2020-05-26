/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancomelhorado;

/**
 *
 * @author Dyogo
 */
public class Cadastro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaBanco n1 = new ContaBanco();
        n1.setNumConta(1111);
        n1.setDono("Jubileu");
        n1.setTipo("CC");
        n1.abrirConta(n1.getTipo());
        n1.depositar(300);
        n1.estadoAtual();
        n1.sacar(350);
        n1.fecharConta();
        n1.estadoAtual();
        
        ContaBanco n2 = new ContaBanco();
        n2.setDono("Creuza");
        n2.setNumConta(2222);
        n2.abrirConta("CP");
        n2.depositar(500);
        n2.estadoAtual();
        n2.sacar(100);
        n2.fecharConta();
        n2.estadoAtual();
    }
    
}
