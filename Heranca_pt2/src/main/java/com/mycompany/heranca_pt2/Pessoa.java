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
public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;

    @Override
    public String toString() {
        return "Dados: " + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade;
    }
    
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
