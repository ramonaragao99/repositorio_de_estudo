package com.dio.PrimeiraCalculadora;

import java.util.Scanner;

public class PrimeiraCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		
		double soma = soma(a, b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A subtrcao dos números é: " + subtracao);
		System.out.println("A multiplicacao dos números é: " + multiplicacao);
		System.out.println("A divisão dos números é: " + divisao);
		
		
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
}
