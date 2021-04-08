package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		GerenciadorProduto gerenciador = new GerenciadorProduto();
		Scanner leia = new Scanner(System.in);
		String op = "";
		
		do {
			System.out.println();
			System.out.println("---- MENU ESTOQUE PRODUTOS -----");
			System.out.println("1 - Armazenar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Remover");
			System.out.println("4 - Apresentar todos os produtos");
			System.out.println("5 - Sair");
			System.out.println("Qual operação você deseja realizar?[numeros]: ");
			op = leia.next();
			
			switch(op) {
				case "1":
					gerenciador.armazenar();
					break;
				case "2":
					gerenciador.atualizar();
					break;
				case "3":
					gerenciador.remover();
					break;
				case "4":
					gerenciador.apresentarLista();
					break;
			}
			
		}while(!op.equals("5"));
		
	}
	
}
