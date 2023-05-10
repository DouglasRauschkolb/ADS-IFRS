programa
{
	funcao inicio()
	{
		inteiro n, i1, i2, i3, i4, cont
		caracter resp

		faca
		{
			cont = 1
			i1 = 0
			i2 = 0
			i3 = 0
			i4 = 0

			limpa()
			
			enquanto (cont <=5) {
			escreva ("Digite o numero ", cont,":" )
			leia(n)

			se (n >= 0 e n < 25) 
			{
				i1 = i1 + 1
			}
			se (n >= 25 e n < 50) 
			{
				i2 = i2 + 1
			}
			se (n >= 50 e n < 75) 
			{
				i3 = i3 + 1
			}
			se (n >= 75 e n < 100) 
			{
				i4 = i4 + 1
			}

			cont = cont + 1
			
		}
		escreva ("Intervalo [0,25]: ",i1, " números. \n")
		escreva ("Intervalo [25,50]: ",i2, " números. \n")
		escreva ("Intervalo [50,75]: ",i3, " números. \n")
		escreva ("Intervalo [75,100]: ",i4, " números. \n")

		escreva("NOVO CÁLCULO (S/N): ")
		leia(resp)
		
		} enquanto (resp == 'S' ou resp == 's')
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */