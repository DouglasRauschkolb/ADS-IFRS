programa
{
	funcao inicio()
	{
		inteiro opcao

		escreva ("Digite forma de pagamento:\n 1: Dinheiro\n 2: Cartão\n")
		leia(opcao)

		escolha (opcao){
			caso 1: 
				escreva ("Você escolheu Dinheiro")
				pare
			caso 2: 
				escreva ("Você escolheu Cartão")
				pare
			caso contrario: 
				escreva ("Opção Inválida")	
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 */