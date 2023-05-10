
public class TestaVetor {
	public static void main(String[] args) {
		//Criar um vetor com capacidade para 5 elementos
		Vetor vetor = new Vetor(5);
		
		//Adicionar 3 elementos no vetor
		vetor.adicionar("Elemento 1");
		vetor.adicionar("Elemento 2");
		vetor.adicionar("Elemento 3");
		
		//Imprimir o tamanho do vetor
		System.out.println("Tamanho do vetor: " + vetor.getTamanho());

		//Imprimir todos os elementos do vetor
		System.out.println(vetor.toString());
		
		//Imprimir somente a posição 2 do vetor
		System.out.println(vetor.buscaValor(1));

	    //Realizar uma busca pelo conteúdo (texto) de elemento do vetor e imprimir a sua posição
		System.out.println("O conteúdo (texto) está na posição: " + vetor.buscaPosicao("texto"));
		
	    //Adicionar um elemento na posição 1 do vetor
		vetor.adicionarEmPosicao(0, "Posição 1");

	    //Adicionar um elemento na posição 3 do vetor
		vetor.adicionarEmPosicao(2, "Posição 3");
		
		//Aumenta capacidade do vetor
		vetor.aumentaCapacidade();
		
	    //Adicionar um elemento na posição 5 do vetor
		vetor.adicionarEmPosicao(4, "Posição 5");
		
	    //Imprimir o vetor novamente
		System.out.println(vetor.toString());		

	    //Imprimir o tamanho do vetor novamente
		System.out.println("Tamanho do vetor: " + vetor.getTamanho());
		
	}
}
