package ListasLigadas;

public class TesteListaLigada {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        Aluno ronaldo = new Aluno("Ronaldo", 28);
        Aluno carol = new Aluno("Carol", 4);
        Aluno betty = new Aluno("Betty", 1);
        Aluno marina = new Aluno("Marina", 10);
        
        //Adicionar o aluno ("Ronaldo", 28);   
        lista.adiciona(ronaldo);

        //Adicionar no fim da lista a aluna ("Carol",4);
        lista.adiciona(carol);

        //Adicionar na posição 2 a aluna ("Betty",1);
        lista.adiciona(2, betty);

        //Adicionar no início da lista a aluna ("Marina",10);
        lista.adicionaNoComeco(marina);

        //Imprimir a lista
        System.out.println(lista.toString());

        //Imprimir a quantidade de elementos
        System.out.println("Numero de elementos: " + lista.tamanho());

        //Remover a posição 2
        lista.remove(2);

        //Imprimir a lista
        System.out.println(lista.toString());

        //Remover elemento do início da lista
        lista.removeDoComeco();

        //Imprimir o primeiro elemento da lista
        System.out.println("Primeiro elemento da lista: " + lista.pega(0).toString());

        //Remover elemento do final da lista
        lista.removeDoFim();

        //Verificar se a aluna("Betty",1) existe na lista
        System.out.println("Existe elemento: " + lista.contem(betty));

        //Imprimir lista
        System.out.println(lista.toString());

    }
    
}
