programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{

		inteiro lancamentos[10]
		inteiro soma = 0
		inteiro media = 0
		inteiro maiorPontuacao = 0
		inteiro ocorrenciaMaiorPontuacao = 0

		escreva("VALORES DOS LANÇAMENTOS: \n")
		para(inteiro indice = 0; indice <10; indice++){
			
			lancamentos[indice] = Util.sorteia(1, 6)
			escreva("\n" + (indice + 1) + "º lançamento: " + lancamentos[indice])
			
			soma += lancamentos[indice]
			se(maiorPontuacao < lancamentos[indice]){
				maiorPontuacao = lancamentos[indice]
			}
		}

		para(inteiro indice = 0; indice <10; indice++){
			se(lancamentos[indice] == maiorPontuacao){
				ocorrenciaMaiorPontuacao++
			}
		}

		media = soma / 10

		escreva("\n\nANÁLISE")
		escreva("\nSoma dos valores: " + soma)
		escreva("\nMédia dos valores: " + media)
		escreva("\nO " + maiorPontuacao + " é a maior pontuação e foi lançado: " + ocorrenciaMaiorPontuacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */