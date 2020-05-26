package com.mycompany.primeiroobjeto;
public class PrimeiroObjeto {
    public static void main(String[] args) {
        PrimeiraClasse caneta1 = new PrimeiraClasse(); // Instanciando o Objeto
        
        caneta1.cor = "Azul"; // Passando valores aos atributos
        caneta1.ponta = 0.5;
        caneta1.carga = 50;
        caneta1.tampada = true;
        caneta1.modelo = "Bic";
        
        caneta1.rabiscar();
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.status();
        
        PrimeiraClasse caneta2 = new PrimeiraClasse();
        caneta2.cor = "Vermelha";
        caneta2.modelo = "Anatel";
        caneta2.carga = 70;
        caneta2.tampar();
        caneta2.ponta = 0.7;
        
        caneta2.status();
        
    }
}
