
package Exercicio3;

/**
 *
 * @author douglas
 */
public class Quadrado extends Quadrilateros{
    
    @Override
    public Double calculaArea() {
        Double area = this.lado1 * this.lado1;
        return area;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado1 + '}';
    }
    
    public Quadrado(Double lado) {
        super(lado, lado, lado, lado);
    } 
    
}
