package exercicios_para_entregar;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
//		Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//		�mpar exiba o n�mero elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("digite um n�mero: ");
		numero = leia.nextInt();
		
		System.out.println("");
		
		if(numero > 0) {
			
			if(numero % 2 == 0) {
				double raiz = Math.sqrt(numero);
				
				System.out.println("O n�mero " + numero + " � par e a raiz quadrada dele � " + raiz);
			}else {
				double potencia = Math.pow(numero, 2);
				
				System.out.println("O n�mero " + numero + " � impar e esse n�mero ao quadrado � " + potencia);
			}
			
		}else if(numero < 0) System.out.println("ERRO: N�mero negativo");
		else System.out.println("ERRO: N�mero 0 � neutro");
	}

}
