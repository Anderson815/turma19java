package entidades;

public abstract class Produto {
	
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
	
	//M?todos Especiais
	public Produto(String descricao, String codigo, double valorUnitario) {	
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.qtdeEstoque = 0;
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
