package exercicios;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);
		
		double indice = 0.0;
		
		System.out.print("Informe o indice de polui��o: ");
		indice = leia.nextDouble();
		
		if(indice < 0.3) System.out.println("O indice de polui��o est� aceit�vel");
		else if(indice == 0.3) System.out.println("1� Grupo parem suas atividades!");
		else if(indice == 0.4) System.out.println("1� e 2� Grupo parem suas ativades agora mesmo!!");
		else if(indice >= 0.5) System.out.println("!!!TODO MUNDO DEVE PARAR IMEDIATAMENTE!!!");
	}
}
