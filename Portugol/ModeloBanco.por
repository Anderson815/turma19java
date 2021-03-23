programa
{
	inclua biblioteca Util

	//Variáveis da Conta
	inteiro numero
	cadeia cpf
	real saldo
	logico ativo

	//Variável da Conta Especial
	real limite
	
	funcao inicio()
	{
		//Inicialização de variáveis da Conta
		numero = 0
		cpf = ""
		saldo = 0.00
		ativo = verdadeiro
	
		//Inicialização da variável da Conta Especial
		limite = 1000.00

		//Varíavel de entrada
		cadeia opcao = ""

		//Variáveis extras
		cadeia tipoDaConta = ""
		
		faca{
			opcao = tela1()
			/*
			se(opcao == "1"){
				
			}
			*/
			tela2(opcao)
		}enquanto(opcao != "5")
	}

	//Funções de interface
	funcao cadeia tela1(){	
		cadeia opcao = "0"

		faca{
			informacoesBanco()
	
			escreva("\n1 - CONTA POUPANÇA")
			escreva("\n2 - CONTA CORRENTE")
			escreva("\n3 - CONTA ESPECIAL")
			escreva("\n4 - CONTA EMPRESA")
			escreva("\n5 - SAIR ")
	
			escreva("\n\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
			leia(opcao)	
	
			escreva("\n")

			se(opcao != "1" e opcao != "2" e opcao != "3" e opcao != "4" e opcao != "5"){
				escreva("ERRO: O código " + opcao + " não existe")
				Util.aguarde(3000)
			}
			
		}enquanto(opcao != "1" e opcao != "2" e opcao != "3" e opcao != "4" e opcao != "5")

		limpa()
		retorne opcao
	}

	funcao tela2(cadeia opcao){
		cadeia tipoDaConta = ""
		cadeia movimento = ""
		cadeia continuar = ""
		real valorMovimento = 0.00

		tipoDaConta = tipoConta(opcao)
	
		faca{
			informacoesBanco()
	
			escreva("\nCONTA " + tipoDaConta)
	
			escreva("\n\nSaldo Atual: R$ " + saldo)
			escreva("\nMOVIMENTO - D (Debito) ou C (Crédito): ")
			leia(movimento)
	
			escreva("Valor movimento: R$ ")
			leia(valorMovimento)
	
			escreva("Continuar S/N: ")
			leia(continuar)
	
			se(continuar == "S" ou continuar == "s"){
				se(movimento == "D" ou movimento == "d"){
					saldo = debito(valorMovimento)
				}senao se(movimento == "C" ou movimento == "c"){
					saldo = credito(valorMovimento)
				}senao{
					escreva("ERRO: você não informou o tipo da movimentação (D ou C)")
					Util.aguarde(3000)				
				}
			}senao se(continuar == "N" ou continuar == "n"){
				se(opcao == "3"){
					usarLimite()
				}
			}senao{
				escreva("ERRO: você não informou se iria continuar ou não")
				Util.aguarde(3000)
			}
			limpa()
		}enquanto(continuar == "S" ou continuar == "s")		
	}

	//Funções Interface - Informações de banco
	funcao informacoesBanco(){
		escreva("\nGENBRA - G01")
		escreva("\n$ DINHEIRO NO BOLSO $\n")
	}

	//Funções de Calculo
	funcao real debito(real valor){
		real novoSaldo = saldo

		se(valor > saldo){
			escreva("ERRO: você informou um valor de debito acima do valor do seu saldo")
			Util.aguarde(3000)					
		}senao se(valor < 0){
			escreva("ERRO: você informou um valor de debito negativo")
			Util.aguarde(3000)						
		}senao{
			novoSaldo = saldo - valor
		}
			
		retorne novoSaldo
	}

	funcao real credito(real valor){
		real novoSaldo = saldo

		se(valor < 0){
			escreva("ERRO: você informou um valor de crédito negativo")
			Util.aguarde(3000)						
		}senao{
			novoSaldo = saldo + valor
		}
			
		retorne novoSaldo		
	}

	//Função para cada tipo de Conta
	funcao usarLimite(){
		real valorTiradoLimite
		
		escreva("\n\nO limite da sua conta é " + limite + "\n")
		escreva("\nQuer usar quanto do seu limite (ovalor será depositado no seu saldo): ")
		leia(valorTiradoLimite)

		se(valorTiradoLimite < limite){
			limite -= valorTiradoLimite
			saldo += valorTiradoLimite
		}senao{
			escreva("ERRO: você informou um valor acima do seu limite")
			Util.aguarde(3000)							
		}
	}

	//Funções auxiliares
	funcao cadeia tipoConta(cadeia opcao){
		cadeia tConta = ""

		se(opcao == "1"){
			tConta = "POUPANÇA"
		}senao se(opcao == "2"){
			tConta = "CORRENTE"
		}senao se(opcao == "3"){
			tConta = "ESPECIAL"
		}senao se(opcao == "4"){
			tConta = "EMPRESA"
		}

		retorne tConta
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */