package exercicios;

import java.util.Scanner;

public class Ex01 {

		
	public static void main (String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		int anos, meses, dias, diasTotaisVividos;

		//Entrada
		System.out.print("Quantos anos você tem: ");
		anos = leia.nextInt();

		System.out.print("Quantos meses você tem: ");
		meses = leia.nextInt();

		System.out.print("Quantos dias você tem: ");
		dias = leia.nextInt();

		// Processamento
		diasTotaisVividos = anos * 365 + meses * 30 + dias;

		// Saida
		System.out.print("\nVocê viveu até agora " + diasTotaisVividos + " dias");
	}

}
