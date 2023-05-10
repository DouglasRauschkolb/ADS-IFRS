public class TestaFila {
    
    public static void main(String[] args) {

        //Criar uma fila com capacidade para 5 elementos;
        Fila fila = new Fila(5);

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
