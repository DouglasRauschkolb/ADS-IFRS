package ListasDuplamenteLigadas;

public class ListaDuplamenteLigada {

    private Celula primeira;
    private Celula ultima;
    private Integer totalDeElementos = 0;
    
    public void adicionaNoComeco(Object elemento){
        
        Celula nova = new Celula(elemento);
        
        //Se estiver vazia
        if(this.totalDeElementos == 0) {
            this.primeira = nova;
            this.ultima = nova;
        } else {
            this.primeira.setAnterior(nova);
            nova.setProxima(this.primeira);
            this.primeira = nova;
        }

        this.totalDeElementos++;
    }

    public void adiciona(Object elemento){
        if(this.totalDeElementos == 0){
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            nova.setAnterior(this.ultima);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    @Override
    public String toString(){
        //Se estiver vazia
        if(this.totalDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        //Percorre até o penultimo
        for(int i = 0; i < this.totalDeElementos-1; i++){
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        } 
        //Ultimo elemento
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegaCelula(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição não existe");
        }
        Celula atual = primeira;
        for(int i = 0; i < posicao; i++){
            atual = atual.getProxima();
        }
        return atual;
    }

    public void adiciona(int posicao, Object elemento){
        if(posicao == 0){
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos){
            this.adiciona(elemento);
        } else {
            Celula proxima = this.pegaCelula(posicao);
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(proxima, anterior, elemento);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
        
    }

    public Object pega(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posição não existe");
        }
        this.primeira = this.primeira.getProxima();
        this.totalDeElementos--;
        if(this.totalDeElementos==0){
            this.ultima = null;
        }
    }

    public void removeDoFim(){
        if(!this.posicaoOcupada(this.totalDeElementos-1)){
            throw new IllegalArgumentException("Posição não existe");
        }
        if(this.totalDeElementos == 1){
            this.removeDoComeco();
        }else{
            Celula penultima = this.pegaCelula(this.totalDeElementos-2);
            penultima.setProxima(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
    }

    public void remove(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição não existe");
        }
        if(posicao == 0){
            this.removeDoComeco();
        } else if(posicao == this.totalDeElementos-1){
            this.removeDoFim();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.totalDeElementos--;
        }
    }

    public boolean contem(Object elemento){
        Celula atual = this.primeira;
        while(atual != null){
            if(atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    public int tamanho(){
        return this.totalDeElementos;
    }

}
