package com.exercicio.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int fatorial = scan.nextInt();

        int multiplicador = 1;

        System.out.println(fatorial +"! = ");
        for (int i = fatorial ; i >= 1 ; i-- ){
            multiplicador = multiplicador * i;
        }
        System.out.println(multiplicador);
    }
}
