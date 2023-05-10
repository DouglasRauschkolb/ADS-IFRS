programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, nf
		escreva ("Escreva n1: ")
		leia (n1)
		escreva ("Escreva n2: ")
		leia (n2)
		escreva ("Escreva n3: ")
		leia (n3)
		nf = (n1+n2+n3)/3

		se ( nf>=7){
			escreva ("Aprovado\n", "Nota: ",nf)
		} senao {

			se ( nf>=5 e nf<7){
				escreva ("Exame\n", "Nota: ",nf)
			} senao {
				escreva ("Reprovado\n", "Nota: ",nf)
		}
	}	
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 */