package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int ano, mes, dia, soma;
		
		System.out.println("Quantos anos voc� tem? ");	
		ano = leia.nextInt();
		
		System.out.println("De 1 a 12 qual o m�s do seu anivers�rio? ");	
		mes = leia.nextInt();
		
		System.out.println("Qual o dia do seu anivers�rio? ");	
		dia = leia.nextInt();
		
		soma = (ano*365) + (mes*30) + (dia*1);
		System.out.println("Voc� tem aproximadamente " + soma + " dias de vida.");
		
		leia.close();
		
	}

}
