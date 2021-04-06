package exercicios_para_entregar;

import java.util.Scanner;

public class EX03_WHILE {
	public static void main(String[] args) {
		
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		   21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	       idade for =-99. (WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);

		int idade = 0;
		int pessoaMenos20 = 0;
		int pessoaMais50 = 0;
		
		while(idade != -99) {
			System.out.print("Informe a idade: ");
			idade = leia.nextInt();
			
			System.out.println();
			
			if(idade > 0 && idade < 21) pessoaMenos20++;
			if(idade > 50) pessoaMais50++;
		
		}
		
		System.out.println();
		System.out.println("RESULTADOS");
		
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + pessoaMenos20);
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + pessoaMais50);
	}
}
