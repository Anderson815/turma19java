package exercicios;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n[] = new double[4];
		double qn[] = new double[4];
		
		for(int contador = 0; contador < n.length; contador++){
			System.out.print("Digite o " + (contador + 1) + "� n�mero: ");
			n[contador] = leia.nextDouble();
			qn[contador] = Math.pow(n[contador], 2); 
		}
		
		if(qn[2] >= 1000) System.out.println("\nO quadrado do terceiro n�mero � maior ou igual a 1000");
		else {
			System.out.println();
			for(int contador = 0; contador < n.length; contador++) {
				System.out.println((contador + 1) + "� n�mero: " + n[contador] + " ao quadrado � " + qn[contador]);
			}
		}
		
	}
}
