programa
{
	funcao inicio()
	{
		inteiro opcao, n1, n2
		
		escreva("1) Somar 2 numeros \n")
		escreva("2) Quadrado de 1 n�mero \n")
		escreva("Escolha uma op��o: ")
		leia(opcao)

		limpa()

		escolha (opcao)	
		{
			caso 1: 
		 		escreva ("Digite o primeiro n�mero: ")
		 		leia (n1)
		 		escreva ("Digite o segundo n�mero: ")
		 		leia (n2)
		 		escreva ("A soma dos n�meros �: ",n1+n2)
		 		pare   
		 	caso 2: 
		 		escreva ("Digite o n�mero: ")
		 		leia (n1)
		 		escreva("O quadrado do numero ",n1, " �: ",n1*n1)
		 		pare  
		 	caso contrario:
		 		escreva ("Op��o Inv�lida!")
		}

		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */