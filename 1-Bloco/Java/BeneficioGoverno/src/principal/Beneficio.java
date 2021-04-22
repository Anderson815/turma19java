package principal;

import java.util.Scanner;

public class Beneficio {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String ultimoAuxilio = "";
		String chefaFamilia = "";
		String bolsaFamilia = "";
		int filhos = 0;
		
		double dinheiro = 0.0;
		
		System.out.println("---- AUXÍLIO EMERGENCIAL 2 -----");
		
		System.out.print("Você recebeu o último auxílio? (Sim = s ou Não = n): ");
		ultimoAuxilio = leia.next();
		
		System.out.print("Você recebe o bolsa família? (Sim = s ou Não = n): ");
		bolsaFamilia = leia.next();
		
		System.out.print("Você é chefa de família? (Sim = s ou Não = n): ");
		chefaFamilia = leia.next();
		
		System.out.print("Você tem quantos filhos?: ");
		filhos = leia.nextInt();
		
		dinheiro =  50 * filhos;
				
		if(ultimoAuxilio.equals("s") && chefaFamilia.equals("s") && bolsaFamilia.equals("n")) {
			dinheiro += 600;
			System.out.println("\nVocê tem direito ao segundo auxílio de R$ " + dinheiro);
		}else if(ultimoAuxilio.equals("s") && chefaFamilia.equals("n") && bolsaFamilia.equals("n")){
			dinheiro += 300;
			System.out.println("\nVocê tem direito ao segundo auxílio de R$ " + dinheiro);
		}else {
			System.out.println("\nVocê não tem direito ao segundo auxílio");
		}
		
		System.out.println("Fim do programa");
	}
}
