package br.com.generation.exercicios0812;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double cc, vf;
		double dis;
		double imp;
				
		System.out.println("Qual o custo de f�brica do ve�culo?");
		vf = leia.nextDouble();
		
		dis = (vf * 0.28);
		imp = (vf * 0.45);
				
		cc = (vf + dis + imp);		
		System.out.println("O valor pago pelo consumidor �: " + cc);
		
		leia.close();

	}

}
