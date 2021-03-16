programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		//Variáveis
		real p1x, p1y, p2x, p2y, d
		
		//Entrada
		escreva("Digite o X do 1º Ponto: ")
		leia(p1x)

		escreva("Digite o Y do 1º Ponto: ")
		leia(p1y)

		escreva("Digite o X do 2º Ponto: ")
		leia(p2x)

		escreva("Digite o Y do 1º Ponto: ")
		leia(p2y)


		// Processamento
		d = Mat.raiz((Mat.potencia((p2x - p1x), 2) + Mat.potencia((p2y - p1y), 2)), 2)
			
		// Saida
		escreva("\nA distância é " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */