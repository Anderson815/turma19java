package ex06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int valor = 0;
		
		Scanner leia = new Scanner(System.in);
		
		Conta conta1 = new Conta();
		
		System.out.print("Informe o nome: ");
		conta1.setNome(leia.next());
		
		System.out.print("Informe o CPF: ");
		conta1.setCpf(leia.next());
		
		conta1.estado();
		
		conta1.creditar(150);;
		
		conta1.estado();
		
		conta1.debitar(50);;
		
		conta1.estado();
		
	}

}
