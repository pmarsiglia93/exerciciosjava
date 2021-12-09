package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int horas, minutos, segundos, seg;
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = leia.nextInt();
		
		horas = (segundos/3600);
		minutos = (segundos%3600)/60;
		seg = (segundos%3600)%60;
		
		System.out.println();
		System.out.println("O EVENTO TEM:");
		System.out.println();
		System.out.println("Horas: " + horas);
		System.out.println();
		System.out.println("Minutos: " + minutos);
		System.out.println();
		System.out.println("Segundos: " + seg);
		
		leia.close();
		
	}

}
