programa
{
	funcao inicio()
	{
		inteiro vetor[20], i
			

		para (i=0; i<20; i=i+1){
			escreva("Digite um numero: ")
			leia(vetor[i])
		}
		
		limpa()
		
		para (i=0; i<20; i=i+1){
			se (vetor[i]>0){
			escreva(vetor[i], " / ")	
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */