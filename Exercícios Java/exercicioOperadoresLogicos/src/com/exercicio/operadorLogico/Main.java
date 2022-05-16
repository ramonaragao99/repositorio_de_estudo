package com.exercicio.operadorLogico;

public class Main {
    public static void main(String[] args) {
        boolean i = true;
        boolean ii = false;
        boolean o = true;
        boolean oo = false;

        System.out.println("i && ii: " + (i && ii)); //conjunção (and) o retorna true se todos forem true
        System.out.println("i && o: " + (i && o));

        System.out.println("i || ii: " + (i || ii)); //disjunção (or) tendo pelomenos um true, ira retornar true
        System.out.println("i || o: " + (i || o));

        System.out.println("i ^ ii: " + (i ^ ii)); //disjunção exclusiva (xor) se os dois forem true ira retornar false
        System.out.println("i ^ o: " + (i ^ o));

        System.out.println("!i: " + (!i)); //negação (not)
        System.out.println("!o: " + (!o));

        int b1 = 10;
        int b2 = 84;
        float f1 = 14.84f;
        float f2 = 52.84f;

        System.out.println("((b1 + b2) < (f2 - f1) && true)): " + ((b1 + b2) < (f2 + f1) && true)); //Usando operadores relacionais juntos com lógicos
        System.out.println("((b1 > b2) || (f2 < f1)): " + ((b1 > b2) || (f2 < f1)));

        double salariaMensal = 1100.50;
        double mediaSalario = 1000.50;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salariaMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); //Nao recomendado pois esta grande dms

        boolean salarioBaixo = (salariaMensal < mediaSalario); //melhor criar variáveis ou constantes que armazeman o valor separadametne
        boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebaAuxilio = ((salarioBaixo) && (muitosDependentes)); //assim a linha do codigo fica mais legível e organizada
        System.out.println("Receba o auxilio: " + recebaAuxilio);
    }
}
