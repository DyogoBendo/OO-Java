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
public class Alunos extends Pessoa {
    private int matricula;
    protected String curso;
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade...");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
