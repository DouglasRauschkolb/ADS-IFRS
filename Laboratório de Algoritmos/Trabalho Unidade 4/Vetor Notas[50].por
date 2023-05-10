programa
{
	funcao inicio()
	{
		inteiro notas[50], i, n0=0, n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, n7=0, n8=0, n9=0, n10=0

		para (i=0; i<50; i=i+1){
			escreva("Digite a nota ", i+1, " : ")
			leia(notas[i])
			limpa()
			se (notas[i]==0){
				n0 = n0+1
			}
			se (notas[i]==1){
				n1 = n1+1
			}
			se (notas[i]==2){
				n2 = n2+1
			}
			se (notas[i]==3){
				n3 = n3+1
			}
			se (notas[i]==4){
				n4 = n4+1
			}
			se (notas[i]==5){
				n5 = n5+1
			}
			se (notas[i]==6){
				n6 = n6+1
			}
			se (notas[i]==7){
				n7 = n7+1
			}
			se (notas[i]==8){
				n8 = n8+1
			}
			se (notas[i]==9){
				n9 = n9+1
			}
			se (notas[i]==10){
				n10 = n10+1
			}
		}
		escreva("Foram tiradas ", n0, " notas 0. \n")
		escreva("Foram tiradas ", n1, " notas 1. \n")
		escreva("Foram tiradas ", n2, " notas 2. \n")
		escreva("Foram tiradas ", n3, " notas 3. \n")
		escreva("Foram tiradas ", n4, " notas 4. \n")
		escreva("Foram tiradas ", n5, " notas 5. \n")
		escreva("Foram tiradas ", n6, " notas 6. \n")
		escreva("Foram tiradas ", n7, " notas 7. \n")
		escreva("Foram tiradas ", n8, " notas 8. \n")
		escreva("Foram tiradas ", n9, " notas 9. \n")
		escreva("Foram tiradas ", n10, " notas 10. \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */