package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Compra;
import entities.Console;
import entities.Jogo;
import entities.Loja;
import entities.Produto;

public class CadVendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Loja loja = new Loja();
		
		char opcao = ' ';
		char opcaoCompra = ' ';
		/*
		Produto[] produtosLoja = new Produto[10];
		produtosLoja[0] = new Jogo("Jogo", 1, 120.50, "BATTLEFIELD");
		produtosLoja[1] = new Jogo("Jogo", 2, 110.75, "MORTAL KOMBAT");
		produtosLoja[2] = new Jogo("Jogo", 3, 70.25, "MINECRAFT");
		produtosLoja[3] = new Jogo("Jogo", 4, 90.55, "THE SIMS4");
		produtosLoja[4] = new Jogo("Jogo", 5, 250.85, "MARIO PART9");
		produtosLoja[5] = new Jogo("Jogo", 6, 20.50, "FIFA 2021");
		produtosLoja[6] = new Console("Console", 7, 1200.55, "NINTENDO");
		produtosLoja[7] = new Console("Console", 8, 2500.80, "PC GAMER");
		produtosLoja[8] = new Console("Console", 9, 4200.90, "PLAYSTAION");
		produtosLoja[9] = new Console("Console", 10, 2780.15, "X-BOX ONE");
		
		*/
		
		
		do {
			System.out.println("Bem vindo a " + loja.getNome());
			System.out.print("Deseja compra [1 - SIM | 2 - NÃO]: ");
			opcaoCompra = leia.next().charAt(0);
			
			if(opcaoCompra == '1') {
				Compra compra = new Compra();
				do {
					Produto produtosLoja[] = loja.getProdutosLoja();
					
					
					System.out.println("NOME DA LOJA\n");
					System.out.print("Olá, selecione a categoria desejada [1-JOGO | 2-CONSOLE | 3-FINALIZAR]: ");
					opcao = leia.next().charAt(0);
					
					int codProduto = 0;
					
					switch(opcao) {
						case '1':
							System.out.println();
							System.out.println("\nOs jogos dísponiveis são: \n");
							System.out.println("Cod \tNome do Jogo \t\tValor Uni. \tEstoque");
							
							for(int indice = 0; indice <= 5; indice++) {
								Jogo jogo = (Jogo) produtosLoja[indice];
								System.out.print(jogo.getCodigo());
								System.out.print("\t" + jogo.getNome());
								System.out.print("\t\t" + jogo.getValorUnitario());
								System.out.println("\t\t" + jogo.getQtdeEstoque());
							}
							
							System.out.print("\nEscolha o Cod do jogo (numeros): ");
							codProduto = leia.nextInt();
							
							if (codProduto > 6 || codProduto == 0) {
								System.out.println("Você não selecionou um código válido");
							}
							if (codProduto <= 6 && codProduto != 0 ) {
								System.out.print("Digite a quantidade que você deseja: ");
								int qtdeJogo = leia.nextInt();
								
								if(qtdeJogo > produtosLoja[codProduto].getQtdeEstoque()) {
									System.out.println("Valor iválido, não existe essa quantidade");
								}else {
									compra.addProduto(produtosLoja[codProduto - 1], qtdeJogo);
									loja.getProdutosLoja()[codProduto - 1].tirarEstoque(qtdeJogo); // atualizaEstoque
									System.out.println("Seu produto foi adicionado ao carrinho");
									System.out.println();
								}
							}
							break;
							
							
						case '2':
							System.out.println();
							System.out.println("\nOs consoles disponíveis são: \n");
							System.out.println("Cod \tConsole \t\tValor Uni. \tEstoque"); 
							
							for(int indice = 6; indice <= 9; indice++) {
								Console console = (Console) produtosLoja[indice];
								System.out.print(console.getCodigo());
								System.out.print("\t" + console.getMarca());
								System.out.print("\t\t" + console.getValorUnitario());
								System.out.println("\t\t" + console.getQtdeEstoque());
							}
							
							System.out.print("\nEscolha o Cod do console (numeros ou 0 para voltar): ");
							codProduto = leia.nextInt();
							
							if(codProduto < 7 && codProduto > 10) 
							{
								System.out.println("Você não escolheu um código válido");
							}
							
							if ((codProduto >= 7 && codProduto <= 10) || codProduto != 0) 
							{
								System.out.println("Digite a quantidade que você deseja: ");
								int qntDeJogo = leia.nextInt();
								
								if (qntDeJogo > produtosLoja[codProduto].getQtdeEstoque()) 
								{
									System.out.println("Valor inválido: Estoque insuficiente.");
								}
								else 
								{
									compra.addProduto(produtosLoja[codProduto - 1], qntDeJogo);
									loja.getProdutosLoja()[codProduto - 1].tirarEstoque(qntDeJogo);
									System.out.println("Seu produto foi adicionado ao carrinho.\n");
									System.out.println();
								}
							}
							break;
							
						case '3':							
							int parcela = 0;
							char formaPagamento = ' ';
							
							do {
								System.out.print("Forma Pagamento [1 - A vista | 2 - Débito | 3 - Crédito]: ");
								formaPagamento = leia.next().charAt(0);
								
								if(formaPagamento == '3') {
									do {
										System.out.println();
										System.out.print("Informe as parcelas [1 ou 2]: ");
										parcela = leia.nextInt();
										if(parcela < 1 || parcela > 2){
											System.out.println("Não está disponível essa quantidade de parcelas");
										}
									}while(parcela < 1 || parcela > 2);
								}
								
								if(formaPagamento != '1' && formaPagamento != '2' && formaPagamento != '3') {
									System.out.println();
									System.out.println("Forma de pagamento inválida");
								}
								
							}while(formaPagamento != '1' && formaPagamento != '2' && formaPagamento != '3');
							
							compra.finalizarCompra(formaPagamento, parcela);
							loja.emitirNota(compra);
							
							break;
							
							
						default:
							System.out.print("Você não selecionou uma opção válida. Tente novamente.\n");
							break;
					}
				} while (opcao != '3');
			}
		}while(opcaoCompra == '1');
		System.out.println();
		System.out.println("Volte Sempre");
	}

}
