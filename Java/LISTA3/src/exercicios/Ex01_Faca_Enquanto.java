package exercicios;

import java.util.Scanner;

public class Ex01_Faca_Enquanto {
	public static void main(String[] args) {
	
//		Faça um programa que mostre uma contagem na tela de 233 a 456, só que
//		contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		
		int contagem = 233;
		
		do {
			System.out.print(contagem + "   ");
			if(contagem >= 300 && contagem <= 400) contagem += 3;
			else contagem += 5;
		}while(contagem <= 456);
	}
}
