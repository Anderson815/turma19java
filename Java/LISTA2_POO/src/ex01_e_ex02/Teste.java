package ex01_e_ex02;

public class Teste {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Zeus", 2);
		Cavalo cavalo = new Cavalo("Horse", 5);
		Preguica preguica = new Preguica("Sleep", 20);
		Animal gato = new Animal("Tigrinho", 6);
		
		cachorro.estado();
		System.out.println();
		cavalo.estado();
		System.out.println();
		preguica.estado();
		System.out.println();
		gato.estado();
		System.out.println();
		
		System.out.println("Testes do Som:");
		
		cachorro.emitirSom();
		System.out.println();
		
		cavalo.emitirSom();
		System.out.println();
		
		preguica.emitirSom();
		System.out.println();
		
		gato.emitirSom();
		System.out.println();
		
		System.out.println("Testes de ações específicas:");
		
		cachorro.correr();
		System.out.println();
		
		cavalo.correr();
		System.out.println();
		
		preguica.subirArvore();
		System.out.println();
		
	}
}
