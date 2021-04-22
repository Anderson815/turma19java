package desafios;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String[] nome = new String[4];
		double[] nota = new double[4];
		String[] status = new String[4];
		
		for(int contador = 0; contador < nome.length; contador++){
			System.out.print("Digite o nome: ");
			nome[contador] = leia.next();
			
			System.out.print("Digite a nota: ");
			nota[contador] = leia.nextDouble();
			
			if(nota[contador] <= 5) status[contador] = " ainda não ";
			else status[contador] = " muito bem ";
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("STATUS");
		
		for(int contador = 0; contador < nome.length; contador++){
			System.out.println(nome[contador] + " : " + status[contador]);
		}
		
	}
}
