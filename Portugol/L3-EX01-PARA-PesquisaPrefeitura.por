programa
{
	
	funcao inicio()
	{
		//Variáveis
		//Contante
		const inteiro PESSOAS_ENTREVISTA = 20
		
		//Processo
		real totalSalario = 0.00
		inteiro totalFilhos = 0
		real totalPessoasAte100 = 0.00

		//Saidas
		real mediaSalario = 0.00
		real mediaFilhos = 0.00
		real maiorSalario = 0.00
		real porcentagemPessoasAte100 = 0.00

		//Processo
		escreva("----- PESQUISA DA PREFEITURA -----")
		
		para(inteiro pessoa = 1; pessoa <= PESSOAS_ENTREVISTA; pessoa++){
			 real salario
			 inteiro filhos

			 //Entrada
			 escreva("\nDADOS da " + pessoa + "º pessoa ")
			 
			 escreva("\nSalário: ")
			 leia(salario)

			 escreva("Filhos: ")
			 leia(filhos)

			 escreva("\n")

			 //Processo
			 totalSalario += salario			
			 totalFilhos += filhos
			 
			 se(salario <= 100.00){
			 	totalPessoasAte100++
			 }

			 se(maiorSalario < salario){
			 	maiorSalario = salario
			 }

		}

		mediaSalario = totalSalario / PESSOAS_ENTREVISTA
		mediaFilhos = totalFilhos / PESSOAS_ENTREVISTA
		porcentagemPessoasAte100 = (totalPessoasAte100 / PESSOAS_ENTREVISTA) * 100

		escreva("\n----- RESULTADO DA PESQUISA -----")
		escreva("\nMédia do salário: " + mediaSalario)
		escreva("\nMédia de filhos: " + mediaFilhos)
		escreva("\nMaior salário: " + maiorSalario)
		escreva("\nPorcentagem de pessoas com salário até R$100,00: " + porcentagemPessoasAte100 + "%\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 104; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */