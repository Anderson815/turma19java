programa
{
	
	funcao inicio()
	{
		//Variável
		inteiro peso = 0
		inteiro excesso = 0
		real multa = 0.00


		escreva("Informe a quantidade de quilos de tomate: ")
		leia(peso)
		
		se(peso > 50){
			excesso = peso - 50
			multa = excesso * 4.00
			escreva("\nJoão, você tem " + excesso + "Kg de tomate a mais que o regulamento. Você irá pagar R$ " + multa + " de multa")
		}senao{
			escreva("\nJoão, você não ultrapassou do limite estabelecido no regulamento, portanto não tem multa ")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */