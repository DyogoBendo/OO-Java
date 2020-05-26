package com.mycompany.bancomelhorado;
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    // Metodo Construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    
    // Metodos
    
    public void estadoAtual(){
        System.out.println("------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() != 0) {
            System.out.println("Impossivel fechar conta! Saldo diferente de 0"); // Evitar mostrar coisas dentro de classes
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double deposito){
        if (this.isStatus()) {
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Deposito realizado com sucesso!");
        } 
        else{
            System.out.println("Impossivel depositar");
        }
        
    }
    public double sacar(double saque){
        if (this.isStatus() && this.getSaldo() >= saque) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque realizado com sucesso!");
            return saque;
        } else{
            System.out.println("Impossivel sacar");
            return 0;
        }
    }
    public void pagarMensal(){
        if (this.isStatus()) {
            if (this.tipo.equals("CC")) {
                this.setSaldo(getSaldo() - 12);
            }else{
                this.setSaldo(this.getSaldo() - 20);
            }
            System.out.println("Mensalidade paga com sucesso!");
        } else{
            System.out.println("Impossivel pagar mensalidade!");
        }
    }
    
    // Metodos Modificadores e Acessores

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
