package exercicios;

import java.util.Scanner;

public class Ex01_Para {
		
	public static void main(String[] args) {
	
//		A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//		coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:��
//		a) m�dia do sal�rio da popula��o;
//		b) m�dia do n�mero de filhos;
//		c) maior sal�rio;
//		d) percentual de pessoas com sal�rio at� R$100,00.
		
		Scanner leia = new Scanner(System.in);
		
		final int habitantes = 4;
		
		//Input
		double salario = 0.0;
		int filhos = 0;
		
		//Dados
		double mediaSalario = 0.0;
		double mediaFilhos = 0.00;
		double maiorSalario = 0.0;
		double porcentagemAte100 = 0.0;
		
		//Auxiliares
		double totalSalario = 0.0;
		int totalFilhos = 0;
		double totalPorcentagemAte100 = 0.0;		
		
		for(int contador = 0; contador < habitantes; contador++) {
			System.out.println("----- " + (contador + 1) + "� HABITANTE -----");
			
			System.out.print("Informe o sal�rio: ");
			salario = leia.nextDouble();
			
			System.out.print("Informe a quantidade de filhos: ");
			filhos = leia.nextInt();
			
			totalSalario += salario;
			totalFilhos += filhos;
			
			if(maiorSalario < salario) maiorSalario = salario;
			if(salario < 100.00) totalPorcentagemAte100++;
			
			System.out.println("");
		}
		
		mediaSalario = totalSalario / (double) habitantes;
		mediaFilhos = totalFilhos / (double) habitantes;
		porcentagemAte100 = (totalPorcentagemAte100 / habitantes) * 100;
		
		System.out.println("----- RESULTADO DA PESQUISA -----");
		System.out.println("M�dia salarial: " + mediaSalario);
		System.out.println("M�dia de filhos: " + mediaFilhos);
		System.out.println("Maior sal�rio: " + maiorSalario);
		System.out.println("Porcentagem das pessoas que ganham at� R$ 100,00: " + porcentagemAte100 + "%");
	}
}
