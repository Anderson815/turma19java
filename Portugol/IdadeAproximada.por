programa
{
	funcao inicio()
	{
		
		//Variáveis
		cadeia nome
		inteiro anoNascimento
		inteiro idade

		// Entrada
		escreva("Digite o seu nome: ")
		leia(nome)

		escreva("Qual é o seu ano de nascimento: ")
		leia(anoNascimento)

		// Processamento
		idade = 2021 - anoNascimento

		// Saida
		escreva("Oi " + nome + " sua idade aproximada é " + idade)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */