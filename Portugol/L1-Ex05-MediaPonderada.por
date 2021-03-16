programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//Variáveis
		real nota1, nota2, nota3, mediaPonderada

		//Entrada
		escreva("Digite o valor 1ª nota: ")
		leia(nota1)

		escreva("Digite o valor 2ª nota: ")
		leia(nota2)

		escreva("Digite o valor 3ª nota: ")
		leia(nota3)

		// Processamento
		mediaPonderada = (2 * nota1 + 3 * nota2 + 5 * nota3)/10
		mediaPonderada = Matematica.arredondar(mediaPonderada, 2)
			
		// Saida
		escreva("\nA média é " + mediaPonderada)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */