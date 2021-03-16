programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//Variáveis
		real custoFabrica, custoConsumidor
		
		//Entrada
		escreva("Digite o custo de fabricação do carro: ")
		leia(custoFabrica)

		// Processamento
		custoConsumidor = (custoFabrica * 0.28) + (custoFabrica * 0.45) + custoFabrica
		custoConsumidor = Matematica.arredondar(custoConsumidor, 2)
			
		// Saida
		escreva("\nO custo do carro para o consumidor é " + custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */