package exercicios;

import java.util.Scanner;

public class Ex02_Enquanto {
	public static void main(String[] args) {
		
//		Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por
//		tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio
//		digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		int novoNumero = 0;
		
		System.out.print("Digite um n�mero para ver a m�gica: ");
		numero = leia.nextInt();
		
		novoNumero = numero;
		
		while(novoNumero < 100) {
			System.out.print(novoNumero + "   ");
			novoNumero *= 3;
		}
		
		if(numero < 100) System.out.print(novoNumero);
		else System.out.print("Voc� j� informou um n�mero maior ou igual a 100");

	}
}
