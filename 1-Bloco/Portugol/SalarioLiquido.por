programa
{
	
	funcao inicio()
	{
		/*
		ATÉ 1.200 - ISENTO/ISENTA/ISENTE
		ACIMA 1.200 ATÉ 2.500 - 12%
		SALARIO LIQUIDO / VALOR DO IMPOSTO
		ACIMA 2.500 PAGA 25%
		SALARIO LIQUIDO - IMPOSTO
		*/
		
		//Variáveis
		cadeia nome = ""
		cadeia tratamento = ""
		real salario = 0.00
		
		cadeia pronome = ""
		real imposto = 0.00
		
		
		//Entrada
		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Como você que ser tratado [1 - Senhor / 2 - Senhora / 3 - Senhore]: ")
		leia(tratamento)

		escreva("Digite seu salário bruto: ")
		leia(salario)
		
		//Processo
		se(tratamento == "1"){
			pronome = "Senhor"
		}senao se(tratamento == "2"){
			pronome = "Senhora"
		}senao se(tratamento == "3"){
			pronome = "Senhore"
		}senao{
			pronome = "(não definiu tratamenbto)"
		}
		
		se(salario <= 1200.00){
			imposto = 0.0
		}senao se(salario <= 2500){
			imposto = 0.12
		}senao se(salario > 2500){
			imposto = 0.25		
		}
			
		salario = salario - (salario * imposto)
		
		//Saida
		escreva("Boa tarde " + pronome + " " + nome + " seu salario liquido é R$" + salario + ", pois foi descontado o imposto de " + (imposto * 100) + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 985; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */