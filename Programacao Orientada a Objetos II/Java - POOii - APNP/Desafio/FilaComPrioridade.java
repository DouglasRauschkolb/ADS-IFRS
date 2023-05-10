public class FilaComPrioridade<T> extends Fila<T>{

    public FilaComPrioridade(int tamanho){
        super(tamanho);
    }

    @Override
    public void enfileirar(T elemento){

        Comparable<T> chave = (Comparable<T>) elemento;
        
        int l_i;
        for(l_i = 0; l_i < this.tamanho; l_i++){
            if(chave.compareTo(this.elementos[l_i]) < 0){
                break;
            }
        }
        this.adicionar(l_i, elemento);

    }

}