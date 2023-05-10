
public class Pilha {

    private String[] elementos;
    private int tamanho;

    public int getTamanho() {
        return tamanho;}

    //Construct
    public Pilha(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //Stack elements
    public boolean empilhar(String l_elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = l_elemento;
            this.tamanho++;
            return true;
        } else {
            aumentaCapacidade();
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = l_elemento;
                this.tamanho++;
                return true;
            } else {
                return false;
            }
        }
    }

    //Return if stack is empty
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    // Return the last element from the stack if is not empty
    public String topo() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho-1];
    }

    //Removes the last element from the stack
    public String desempilhar() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[--this.tamanho];
    }

    @Override
    public String toString() {
        StringBuilder l_string = new StringBuilder();
        l_string.append("[");
        for(int l_i = 0; l_i < tamanho - 1; l_i++) {
            l_string.append(this.elementos[l_i]);
            l_string.append(","); 
        }
        if(this.tamanho>0) {
            l_string.append(this.elementos[this.tamanho-1]); 
        }
        l_string.append("]");
        return l_string.toString();
    }

    //Increase vector capacity
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length*2];
            for(int l_i = 0; l_i < this.elementos.length; l_i++) {
                elementosNovos[l_i] = this.elementos[l_i];
            }
            this.elementos = elementosNovos;
        }
    }

}
