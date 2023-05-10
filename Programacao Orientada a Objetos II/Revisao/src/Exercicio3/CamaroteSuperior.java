package Exercicio3;

/**
 *
 * @author douglas.rauschkolb
 */
public class CamaroteSuperior extends Vip{
    
    private Double valor_adicional_sup;

    public Double getValor_adicional_sup() {
        return valor_adicional_sup;
    }

    public void setValor_adicional_sup(Double valor_adicional_sup) {
        this.valor_adicional_sup = valor_adicional_sup;
    }

    public Double retornaValorIngressoSup(){
        return this.retornaValorvip()+ this.valor_adicional_sup;
    }

    //Construtor
    public CamaroteSuperior(Ingresso ingresso) {
        super(ingresso);
    }
    
}
