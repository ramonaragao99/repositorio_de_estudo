package com.dio.PrimeiraCalculadora;

import java.util.Scanner;

public class PrimeiraCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = scan.nextInt();
		
		double soma = soma(a, b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("A soma dos n�meros �: " + soma);
		System.out.println("A subtrcao dos n�meros �: " + subtracao);
		System.out.println("A multiplicacao dos n�meros �: " + multiplicacao);
		System.out.println("A divis�o dos n�meros �: " + divisao);
		
		
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
