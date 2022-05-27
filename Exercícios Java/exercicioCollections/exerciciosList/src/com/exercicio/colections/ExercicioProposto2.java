package com.exercicio.colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> Perguntas = new ArrayList<>();

        System.out.println("Irão começar as perguntas !\n");

        System.out.println("Telefonou para a vitima ?\n1 - sim\n2 - não");

        int Pergunta1 = sc.nextInt();
        if (Pergunta1 == 1){
            Perguntas.add(Pergunta1);
        } else Perguntas.add(Pergunta1);

        System.out.println("Esteve no local do crime?\n1 - sim\n2 - não");

        int Pergunta2 = sc.nextInt();
        if (Pergunta2 == 1){
            Perguntas.add(Pergunta2);
        } else Perguntas.add(Pergunta2);

        System.out.println("Mora perto da vítima?\n1 - sim\n2 - não");

        int Pergunta3 = sc.nextInt();
        if (Pergunta3 == 1){
            Perguntas.add(Pergunta3);
        } else Perguntas.add(Pergunta3);

        System.out.println("Devia para a vítima?\n1 - sim\n2 - não");

        int Pergunta4 = sc.nextInt();
        if (Pergunta4 == 1){
            Perguntas.add(Pergunta4);
        } else Perguntas.add(Pergunta4);

        System.out.println("Já trabalhou com a vítima?\n1 - sim\n2 - não");

        int Pergunta5 = sc.nextInt();
        if (Pergunta5 == 1){
            Perguntas.add(Pergunta5);
        } else Perguntas.add(Pergunta5);

        Iterator<Integer> Next = Perguntas.iterator(); //Eu poderia usar o metodo cotains("atribuir a string")
        //caso eu estivesse trabalhando com Strings. DISCORRER A LOGICA EM CIMA DISSO.
        int count = 0;
        while (Next.hasNext()){
            Integer Next1 = Next.next();
            if (Next1 == 1){
                count++;
            }
        }

        switch (count){
            case(0):
            case(1):
                System.out.println("Declarado Inocente !");
                break;
            case(2):
                System.out.println("Você esta Suspeito !");
                break;
            case(3):
            case(4):
                    System.out.println("Declaro você Cumplice !");
                break;
            case(5):
                System.out.println("Você é um Assasino !");
                break;
        }

    }
}
