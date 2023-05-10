programa
{
	funcao inicio()
	{
		inteiro cont = 1
		real notas = 0.0, n

		enquanto(cont <= 3) {
			
			escreva ("Digite a nota ", cont,":" )
			leia(n)

			se (n >= 0 e n <= 10) 
			{
				notas = notas + n
				cont = cont + 1 
			} 	
		}
		escreva("Média final: ", notas/3, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 68; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */