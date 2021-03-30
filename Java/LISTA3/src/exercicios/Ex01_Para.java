package exercicios;

import java.util.Scanner;

public class Ex01_Para {
	
	public static final int habitantes = 4;
	
	public static void main(String[] args) {
	
//		A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//		coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
//		a) média do salário da população;
//		b) média do número de filhos;
//		c) maior salário;
//		d) percentual de pessoas com salário até R$100,00.
		
		Scanner leia = new Scanner(System.in);
		
		//Input
		double salario = 0.0;
		int filhos = 0;
		
		//Dados
		double mediaSalario = 0.0;
		int mediaFilhos = 0;
		double maiorSalario = 0.0;
		double porcentagemAte100 = 0.0;
		
		//Auxiliares
		double totalSalario = 0.0;
		int totalFilhos = 0;
		double totalPorcentagemAte100 = 0.0;		
		
		for(int contador = 0; contador < habitantes; contador++) {
			System.out.println("----- " + (contador + 1) + "º HABITANTE -----");
			
			System.out.print("Informe o salário: ");
			salario = leia.nextDouble();
			
			System.out.print("Informe a quantidade de filhos: ");
			filhos = leia.nextInt();
			
			totalSalario += salario;
			totalFilhos += filhos;
			
			if(maiorSalario < salario) maiorSalario = salario;
			if(salario < 100.00) totalPorcentagemAte100++;
			
			System.out.println("");
		}
		
		mediaSalario = totalSalario / habitantes;
		mediaFilhos = (int) (totalFilhos / habitantes);
		porcentagemAte100 = (totalPorcentagemAte100 / habitantes) * 100;
		
		System.out.println("----- RESULTADO DA PESQUISA -----");
		System.out.println("Média salarial: " + mediaSalario);
		System.out.println("Média de filhos: " + mediaFilhos);
		System.out.println("Maior salário: " + maiorSalario);
		System.out.println("Porcentagem das pessoas que ganham até R$ 100,00: " + porcentagemAte100 + "%");
	}
}
