package com.exercicio.loops;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = null;
        int idade = 0;

        while (true){
            System.out.println("nome: ");
            nome = scan.next();
            if (nome.equals("Ramon")) break;

            System.out.println("idade: ");
            idade = scan.nextInt();
        }
    }
}
