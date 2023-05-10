abstract class EstruturaBasica<T> {
    
    protected T[] elementos;
    protected Integer tamanho;

    protected EstruturaBasica() {
        this(10);
    }

    protected EstruturaBasica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    protected boolean adicionar(T l_elemento) {
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

	protected void adicionar(int l_posicao, T l_elemento){
		
		if (l_posicao < 0 || l_posicao > this.tamanho){
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int l_i = this.tamanho-1; l_i >= l_posicao; l_i--){
			this.elementos[l_i+1] = this.elementos[l_i]; 
		}
		
		this.elementos[l_posicao] = l_elemento;
		this.tamanho++;
    }
    
    protected void remover(int posicao) {
        for (int l_i = posicao; l_i < tamanho(); l_i++) {
            if (l_i == (this.elementos.length-1)) {
                this.elementos[l_i] = null;
            } else {
                this.elementos[l_i] = this.elementos[l_i+1];
            }
        }
        this.tamanho--;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int l_i = 0; l_i < this.elementos.length; l_i++) {
                elementosNovos[l_i] = this.elementos[l_i];
            }
            this.elementos = elementosNovos;
        }
    }

    protected boolean estaVazia() {
        return this.tamanho == 0;
    }

    protected int tamanho(){
        return this.tamanho;
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

}
    