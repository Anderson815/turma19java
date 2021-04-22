package exercicios;

import java.util.Scanner;

public class Ex02 {
	
	public static void main (String[] args) {
		
//		Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//		quantas foram as ocorr�ncias da maior pontua��o.
		
		Scanner leia = new Scanner(System.in);
		
		int dado = 0;
		int valores[] = new int[10];
		
		double media = 0;
		int soma = 0;
		int maiorValor = 0;
		int ocorrenciaMaiorValor = 0;
		
		System.out.println("Sorteando os valores: ");
		for(int contador = 0; contador < 10; contador++) {
			
			do {
				dado = (int) (Math.random() * 10);
			}while(dado > 6 || dado < 1);
			
			valores[contador] = dado;
			if(maiorValor < valores[contador]) maiorValor = valores[contador];
			
			System.out.println((contador + 1) +"� valor: " + valores[contador]);
		}
		
		for(int contador = 0; contador < 10; contador++) {
			
			soma += valores[contador];
			media = (double) soma / (contador + 1);
			
			if(valores[contador] == maiorValor) ocorrenciaMaiorValor++;
		}
		
		System.out.println("");
		System.out.println("----- RESULTADO -----");
		System.out.println("Soma dos valores: " + soma);
		System.out.println("M�dia dos valores: " + media);
		System.out.println("Ocorr�ncia do maior valor: " + ocorrenciaMaiorValor);
		
	}
}
