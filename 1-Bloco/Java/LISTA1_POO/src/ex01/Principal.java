package ex01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.print("Informe o nome: ");
		cliente1.setNome(leia.next());
		
		System.out.print("Informe o CPF: ");
		cliente1.setCpf(leia.next());
		
		System.out.print("Informe o RG: ");
		cliente1.setRg(leia.next());
		
		System.out.print("Informe o sexo: ");
		cliente1.setSexo(leia.next());
		
		System.out.print("Informe o telefone: ");
		cliente1.setTelefone(leia.next());
		
		System.out.print("Informe o celular: ");
		cliente1.setCelular(leia.next());
		
		System.out.print("Informe o e-mail: ");
		cliente1.setEmail(leia.next());
		
		System.out.print("------------------------");
		
		cliente1.estado();
		
	}
}
