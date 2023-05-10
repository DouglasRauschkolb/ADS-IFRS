package ListasDuplamenteLigadas;

public class Celula {

    private Celula proxima;
    private Celula anterior;
    private Object elemento;

    //Construct
    public Celula(Celula proxima, Celula anterior, Object elemento){
        this.proxima = proxima;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    //Construct
    public Celula(Object elemento){
        this.elemento = elemento;
    }

    public void setProxima(Celula proxima){
        this.proxima = proxima;
    }

    public Celula getProxima(){
        return this.proxima;
    }

    public void setAnterior(Celula anterior){
        this.anterior = anterior;
    }

    public Celula getAnterior(){
        return this.anterior;
    }

    public Object getElemento(){
        return this.elemento;
    }
    
}