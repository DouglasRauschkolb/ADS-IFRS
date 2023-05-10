public class TestaGenerics {
    
    public static void main(String[] args) {

        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("################### Testa Vetor ###################");
        System.out.println("###################################################");
        System.out.println("###################################################");
       
        //Criar um vetor com capacidade para 5 elementos
		Vetor<String> vetor = new Vetor<String>(5);
		
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
        

        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("################### Testa Pilha ###################");
        System.out.println("###################################################");
        System.out.println("###################################################");

        //Criar um vetor com capacidade para 5 elementos;
        Pilha<String> pilha = new Pilha<String>(5);

        //Verificar e imprimir se a pilha está vazia;
        System.out.println("Pilha está vazia? " + pilha.estaVazia());

        //Adicionar 3 elementos na pilha;
        System.out.println("Empilhado? " + pilha.empilhar("Elemento 1"));
        System.out.println("Empilhado? " + pilha.empilhar("Elemento 2"));
        System.out.println("Empilhado? " + pilha.empilhar("Elemento 3"));

        //Imprimir o tamanho da pilha;
        System.out.println("Tamanho da pilha: " + pilha.getTamanho());

        //Imprimir todos os elementos da pilha;
        System.out.println(pilha.toString());

        //Imprimir o elemento do topo da pilha;
        System.out.println("Elemento do topo: " + pilha.topo());

        //Adicionar mais 3 elementos na pilha;
        System.out.println("Empilhado? " + pilha.empilhar("Elemento 4"));
        System.out.println("Empilhado? " + pilha.empilhar("Elemento 5"));
        System.out.println("Empilhado? " + pilha.empilhar("Elemento 6"));

        //Verificar e imprimir se a pilha está vazia;
        System.out.println("Pilha está vazia? " + pilha.estaVazia());

        //Imprimir o elemento do topo da pilha;
        System.out.println("Elemento do topo: " + pilha.topo());

        //Desempilhar 1 elemento da pilha;
        System.out.println("Retirado elemento: " + pilha.desempilhar());

        //Imprimir o elemento do topo da pilha;
        System.out.println("Elemento do topo: " + pilha.topo());

        //Desempilhar 1 elemento da pilha;
        System.out.println("Retirado elemento: " + pilha.desempilhar());

        //Imprimir todos os elementos da pilha novamente;
        System.out.println(pilha.toString());

        //Imprimir o tamanho da pilha novamente
        System.out.println("Tamanho da pilha: " + pilha.getTamanho());


        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("################### Testa Fila ####################");
        System.out.println("###################################################");
        System.out.println("###################################################");

        //Criar uma fila com capacidade para 5 elementos;
        Fila<String> fila = new Fila<String>(5);

        //Verificar e imprimir se a fila está vazia;
        System.out.println("Fila está vazia? " + fila.estaVazia());

        //Adicionar 3 elementos na fila;
        fila.enfileirar("Pessoa 1");
        fila.enfileirar("Pessoa 2");
        fila.enfileirar("Pessoa 3");

        //Imprimir o tamanho da fila;
        System.out.println("Tamanho da fila: " + fila.getTamanho());

        //Imprimir todos os elementos da fila;
        System.out.println("Elementos da fila: ");
        System.out.println(fila.toString());

        //Imprimir o próximo elemento a ser desenfileirado;
        System.out.println("Próximo elemento: " + fila.proximoElemento());

        //Adicionar mais 3 elementos na fila;
        fila.enfileirar("Pessoa 4");
        fila.enfileirar("Pessoa 5");
        fila.enfileirar("Pessoa 6");

        //Verificar e imprimir se a fila está vazia;
        System.out.println("Fila está vazia? " + fila.estaVazia());

        //Desenfileirar 1 elemento da fila;
        fila.desenfileirar();

        //Imprimir o próximo elemento a ser desenfileirado;
        System.out.println("Próximo elemento: " + fila.proximoElemento());

        //Desenfileirar 1 elemento da fila;
        fila.desenfileirar();

        //Imprimir todos os elementos da fila novamente;
        System.out.println("Elementos da fila: ");
        System.out.println(fila.toString());

        //Imprimir o tamanho da fila novamente;
        System.out.println("Tamanho da fila: " + fila.getTamanho());
        
    }

}
