public class Vetor<T> extends EstruturaBasica<T>{

    public Vetor(){
        super();
    }

    public Vetor(int tamanho){
        super(tamanho);
    }

    public boolean adicionar(T elemento){
        return super.adicionar(elemento);
    }

    public void adicionar(int posicao, T elemento ){
        super.adicionar(posicao, elemento);
    }

    public T buscar(int posicao){
        return this.elementos[posicao];
    }

    public int buscarElemento(T elemento){
        for(int l_i = 0; l_i < tamanho; l_i++){
			if (elementos[l_i].equals(elemento)) {
				return l_i;
			}
		}
		return -1;
    }

}
