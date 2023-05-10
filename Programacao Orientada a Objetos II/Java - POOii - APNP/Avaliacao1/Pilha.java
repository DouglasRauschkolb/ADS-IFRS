public class Pilha<T> extends EstruturaBasica<T>{

    public Pilha(){
        super();
    }

    public Pilha(int tamanho){
        super(tamanho);
    }

    public void empilhar(T elemento){
        this.adicionar(elemento);
    }

    public T topo(){
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanho-1];
    }

    public T desempilhar(){
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[--this.tamanho];
    }
    
}
