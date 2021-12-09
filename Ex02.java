package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, meses, dias, tdias;
		
		System.out.println("Digite a sua idade em dias: ");
		tdias = leia.nextInt();
		
		idade = (tdias/365);
		meses = (tdias%365)/30;
		dias = (tdias%365)%30;
		
		System.out.println("Você tem: " + idade + " anos");
		System.out.println();
		System.out.println("Você nasceu no mês: " + meses);
		System.out.println();
		System.out.println("No dia: " + dias);
		
		leia.close();
	}

}
