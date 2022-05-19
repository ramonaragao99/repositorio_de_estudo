package com.exercicio.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5,-6,15,50,8,4};

        System.out.println("Conteúdo de cada vetor: ");
        int count = 0;

        while (count < (vetor.length)) {
            System.out.println(vetor[count]);
            count ++;
        }

        System.out.println("\nVetor em ondem inversa: ");

        for (int i = (vetor.length -1); i >=0 ; i-- ){
            System.out.println(i);
        }
    }
}
