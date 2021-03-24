programa
{
	
	funcao inicio()
	{

	}

funcao contaEspecial(){
	cadeia tipo
	
	caracter auxDebitoCredito
	caracter auxSair
	
	para (inteiro x=1; x<=10; x++){
		
		escreva("\nMovimento : ", x)
		escreva("\nSaldo atual: ", saldoEspecial)
		escreva("\nLimite Especial: ", limiteEspecial)
		
		escreva("\nD - Débito ou C - Crédito: ")
		leia(auxDebitoCredito)
		escreva("Valor do movimento: ")
		leia(saldoMovimento)
		
		se (auxDebitoCredito == 'D' ou auxDebitoCredito == 'd' ){
			enquanto (saldoMovimento > (saldoEspecial + limiteEspecial)){
				escreva("Valor acima do permitido, tente novamente!\n")
				escreva("Saldo atual: ", saldoEspecial, "\n")
				escreva("Limite Especial: ", limiteEspecial, "\n")
				escreva("Digite novamente o valor para Débito: ")
				leia(saldoMovimento)
			}

			se(saldoMovimento > saldo){
				limiteEspecial = limiteEspecial - (saldoMovimento - saldoEspecial)
				saldoEspecial = 0
			}senao{
				saldoEspecial = saldoEspecial - saldoMovimento
			}
			
		}senao se (auxDebitoCredito == 'C' ou auxDebitoCredito == 'c'){
			saldoEspecial = saldoEspecial + saldoMovimento
		}
		escreva("Continua S/N: ")
		leia(auxSair)
		se (auxSair == 'N' ou auxSair == 'n'){
			pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1084; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */