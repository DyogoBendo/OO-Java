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
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public String Detalhes() {
        return "Livro \n" + " titulo = " + titulo + "\n autor = " + autor + 
                "\n totPaginas = " + totPaginas + "\n pagAtual = " + pagAtual +
                " \n aberto = " + aberto + "\n leitor= " + leitor.getNome();
    }
    
    
    
    @Override 
    public void abrir(){
        this.setAberto(true);
    }
    @Override
    public void fechar(){
        this.setAberto(false);
    }
    @Override 
    public void folhear(int p){
        if (this.isAberto() && p <= this.getTotPaginas() && p >= 0) {
            this.setPagAtual(p);
        }
        else{
            System.out.println("Impossivel folhear");
        }
    }
    @Override 
    public void avancarPag(){
        if (this.isAberto() && this.getTotPaginas() >= this.getPagAtual() + 1) {
            this.setPagAtual(this.getPagAtual() + 1);
        }
        else{
            System.out.println("Impossivel avancar de pagina");
        }
    }
    @Override
    public void voltarPag(){
        if (this.isAberto() && this.getPagAtual() - 1 >= 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        }
        else{
            System.out.println("Impossivel voltar de pagina");
        }
    }
    
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public boolean isAberto(){
        return this.aberto;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    
    
    
}
