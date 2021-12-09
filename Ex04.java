package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		double r, s, d;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		
		d = (r + s)/2;
		
		System.out.println("O valor de R é: " + r);
		System.out.println("O valor de S é: " + s);
		System.out.println("O valor de D é: " + d);
		
		leia.close();
		
	}

}
