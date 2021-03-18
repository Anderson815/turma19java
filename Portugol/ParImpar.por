programa
{
	
	funcao inicio()
	{
		//Variáveis
		inteiro numero = 0

		//Entrada
		escreva("Digite um número inteiro positivo para a análise: ")
		leia(numero)

		//Processo

		se(numero > 0){
			se(numero % 2 == 0){
				escreva("O número é par")	
			}senao{
				escreva("O número é impar")
			}
		}senao{
			escreva("O número não é inteiro positivo")
		}

		//Saida
		escreva("\nFim do programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */