package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, media, mediaf;
		
		System.out.println("Digite N1");
		n1 = leia.nextDouble();
		
		System.out.println("Digite N2");
		n2 = leia.nextDouble();
		
		System.out.println("Digite N3");
		n3 = leia.nextDouble();
		
		media = (n1*2) + (n2*3) + (n3*5);
		mediaf = media/10;
		
		System.out.println("A média final é: " + mediaf);		
		
		leia.close();

	}

}
