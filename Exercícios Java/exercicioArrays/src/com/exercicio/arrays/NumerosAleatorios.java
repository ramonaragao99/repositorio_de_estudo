package com.exercicio.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("\nAntecessor dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero - 1) + " ");
        }

        System.out.println("\nSucessor os números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 2) + " ");
        }

        System.out.println("\nPares dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            if (numero % 2 == 0) {
                System.out.println(numero + " ");
            }
        }

        System.out.println("\nImpares dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            if (numero % 2 != 0) {
                System.out.println(numero + " ");
            }
        }
    }
}