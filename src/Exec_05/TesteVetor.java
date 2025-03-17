package Exec_05;

import java.util.Random;

public class TesteVetor {
    public static void main(String[] args) {


        // declarar um vetor de inteiros
        int[] vetor = new int[5];

        // método para preencher o vetor
        preenche(vetor);
        // método para imprimir os valores
        imprimi(vetor);

    }
    public static void preenche(int[] vetor) {
        Random rd = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(15);
        }
    }

    public static void imprimi (int [] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        //for each
        for (int i : vetor) {
            System.out.print(i + " ");
        }

    }

}
