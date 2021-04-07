package ex01;

public class Cliente {
	
	private static int idCliente = 1;
	
	//Atributos
	private int  id;
	private String sexo;
	private String cpf;
	private String rg;
	private String nome;
	private String telefone;
	private String celular;
	private String email;
	
	
	//Status
	public void estado() {
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("ID: " + this.getId());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("RG: " + this.getRg());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Celular: " + this.getCelular());
		System.out.println("E-Mail: " + this.getEmail());
	}
	
	//Métodos especiais	
	public Cliente() {
		this.setId(Cliente.idCliente);
		
		Cliente.idCliente += 1;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int numero) {
		this.id = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
