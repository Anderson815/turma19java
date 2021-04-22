package desafios;

import java.util.Scanner;

public class CadastroBase {

	public static void main(String[] args) {

		
		
		Scanner leia = new Scanner(System.in);
		
		String nome1 = "";
		String nome2 = "";
		int ano1 = 0;
		int ano2 = 0;
		char opcao = 0;
		String genero1 = "";
		String genero2 = "";
		String mensagem1 = "";
		String mensagem2 = "";
		
		int idade1 = 0;
		int idade2 = 0;
		
		//primeira pessoa
		System.out.print("Digite o nome: ");
		nome1 = leia.next();
		
		System.out.print("Digite o ano de nascimento: ");
		ano1 = leia.nextInt();
		
		System.out.print("Digite o genênero [1 - Feminino | 2 - Masculino | 3 - Outros]:  ");
		opcao = leia.next().charAt(0);
		switch(opcao) {
			case '1':
				genero1 = "Feminino";
				break;
			case '2':
				genero1 = "Masculino";
				break;
			case '3':
				genero1 = "Outros";
				break;
		}
		
		System.out.println();
		
		//Segunda pessoa
		System.out.print("Digite o nome: ");
		nome2 = leia.next();
		
		System.out.print("Digite o ano de nascimento: ");
		ano2 = leia.nextInt();
		
		System.out.print("Digite o genênero [1 - Feminino | 2 - Masculino | 3 - Outros]: ");
		opcao = leia.next().charAt(0);
		switch(opcao) {
			case '1':
				genero2 = "Feminino";
				break;
			case '2':
				genero2 = "Masculino";
				break;
			case '3':
				genero2 = "Outros";
				break;
		}
		
		if(ano1 < ano2) {
			mensagem1 = "Mais velho";
			mensagem2 = "Mais novo";
		}else if(ano1 > ano2) {
			mensagem1 = "Mais novo";
			mensagem2 = "Mais velho";		
		}else {
			mensagem1 = "Mesma idade";
			mensagem2 = "Mesma idade";	
		}
		
		//Saida
		 	
		System.out.println();
		System.out.println("Nome: " + nome1 + "\nGenero: " + genero1 + "\nAno Nasc.: " + ano1 + "\nMensagem: " + mensagem1);
		System.out.println();
		System.out.println("Nome: " + nome2 + "\nGenero: " + genero2 + "\nAno Nasc.: " + ano2 + "\nMensagem: " + mensagem2);
		
		
	}
	
}
