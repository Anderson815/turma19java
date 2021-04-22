package exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);
		
		int p = 0;
		int e = 0;
		double m = 0.0;
		
		System.out.print("Informe o peso dos tomates em quilos: ");
		p = leia.nextInt();
		
		e = p > 50? p - 50: 0;
		m = e * 4;
		
		System.out.println("\nExcesso: " + e);
		System.out.printf("Multa: R$ %.2f", m);
	}
}
