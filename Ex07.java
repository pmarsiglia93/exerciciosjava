package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a1, b1, c1, d1, e1, f1;
		double x, y;
		
		System.out.println("Digite o Valor de A");
		a1 = leia.nextInt();
		
		System.out.println("Digite o Valor de B");
		b1 = leia.nextInt();
		
		System.out.println("Digite o Valor de C");
		c1 = leia.nextInt();
		
		System.out.println("Digite o Valor de D");
		d1 = leia.nextInt();
		
		System.out.println("Digite o Valor de E");
		e1 = leia.nextInt();
		
		System.out.println("Digite o Valor de F");
		f1 = leia.nextInt();
		
		x = ((c1*e1) - (b1*f1)) / ((a1*e1) - (b1*d1));
		System.out.println("O valor de X é: " + x);
		
		y = ((a1*f1) - (c1*d1)) / ((a1*e1) - (b1*d1));
		System.out.println("O valor de Y é: " + y);
		
		leia.close();

	}

}
