import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspalhamentoMelhorado {

    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
    private int tamanho = 0;

    public static void main(String[] args) {

        ConjuntoEspalhamentoMelhorado teste = new ConjuntoEspalhamentoMelhorado();
        // Adicionar no conjunto os nomes "Rafael", "Ana","Paulo"
        teste.adiciona("Rafael");
        teste.adiciona("Ana");
        teste.adiciona("Paulo");
        // Imprimir todos os nomes do conjunto
        System.out.println(teste.pegaTodas());
        // Remover o nome "Rafael"
        teste.remove("Rafael");
        // Verificar se o nome "Paulo" existe no conjunto
        System.out.println("Possui o nome Rafael no conjunto? " + teste.contem("Paulo"));
        // Imprimir o todos os nomes do conjunto
        System.out.println(teste.pegaTodas());
        // Imprimir o tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + teste.tamanho());

    }

    public ConjuntoEspalhamentoMelhorado() {
        for (int i = 0; i < 26; i++) {
        LinkedList<String> lista = new LinkedList<String>();
        tabela.add(lista);
        }
    }

    private int calculaCodigoDeEspalhamento(String palavra) {
        int codigo = 1;
        for (int i = 0; i< palavra.length(); i++) {
            codigo = 31 * codigo + palavra.charAt(i);
        }
        return codigo;
    }

    private int calculaIndiceDaTabela(String palavra) {
        int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % tabela.size();
    }

    public void adiciona(String palavra) {
        if(!this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
            this.tamanho++;
            this.verificaCarga();
        }
    }

    public void remove(String palavra) {
        if(this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
            this.tamanho--;
            this.verificaCarga();
        }
    }

    public boolean contem(String palavra) {
        int indice  = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);
        return lista.contains(palavra);
    }

    public List<String> pegaTodas() {
        List<String> palavras = new ArrayList<String>();

        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }

        return palavras;
    }

    public int tamanho() {
        return this.tamanho;
    }

    private void verificaCarga() {
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;
        if (carga > 0.75) {
            this.redimensionaTabela(capacidade*2);
        } else if (carga < 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }

    private void redimensionaTabela(int novaCapacidade) {
        List<String> palavras = this.pegaTodas();
        this.tabela.clear();
        for (int i = 0; i< novaCapacidade; i++){
            this.tabela.add(new LinkedList<String>());
        }
        for (String palavra: palavras) {
            this.adiciona(palavra);
        }
    }

}