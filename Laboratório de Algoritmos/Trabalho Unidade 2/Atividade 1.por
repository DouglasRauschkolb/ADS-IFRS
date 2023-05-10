programa
{
	funcao inicio()
	{
		inteiro opcao, n1, n2
		
		escreva("1) Somar 2 numeros \n")
		escreva("2) Quadrado de 1 número \n")
		escreva("Escolha uma opção: ")
		leia(opcao)

		limpa()

		escolha (opcao)	
		{
			caso 1: 
		 		escreva ("Digite o primeiro número: ")
		 		leia (n1)
		 		escreva ("Digite o segundo número: ")
		 		leia (n2)
		 		escreva ("A soma dos números é: ",n1+n2)
		 		pare   
		 	caso 2: 
		 		escreva ("Digite o número: ")
		 		leia (n1)
		 		escreva("O quadrado do numero ",n1, " é: ",n1*n1)
		 		pare  
		 	caso contrario:
		 		escreva ("Opção Inválida!")
		}

		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */