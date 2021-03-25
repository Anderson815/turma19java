package exercicios;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		int horas, minutos, segundos, segundosDuracao;

		//Entrada
		System.out.print("Quantos segundos irá durar o evento: ");
		segundosDuracao = leia.nextInt();

		// Processamento
		horas = segundosDuracao / 3600;
		minutos = (segundosDuracao % 3600) / 60;
		segundos = (segundosDuracao % 3600) % 60;

		// Saida
		System.out.print("\nHoras: " + horas);
		System.out.print("\nMinutos: " + minutos);
		System.out.print("\nSegundos: " + segundos);
	}
}
