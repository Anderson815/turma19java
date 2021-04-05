package exercicios_para_entregar;

import java.util.Scanner;

public class Ex02 {
	
	public static final int TOTAL = 3;
	
	public static void main(String[] args) {

//		Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		
		int numero[] = new int[TOTAL];
		int ordem[];
		
		for(int contador = 0 ; contador < TOTAL; contador++) {
			System.out.print("digite o " + (contador + 1) + "º número: ");
			numero[contador] = leia.nextInt();
		}
		
		ordem = ordenacao(numero);
		
		System.out.println("");
		System.out.println("NUMEROS DE FORMA CRESCENTE");
		
		for(int contador = TOTAL - 1 ; contador >= 0; contador--) {
			System.out.println(ordem[contador]);
		}
	}
	
	public static int[] ordenacao(int[] numeros) {
		int ordem[] = new int[numeros.length]; 
		
		for(int contadorOrdenacao = 0; contadorOrdenacao < ordem.length; contadorOrdenacao++) {
			
			int maior = 0;
			int posicaoMaior = 0;
			
			for(int contadorAnalise = 0; contadorAnalise < numeros.length; contadorAnalise++) {
				if(maior < numeros[contadorAnalise]) {
					maior = numeros[contadorAnalise];
					posicaoMaior = contadorAnalise;
				}
			}
			
			numeros[posicaoMaior] = -1;			
			ordem[contadorOrdenacao] = maior;
		}
		
		return ordem;
	}
}
