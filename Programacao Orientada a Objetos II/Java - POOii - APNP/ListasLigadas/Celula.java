package ListasLigadas;

public class Celula {

    private Celula proxima;
    private Object elemento;

    //Construct
    public Celula(Celula proxima, Object elemento){
        this.proxima = proxima;
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

    public Object getElemento(){
        return this.elemento;
    }
    
}