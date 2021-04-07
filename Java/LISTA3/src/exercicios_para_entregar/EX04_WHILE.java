package exercicios_para_entregar;

import java.util.Scanner;

public class EX04_WHILE {
	public static void main(String[] args) {
		
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		   psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		   era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		   (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		   agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		   pessoas, calcule e mostre: (WHILE)
		 * o número de pessoas calmas;
		 * o número de mulheres nervosas;
		 * o número de homens agressivos;
		 * o número de outros calmos;
		 * o número de pessoas nervosas com mais de 40 anos;
		 * o número de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner leia = new Scanner(System.in);

		final int limitePessoas = 5;
		int pessoa = 1;
		
		int idade = 0;
		String sexo = "";
		String opcao = "";
		
		int[][] matriz = new int[3][3];
		
		System.out.print("Informe a idade: ");
		idade = leia.nextInt();
		
		while(pessoa <= limitePessoas && idade > 0) {
			
			if(pessoa > 1) {
				System.out.print("Informe a idade: ");
				idade = leia.nextInt();
			}
			
			if(idade > 0) {
				System.out.print("Informe o sexo [1 - Feminino | 2 - Masculino | 3 - Outros] : ");
				sexo = leia.next();
				
				System.out.print("Informe a opcao [1 - Calma | 2 - Nervosa | 3 - Agressiva] : ");
				opcao = leia.next();
				
				System.out.println();
				
				matriz[Integer.parseInt(sexo) - 1][Integer.parseInt(opcao) -1]++;
				
				pessoa++;
			}
		}
		
		System.out.println();
		
		
		
		System.out.println();
		System.out.println("FIM DE PROGRAMA");
	}
}
