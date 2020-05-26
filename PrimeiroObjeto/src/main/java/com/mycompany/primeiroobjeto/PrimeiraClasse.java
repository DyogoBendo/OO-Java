package com.mycompany.primeiroobjeto;
public class PrimeiraClasse {
    // Atributos 
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    // Metodos
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    void rabiscar(){
        if (tampada) {
            System.out.println("Não é possível rabiscar");
        }
        else{
            System.out.println("Rabiscou legal!");
        }
    }
    void tampar(){
        this.tampada = true; // this se refere ao objeto que a chamou, então
        // quando o objeto caneta1 chamar o metodo tampar, this se torna caneta1 
        // É uma referência ao próprio objeto que chamou
    }
    void destampar(){
        this.tampada = false;
    }
    
}
