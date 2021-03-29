package exercicios;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double base = 0.0;
		double altura = 0.0;
		
		System.out.print("Informe a base do triângulo: ");
		base = leia.nextDouble();
		
		System.out.print("Informe a altura do triângulo: ");
		altura = leia.nextDouble();
		
		System.out.println();
		if(base > 0 && altura > 0) {
			
			double area = (base * altura) / 2;
			System.out.println("A área do triângulo é " + area);
			
		}else System.out.println("Algum dos valores não são válidos");
	}
}
