package ex06;

public class Conta {
	
	private static int numeroContado = 1;
	
	//Atributos
	private int  numero;
	private String cpf;
	private String nome;
	private double saldo;
	private boolean ativa;
	
	//Métodos
	public void debitar(double valor) {
		if(valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
	
	public void creditar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public void ativar() {
		this.setAtiva(true);
	}
	
	public void desativar() {
		this.setAtiva(false);
	}
	
	//Status
	public void estado() {
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Número: " + this.getNumero());
		System.out.println("Ativo: " + this.isAtiva());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	//Métodos especiais
	public Conta() {
		this.setAtiva(true);
		this.setNumero(Conta.numeroContado);
		this.setSaldo(0);
		
		Conta.numeroContado += 1;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	
}
