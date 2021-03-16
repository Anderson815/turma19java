programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		//Variáveis
		real a, b, c, d, ex, f, x, y
		
		//Entrada
		escreva("Digite o A: ")
		leia(a)

		escreva("Digite o B: ")
		leia(b)

		escreva("Digite o C: ")
		leia(c)

		escreva("Digite o D: ")
		leia(d)

		escreva("Digite o E: ")
		leia(ex)

		escreva("Digite o F: ")
		leia(f)

		// Processamento
		x = (c * ex - b * f)/(a * ex - b * d)
		y = (a * f - c * d)/(a * ex - b * d)
			
		// Saida
		escreva("\nX: " + x)
		escreva("\nY: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */