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
		
		System.out.println("---- AUX�LIO EMERGENCIAL 2 -----");
		
		System.out.print("Voc� recebeu o �ltimo aux�lio? (Sim = s ou N�o = n): ");
		ultimoAuxilio = leia.next();
		
		System.out.print("Voc� recebe o bolsa fam�lia? (Sim = s ou N�o = n): ");
		bolsaFamilia = leia.next();
		
		System.out.print("Voc� � chefa de fam�lia? (Sim = s ou N�o = n): ");
		chefaFamilia = leia.next();
		
		System.out.print("Voc� tem quantos filhos?: ");
		filhos = leia.nextInt();
		
		dinheiro =  50 * filhos;
				
		if(ultimoAuxilio.equals("s") && chefaFamilia.equals("s") && bolsaFamilia.equals("n")) {
			dinheiro += 600;
			System.out.println("\nVoc� tem direito ao segundo aux�lio de R$ " + dinheiro);
		}else if(ultimoAuxilio.equals("s") && chefaFamilia.equals("n") && bolsaFamilia.equals("n")){
			dinheiro += 300;
			System.out.println("\nVoc� tem direito ao segundo aux�lio de R$ " + dinheiro);
		}else {
			System.out.println("\nVoc� n�o tem direito ao segundo aux�lio");
		}
		
		System.out.println("Fim do programa");
	}
}
