package exercicios;

import java.util.Scanner;

public class Ex02_Faca_Enquanto {
	public static void main(String[] args) {

//		Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
//		n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois
//		1+2+3+4+5+6+7=28.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		int contador = 0;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		contador = numero;
		
		do {
			soma += contador;
			contador--;
		}while(contador > 0);
		
		System.out.println("A soma dos n�mero at� o valor que voc� informou � " + soma);
	}
}
