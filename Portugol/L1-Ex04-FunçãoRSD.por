programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//Variáveis
		real a, b, c, d, r, s

		//Entrada
		escreva("Digite o valor A: ")
		leia(a)

		escreva("Digite o valor B: ")
		leia(b)

		escreva("Digite o valor C: ")
		leia(c)

		// Processamento
		r = Matematica.potencia((a + b), 2)
		s = Matematica.potencia((b + c), 2)
		d = (r + s)/2
		
		// Saida
		escreva("O valor do calculo é " + d)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */