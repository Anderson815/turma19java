package exercicios_para_entregar;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

//		Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		int maior = 0;
		
		System.out.print("digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.print("digite o primeiro n�mero: ");
		n2 = leia.nextInt();
		
		System.out.print("digite o primeiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) maior = n1;
		else if(n2 > n1 && n2 > n3) maior = n2;
		else if(n3 > n1 && n3 > n2) maior = n3;
		
		System.out.println("");
		System.out.print("O maior n�mero digitado � " + maior);
	}
}
