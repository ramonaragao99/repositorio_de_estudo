package com.exercicio.colections;

import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> notas = new LinkedList<>();

        System.out.println("Verificar se minha LinkedList está vazia : " + notas.isEmpty());

        System.out.println("\nAdicionando elementos a LinkedList\n");

        notas.add(7.0);
        notas.add(8.5);
        notas.add(0.0);
        notas.add(7.5);
        notas.add(8.0);
        notas.add(9.5);
        notas.add(6.0);

        System.out.println(notas);

        //System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas.getFirst());
        //System.out.println(notas);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: " + notas.peekFirst());
        System.out.println(notas);

        System.out.println("\nMostre a primeira nota da nova lista removendo-a: " + notas.removeFirst());
        System.out.println(notas);
    }
}
