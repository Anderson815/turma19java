package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static final int LINHA = 4;
	public static final int COLUNA = 6;
	
	public static void main (String[] args) {
		
//		Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//			das matrizes N1 e N2;
//			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//			posição das matrizes N1 e N2.
		
		Scanner leia = new Scanner(System.in);
		
		int valor = 0;
		
		int n1[][] = new int[LINHA][COLUNA];
		int n2[][] = new int[LINHA][COLUNA];
		
		int m1[][] = new int[LINHA][COLUNA];
		int m2[][] = new int[LINHA][COLUNA];
		
		System.out.println("MATRIZ N1:");
		for(int contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			System.out.println("\tLinha " + contadorLinha);
			for(int contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				System.out.print("\t\tColuna " + contadorColuna + ": ");
				valor = leia.nextInt();
				n1[contadorLinha][contadorColuna] = valor;
			}
		}
		
		System.out.println("\nMATRIZ N2:");
		for(int contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			System.out.println("\tLinha " + contadorLinha);
			for(int contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				System.out.print("\t\tColuna " + contadorColuna + ": ");
				valor = leia.nextInt();
				n2[contadorLinha][contadorColuna] = valor;
			}
		}
		
		System.out.println("\n----- RESULTADOS -----");
		
		System.out.println("\nMATRIZ M1(N1 + N2):");
		for(int contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			System.out.println("\tLinha " + contadorLinha);
			for(int contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				m1[contadorLinha][contadorColuna] = n1[contadorLinha][contadorColuna] + n2[contadorLinha][contadorColuna];
				System.out.println("\t\tColuna " + contadorColuna + ": " + m1[contadorLinha][contadorColuna]);
			}
		}
		
		System.out.println("\nMATRIZ M2(N1 - N2):");
		for(int contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			System.out.println("\tLinha " + contadorLinha);
			for(int contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				m2[contadorLinha][contadorColuna] = n1[contadorLinha][contadorColuna] - n2[contadorLinha][contadorColuna];
				System.out.println("\t\tColuna " + contadorColuna + ": " + m2[contadorLinha][contadorColuna]);
			}
		}
	}
}
