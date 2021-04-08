package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorProduto {

	//Atributos
	public List<Produto> repository;
	public Scanner leia;
	
	//Construtor
	public GerenciadorProduto() {
		repository = new ArrayList<>();
		leia = new Scanner(System.in);
	}

	//Encapsulamento
	public List<Produto> getRepository() {
		return repository;
	}

	public void setRepository(List<Produto> repository) {
		this.repository = repository;
	}
	
	public void armazenar() {
		String descricao = "";
		String cod = "";
		double valor = 0.0;
		int quantidade = 0;
			
		System.out.println();
		System.out.println("----- ARMAZENAR PRODUTO -----");
		System.out.print("Informe a descrição: ");
		descricao = leia.next();
		
		System.out.print("Informe o código: ");
		cod = leia.next();
		
		System.out.print("Informe a valor: ");
		valor = leia.nextDouble();
		
		System.out.print("Informe a quantidade: ");
		quantidade = leia.nextInt();
		
		Produto produto = new Produto(descricao, cod, valor, quantidade);
		repository.add(produto);
	}
	
	public void remover() {
		String cod = "";
		Produto produto = null;
		
		System.out.println("----- REMOVER PRODUTO -----");
		System.out.print("Informe o código: ");
		cod = leia.next();
		produto = this.obterProduto(cod);
		repository.remove(produto);	
	}
	
	public void atualizar() {
		String cod = "";
		String op = "";
		int valor = 0;
		Produto produto = null;
		
		System.out.println("----- ATUALIZAR PRODUTO -----");
		System.out.print("Informe o código: ");
		cod = leia.next();
		produto = this.obterProduto(cod);
		
		System.out.print("Informe a operação [1 - Incluir | 2 - Tirar]: ");
		op = leia.next();
		System.out.print("Informe o valor: ");
		valor = leia.nextInt();
		
		if(op.equals("1")) {
			produto.incluirEstoque(valor);	
		}else if(op.equals("2")) {
			produto.tirarEstoque(valor);
		}
		
		repository.set(repository.indexOf(produto), produto);
		
	}
	
	public void apresentarLista() {
		System.out.println();
		System.out.println("----- APRESENTAR PRODUTOS -----");
		for(int contador = 0; contador < this.getRepository().size(); contador++) {
			this.getRepository().get(contador).estado();
		}
	}
	
	private Produto obterProduto(String cod) {
		Produto produto = null;
		
		for(int contador = 0; contador < this.getRepository().size(); contador++) {
			if (this.getRepository().get(contador).getCodigo().equals(cod)) {
				produto = this.getRepository().get(contador);
			}
		}
		
		return produto;
	}
	
}
