public class Fila<T> extends EstruturaBasica<T> {

    public Fila(){
        super();
    }

    public Fila(int tamanho){
        super(tamanho);
    }

    public void enfileirar(T elemento){
        this.adicionar(elemento);
    }
    
    public T primeiroElemento() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        T primeiro;
        if(this.estaVazia()) {
            return null;
        }
        primeiro = this.primeiroElemento();
        this.remover(0);        
        return primeiro;
    }

}
