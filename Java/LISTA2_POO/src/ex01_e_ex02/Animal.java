package ex01_e_ex02;

public class Animal {
	
	private String nome;
	private int idade;
	
	public void emitirSom() {
		System.out.println("Som do Animal");
	}
	
	public void estado() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
	}
	
	//Métodos especiais
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
