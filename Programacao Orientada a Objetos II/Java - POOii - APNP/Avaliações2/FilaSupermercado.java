import java.util.ArrayDeque;
import java.util.Scanner;

public class FilaSupermercado {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de atendentes: ");
        int numero_atendentes = scanner.nextInt();
        System.out.print("Digite o numero de clientes: ");
        int numero_clientes = scanner.nextInt();

        Atendente[] atendentes = new Atendente[numero_atendentes];

        for (int i = 0; i < numero_atendentes; i++){
            System.out.print("Digite o tempo que o " + (i+1) + "° atendente leva pra processar: ");
            atendentes[i] = new Atendente(scanner.nextInt());
        }

        ArrayDeque<Cliente> clientes = new ArrayDeque<Cliente>();

        for (int i = 0; i < numero_clientes; i++) {
            System.out.print("Digite o numero de itens que o " + (i+1) + "° cliente tem: ");
            clientes.add(new Cliente(scanner.nextInt()));
        }

        while (true) {
            // Busca atendente disponivel
            int atendente_disponivel = 0;
            for (int i = 0; i < atendentes.length; i++) {
                if (atendentes[atendente_disponivel].getTempoAtendendo() > atendentes[i].getTempoAtendendo()) {
                    atendente_disponivel = i;
                }
            }

            if (!clientes.isEmpty()){
                atendentes[atendente_disponivel].setTempoAtendendo( atendentes[atendente_disponivel].getTempoAtendendo() + atendentes[atendente_disponivel].getTempo() * clientes.pop().getNumeroItens() );
            } else {
                break;
            }
        }

        // Busca o atendente que ficou maior tempo atendendo, sendo esse o tempo total para atender todos os clientes
        int maior_tempo_atendentedo = 0;
        for (int i = 0; i < atendentes.length; i++) {
            if (atendentes[maior_tempo_atendentedo].getTempoAtendendo() < atendentes[i].getTempoAtendendo()) {
                maior_tempo_atendentedo = i;
            }
        }

        System.out.println(atendentes[maior_tempo_atendentedo].getTempoAtendendo());

    }

}

class Atendente {

    private int tempo;
    private int tempo_atendendo;

    public Atendente(int tempo){
        this.tempo = tempo;
        this.tempo_atendendo = 0;
    }

    public void setTempo (int tempo ){
        this.tempo = tempo;
    }

    public int getTempo (){
        return this.tempo;
    }

    public void setTempoAtendendo (int tempo_atendendo ){
        this.tempo_atendendo = tempo_atendendo;
    }

    public int getTempoAtendendo (){
        return this.tempo_atendendo;
    }
    
}


class Cliente {

    private int numero_itens;

    public Cliente(int numero_itens) {
        this.numero_itens = numero_itens;
    }

    public void setNumeroItens(int numero_itens) {
        this.numero_itens = numero_itens;
    }

    public int getNumeroItens() {
        return this.numero_itens;
    }
    
}
