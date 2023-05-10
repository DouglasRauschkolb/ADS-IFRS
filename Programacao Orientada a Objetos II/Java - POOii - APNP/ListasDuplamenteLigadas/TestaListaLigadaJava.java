import java.util.ArrayList;

import ListasDuplamenteLigadas.Carro;
import sun.tools.serialver.resources.serialver;

public class TestaListaLigadaJava {

    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList<Carro>();

        Carro carro1 = new Carro("Uno Mille", 2013, 76);
        Carro carro2 = new Carro("Corsa", 2009, 85);
        Carro carro3 = new Carro("KA", 2020, 130);
        Carro carro4 = new Carro("Gol", 2010, 106);

        //Adicionar o carro ("Uno Mille", 2013, 76);
        lista.add(carro1);
        //Adicionar no fim da lista o carro ("Corsa", 2009, 85);
        lista.add(carro2);
        //Adicionar na posição 2 o carro ("KA",2020,130);
        lista.add(2, carro3);
        //Adicionar no início da lista o carro ("Gol",2010, 106);
        lista.add(0, carro4);
        //Imprimir a lista
        System.out.println(lista.toString());
        //Imprimir a quantidade de elementos
        System.out.println("Quantidade de elementos: " + lista.size());
        //Remover o carro da posição 3
        lista.remove(3);
        //Imprimir a lista
        System.out.println("Quantidade de elementos: " + lista.size());
        //Remover o carro do início da lista
        lista.remove(0);
        //Imprimir o primeiro carro da lista
        System.out.println("Primeiro da lista: " + lista.get(0).toString());
        //Remover o carro do final da lista
        lista.remove(lista.size()-1);
        //Verificar se o carro ("KA",2020, 130) existe na lista. Se sim imprimir ele, o seu próximo e o anterior
        System.out.println("Existe na lista: " + lista.contains(carro3));
        //Imprimir novamente a lista  
        System.out.println(lista.toString());    

    }
    
}
