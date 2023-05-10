public class TestaPilha {
    
    public static void main(String[] args) {
        
        //Criar um vetor com capacidade para 5 elementos;
        Pilha pilha = new Pilha(5);

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

    }
}
