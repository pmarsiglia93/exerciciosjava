package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int galoes;
		double litros;
		
		System.out.println("Digite a quantidade de gal�es: ");
		galoes = leia.nextInt();
		
		litros = (galoes * 3.785);
		
		System.out.println(galoes + " Gal�es s�o: " + litros + " litros.");
		
		leia.close();

	}

}
