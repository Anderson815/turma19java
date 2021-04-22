package ex01_e_ex02;

public class Cachorro extends Animal{

	//Métodos
	@Override
	public void estado() {
		System.out.println("----- CACHORRO -----");
		super.estado();
	}
	
	public void correr() {
		System.out.println("Correndo como um cachorro");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AU AU AU!!!");
	}
	
	//Construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
}
