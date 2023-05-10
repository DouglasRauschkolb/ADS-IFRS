package Exercicio3;

/**
 *
 * @author douglas.rauschkolb
 */
public class Ingresso {
    
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public void imprimeValor(){
        System.out.println("Valor do ingreso: " + this.valor);
    }
 
}
