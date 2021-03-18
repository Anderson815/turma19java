programa
{
	
	funcao inicio()
	{
		//Variáveis
		cadeia nome = ""
		cadeia chefaFamilia = ""

		//Entrada
		escreva("Digite o seu nome: ")
		leia(nome)

		escreva("Você é chefa(feminino)[sim/não]: ")
		leia(chefaFamilia)

		//Processamento
		se(chefaFamilia == "sim"){
			escreva("Olá " + nome + ", você tem direito a R$ 1200,00")
		}senao se(chefaFamilia == "não"){
			escreva("Olá " + nome + ", você tem direito a R$ 600,00")
		}senao{
			escreva("Não consegui identificar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 97; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */