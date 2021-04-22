package entity;

public class Conta {
	
	//Atributos
	private int  numero;
	private String cpf;
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

	//Métodos especiais
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
