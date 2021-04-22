package exercicios;

import java.util.Scanner;

public class Ex01_Enquanto {
	public static void main(String[] args) {
		
//		Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//		apresente no final o total do somatório, a média e o total de valores lidos. O programa
//		deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
//		negativo.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		int somatorio = 0;
		int media = 0;
		int totalValores = 0;
		
		while(numero >= 0) {
			System.out.print("Digite um valor: ");
			numero = leia.nextInt();
			
			if(numero < 0) break;
			else {
				somatorio += numero;
				totalValores++;
				media = somatorio / totalValores;
			}
		}
		
		System.out.println("");
		System.out.println("----- INFORMAÇÕES -----");
		System.out.println("Somatório: " + somatorio);
		System.out.println("Quantidade de valores digitados: " + totalValores);
		System.out.println("Média dos valores: " + media);
	}
}
