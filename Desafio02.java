package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, soma, sub, mult, divi;		
		
		System.out.println("Digite o valor de A:");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = leia.nextDouble();
		
		soma = (a + b);		
		sub = (a - b);
		mult = (a * b);
		divi = (a / b);
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da subtração: " + sub);
		System.out.println("Resultado da multiplicação: " + mult);
		System.out.println("Resultado da divisão: " + divi);
		
		leia.close();

	}

}
