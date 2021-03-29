package exercicios;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		
		if(numero > 100) System.out.println("\nO número é " + numero);
		else System.out.println("\nO valor é 0");
	}
}
