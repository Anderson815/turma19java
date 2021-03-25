package exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		//Variáveis
		int anos, meses, dias, diasTotaisVividos;

		//Entrada
		System.out.print("Quantos dias você viveu: ");
		diasTotaisVividos = leia.nextInt();

		// Processamento
		anos = diasTotaisVividos / 365;
		meses = (diasTotaisVividos % 365) / 30;
		dias = ((diasTotaisVividos % 365) % 30);

		// Saida
		System.out.print("\nAnos: " + anos);
		System.out.print("\nMeses: " + meses);
		System.out.print("\ndias: " + dias);
		
	}
}
