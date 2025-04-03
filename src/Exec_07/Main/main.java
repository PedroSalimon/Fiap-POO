package Exec_07.Main;

import Exec_07.Bola.Bola;

public class main {
    public static void main(String[] args) {
        Bola bola1 = new Bola("azul", 2.75);
        Bola bola2 = new Bola("branca", 3.5);
        Bola bola3 = new Bola("vermelha", 3.25);

        Bola aux = bola1.maiorBola(bola2, bola3);
        System.out.println("Dados da bola com maior raio -> " + aux.retornaDados());

    }
}
