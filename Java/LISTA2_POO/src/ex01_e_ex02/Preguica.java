package ex01_e_ex02;

public class Preguica extends Animal{
	
	//Métodos
	@Override
	public void estado() {
		System.out.println("-----BICHO PREGUIÇA -----");
		super.estado();
	}
	
	public void subirArvore() {
		System.out.println("Subindo na árvore");
	}
	
	public void emitirSom() {
		System.out.println("(algum som do bicho preguiça)");
	}
	
	//Construtor
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
}
