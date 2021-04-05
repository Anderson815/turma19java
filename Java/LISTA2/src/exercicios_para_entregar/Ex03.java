package exercicios_para_entregar;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

//		Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//		categoria ela se encontra:
//		* 10-14 infantil
//		* 15-17 juvenil
//		* 18-25 adulto
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		String categoria = "";
		
		System.out.print("digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) categoria = "infantil";
		else if(idade >= 15 && idade <= 17) categoria = "juvenil";
		else if(idade >= 18 && idade <= 25) categoria = "adulto";
		else categoria = "categoria indefinida";
		
		System.out.println("");
		System.out.println("Sua categoria: " + categoria);
	}
}
