package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("CADASTRO DE FUNCIONÁRIOS - PAGAMENTOS");
		System.out.print("Quantos funcionários serão cadastrados: ");
		int qtde = leia.nextInt();
		
		for(int contador = 1; contador <= qtde; contador++) {
			System.out.println();
			System.out.println("Funcionário: " + contador);
			System.out.print("Digite 1 Funcionário ou 2 - Terceiro: ");
			char tipo = leia.next().charAt(0);
			
			System.out.print("Digite a matrícula: ");
			String matricula = leia.next();
			System.out.print("Digite o nome: ");
			String nome = leia.next();
			System.out.print("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Digite o valor por hora: ");
			double valorHora = leia.nextDouble();
			
			if(tipo == '2') {
				System.out.print("Digite o adicional: ");
				double adicional = leia.nextDouble();
				
				Terceiro colaborador = new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional);
				lista.add(colaborador);
			}else if(tipo == '1'){
				
				Funcionario colaborador = new Funcionario(matricula, nome, horasTrabalhadas, valorHora);
				lista.add(colaborador);
			}
			
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		
		for(Funcionario func: lista) {
			System.out.println();
			System.out.println("matricula: " + func.getMatricula());
			System.out.println("nome: " + func.getNome());
			System.out.println("Horas: " + func.getHorasTrabalhadas());
			System.out.println("Valor hora: " + func.getValorHora());
			System.out.println("salário: " + func.salario());
		}
		
		/*
		Funcionario func1 = new Funcionario("AAA", "Anderson", 10, 5.5);
		Terceiro func2 = new Terceiro("BBB", "Bianca", 50, 15, 150);
		
		System.out.println("matricula: " + func1.getMatricula());
		System.out.println("nome: " + func1.getNome());
		System.out.println("Horas: " + func1.getHorasTrabalhadas());
		System.out.println("Valor hora: " + func1.getValorHora());
		System.out.println("salário: " + func1.salario());
		System.out.println();
		System.out.println("matricula: " + func2.getMatricula());
		System.out.println("nome: " + func2.getNome());
		System.out.println("Horas: " + func2.getHorasTrabalhadas());
		System.out.println("Valor hora: " + func2.getValorHora());
		System.out.println("salário: " + func2.salario());
		System.out.println();
		
		func1.salario();
		*/
		
	}
}
