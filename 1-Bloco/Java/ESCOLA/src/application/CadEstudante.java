package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Basico;

public class CadEstudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		char opcao = 0;
		String tipo = "";
		
		do {
			System.out.println("ESCOLA ED+");
			System.out.println("AQUI OU VAI OU VAI MESMO!");
			System.out.println();
			System.out.println("1 - BÁSICO");
			System.out.println("2 - MÉDIO");
			System.out.println("3 - GRADUAÇÃO");
			System.out.println("4 - PÓS");
			System.out.println("5 - MESTRADO");
			System.out.println("6 - SAIR");
			System.out.println();
			System.out.println("\nDIGITE O CODIGO DA OPÇÃO SELECIONADA: ");
			opcao = leia.next().charAt(0);
				
			switch(opcao) {
			case '1':
				//Basico alunoBasico = new Basico();
				break;
			case '2':
				
				break;
			case '3':
				
				break;
			case '4':
				
				break;
			case '5':
				break;
			}
		}while(opcao != '6');
		
		System.out.println("FIM DO PROGRAMA");
		
		System.out.println("ESCOLA ED+");
		System.out.println("AQUI OU VAI OU VAI MESMO!");
		System.out.println();
		System.out.println("ENSINO [TIPO]");
		System.out.println();
		System.out.println("Matricula: ");
		System.out.println("CPF: ");
		System.out.println("Status: 1-Ativa 2-Inativa ");
		System.out.println();
		System.out.println("Média atual :  XXX.XX ");
		System.out.println("MOVIMENTO - I-inclusão de nota ou R-retirada nota: ");
		System.out.println("Valor movimento: ");
		System.out.println("Continuar S/N: ");
	}
}
