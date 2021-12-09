package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, y1, x2, y2;
		double d;
		double p1,p2;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância entre os dois pontos é: " + d);
		
		leia.close();

	}

}
