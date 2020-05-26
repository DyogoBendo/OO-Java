package com.mycompany.visibilidade;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "Bic";
        c1.cor = "Azul";
        // c1.ponta = 0.3; Nao permite por ser private
        c1.carga = 10; // É possível pois o método main está dentro de uma classe que está utilizando a classe Caneta
        // c1.tampado = true; -- Privado
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
    
}
