package desafios;

import java.util.Scanner;

public class Variaveis {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		int c = 0;
		
		System.out.print("Digite o valor A: ");
		a = teclado.nextInt();
		c = a;
		
		System.out.print("Digite o valor B: ");
		b = teclado.nextInt();
		
		a = b;
		b = c;	
		
		System.out.println("");
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
			
	}
}
