package ex03;

public class Produto {
	
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque; 
	 
	public void incluirEstoque(int valorSerIncluido) {
		this.qtdeEstoque += valorSerIncluido;
	}
	
	public void tirarEstoque(int valorSerExcluido) {
		if(this.getQtdeEstoque() >= valorSerExcluido) {
			this.qtdeEstoque -= valorSerExcluido;
		}
	}
	
	public void estado() {
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Preço: " + this.getValorUnitario());
		System.out.println("Quantidade: " + this.getQtdeEstoque());	
		System.out.println();
	}
	
	//Métodos Especiais
	public Produto(String descricao, String codigo, double valorUnitario, int quantidade) {	
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.qtdeEstoque = quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	/*
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	*/
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	/*
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	*/
	 	 
}
