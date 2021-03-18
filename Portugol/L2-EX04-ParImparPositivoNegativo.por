programa
{
	
	funcao inicio()
	{
		/*
		 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
		 */
	
		
		//Variáveis
		inteiro numero = 0

		cadeia positivoNegativo = ""
		cadeia parImpar = ""
		
		//Entrada
		escreva("Digite um número inteiro para a análise: ")
		leia(numero)

		//Processo


		se(numero != 0){
			//Análise de par ou impar
			se(numero % 2 == 0){
				parImpar = "par"	
			}senao{
				parImpar = "impar"
			}
			
			//Análise de positivo ou negativo
			se(numero > 0){
				positivoNegativo = "positivo"
			}senao{
				positivoNegativo = "negativo"
			}

			//Saida
			escreva("\nO número " + numero + " é " + parImpar + " e é " + positivoNegativo)
		}senao{
			//Saida
			escreva("\n0 é um numero neutro, portando não é possível analisar")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 780; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */