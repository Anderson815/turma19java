package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String c = "";
		int h = 0;
		
		int horasExcedente = 0;
		double salarioTotal = 0.0; 
		double salarioExcedente = 0.0;
		
		System.out.print("Informe o c�digo do funcion�rio: ");
		c = leia.next();
		
		System.out.print("Informe o numero de horas trabalhadas: ");
		h = leia.nextInt();
		
		horasExcedente = h > 50? h - 50: 0;
		salarioExcedente = horasExcedente * 20;
		
		salarioTotal = horasExcedente > 0? salarioExcedente + 500 : h * 10;
		
		System.out.printf("\nSal�rio total � %.2f", salarioTotal);
		System.out.printf("\nSal�rio excedente � %.2f", salarioExcedente);
	}

}
