programa
{
	
	funcao inicio()
	{
		//variáveis
		real somatoria = 0.00
		real media = 0.00
		real valor = 0.00
		real totalValores = 0.00
		
		//Processo
		escreva("----- ANÁLISE DE NÚMEROS -----")

		escreva("\nDigite um valor: ")
		leia(valor)

		somatoria += valor
		totalValores++
		
		enquanto(valor >= 0){
			escreva("Digite um valor: ")
			leia(valor)
			se(valor < 0){
				pare
			}
			
			somatoria += valor
			totalValores++			
		}

		media = somatoria / totalValores

		escreva("\n\n----- RELATÓRIO -----")
		escreva("\nQuantidade de valores informados: " + totalValores)
		escreva("\nSomatória de todos os valores: " + somatoria)
		escreva("\nMédia dos valores: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */