package entity;

public class Conta {
	
	//Atributos
	public int  numero;
	public String cpf;
	public double saldo;
	public boolean ativa;
	
	//Métodos
	
	public void debitar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
}
