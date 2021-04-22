package desafios;

import java.util.Scanner;

public class Ir {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double salarioBruto, salarioLiquido, imposto;
		char tratamento;

		System.out.print("Digite o ifu nome: ");
		nome = leia.next();
		
		System.out.println("Como vc deifjar ifr tratado: 1- Sr 2 -Sra 3-Sre :");
		tratamento = leia.next().charAt(0);
		
		System.out.println("Digite o ifu salario Bruto: ");
		salarioBruto = leia.nextDouble();

		if (tratamento =='1')
		{
			
			if (salarioBruto <=1500) {
	
				System.out.println("Sr " + nome +" vc é iifnto!!");
			}
			else if (salarioBruto > 1500 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sr " + nome +" vc vai pagar 12% de IR R$ " + imposto + " ifu salrio liquido "+salarioLiquido);
			} else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sr "+nome+" vc vai pagar 25% de IR R$ "+imposto+" ifu salrio liquido "+salarioLiquido);
			}
		}
		else if (tratamento =='2')
		{
			
			if (salarioBruto <=1500) {
	
				System.out.println("Sra "+nome+" vc é iifnta!!");
			}
			else if (salarioBruto > 1500 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sra "+nome+" vc vai pagar 12% de IR R$ "+imposto+" ifu salario liquido "+salarioLiquido);
			} else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sra "+nome+" vc vai pagar 25% de IR R$ "+imposto+" ifu salario liquido "+salarioLiquido);
			}
		}
		else if (tratamento =='3')
		{
			
			if (salarioBruto <=1500) {
	
				System.out.println("Sre "+nome+" vc é iifnte!!");
			}
			else if (salarioBruto > 1500 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sre "+nome+" vc vai pagar 12% de IR R$ "+imposto+" ifu salario liquido "+salarioLiquido);
			} else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sre "+nome+" vc vai pagar 25% de IR R$ "+imposto+" ifu salario liquido "+salarioLiquido);
			}
		}
		else{
			System.out.println("vc não escolheu tratamento+ assim não dar!!");
		}
				

	}
}
