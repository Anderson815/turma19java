package exercicios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.print("Informe a idade do nadador: ");
		idade = leia.nextInt();
		
		if(idade < 5) System.out.println("É um bebê e portanto não pode ser um nadador");
		else if(idade <= 7) System.out.println("nadador de categoria: Infantil A");
		else if(idade <= 11) System.out.println("nadador de categoria: Infantil B");
		else if(idade <= 13) System.out.println("nadador de categoria: Juvenil A");
		else if(idade <= 17) System.out.println("nadador de categoria: Juvenil B");
		else System.out.println("nadador de categoria: Adulto");
	}
}
