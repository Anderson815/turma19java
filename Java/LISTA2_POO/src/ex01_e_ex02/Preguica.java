package ex01_e_ex02;

public class Preguica extends Animal{
	
	//M�todos
	@Override
	public void estado() {
		System.out.println("-----BICHO PREGUI�A -----");
		super.estado();
	}
	
	public void subirArvore() {
		System.out.println("Subindo na �rvore");
	}
	
	public void emitirSom() {
		System.out.println("(algum som do bicho pregui�a)");
	}
	
	//Construtor
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
}
