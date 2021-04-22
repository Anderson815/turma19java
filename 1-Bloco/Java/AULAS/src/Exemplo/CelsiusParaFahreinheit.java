package Exemplo;

import java.util.Scanner;

public class CelsiusParaFahreinheit {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Variáveis
		String nome;
		double celsius;
		double fahrenheit;
	
		// Entrada
		System.out.print("Digite o seu nome: ");
		nome = leitor.next();
	
		System.out.print("Digite a temperatura celsius: ");
		celsius = leitor.nextDouble();
	
		// Processo
		fahrenheit = (celsius * (9/5)) + 32;
	
		// Saida
		System.out.println("Oi " + nome + ". " + celsius + "º Celsius convertido para o Fahrenheit é " + fahrenheit);

	}
}
