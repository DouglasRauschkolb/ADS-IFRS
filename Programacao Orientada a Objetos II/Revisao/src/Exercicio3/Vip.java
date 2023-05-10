package Exercicio3;

/**
 *
 * @author douglas.rauschkolb
 */
public class Vip extends Ingresso{
    
    private final Ingresso ingresso;
    private Double valor_adicional;

    public Double getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(Double valor_adicional) {
        this.valor_adicional = valor_adicional;
    }
    
    public Double retornaValorvip(){
        return this.valor_adicional + this.ingresso.getValor();
    }

    //Construtor
    public Vip(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

}
