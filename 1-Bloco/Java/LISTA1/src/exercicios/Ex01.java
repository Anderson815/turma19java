package exercicios;

import java.util.Scanner;

public class Ex01 {

		
	public static void main (String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		int anos, meses, dias, diasTotaisVividos;

		//Entrada
		System.out.print("Quantos anos voc� tem: ");
		anos = leia.nextInt();

		System.out.print("Quantos meses voc� tem: ");
		meses = leia.nextInt();

		System.out.print("Quantos dias voc� tem: ");
		dias = leia.nextInt();

		// Processamento
		diasTotaisVividos = anos * 365 + meses * 30 + dias;

		// Saida
		System.out.print("\nVoc� viveu at� agora " + diasTotaisVividos + " dias");
	}

}
