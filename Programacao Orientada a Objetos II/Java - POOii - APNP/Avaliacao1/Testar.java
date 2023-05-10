public class Testar {
    
    public static void main(String[] args) {
        
        System.out.println("############## Testa Classe Vetor ############");
        Vetor<Integer> vetor = new Vetor<Integer>();
        vetor.adicionar(1);
        vetor.adicionar(0, 2);
        vetor.adicionar(3);
        vetor.adicionar(4);
        vetor.adicionar(5);
        System.out.println(vetor.toString());
        System.out.println("Elemento na posição 1: " + vetor.buscar(1));
        System.out.println("Elemento 2 está na posição: " + vetor.buscarElemento(2));
        vetor.remover(0);
        System.out.println(vetor.toString());

        System.out.println("############## Testa Classe Pilha ############");
        Pilha<String> pilha = new Pilha<String>(5);
        pilha.empilhar("Elemento 1");
        pilha.empilhar("Elemento 2");
        pilha.empilhar("Elemento 3");
        pilha.empilhar("Elemento 4");
        System.out.println(pilha.toString());
        System.out.println("Topo da pilha: " + pilha.topo());
        pilha.desempilhar();
        System.out.println("Topo da pilha: " + pilha.topo());
        pilha.desempilhar();
        System.out.println(pilha.toString());

        System.out.println("############## Testa Classe Fila ############");
        Fila<Integer> fila = new Fila<Integer>(5);
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        System.out.println(fila.toString());
        System.out.println("Primeiro da fila: " + fila.primeiroElemento());
        fila.desenfileirar();
        System.out.println("Primeiro da fila: " + fila.primeiroElemento());
        fila.desenfileirar();
        System.out.println(fila.toString());

    }

}
