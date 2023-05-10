
package Exercicio3;

/**
 *
 * @author douglas
 */
public class Retangulo extends Quadrilateros{
    
    @Override
    public Double calculaArea() {
        Double area = this.lado1 * this.lado2;
        return area;
    }

    public Retangulo(Double base, Double altura) {
        super(base, altura, base, altura);
    } 

    @Override
    public String toString() {
        return "Retangulo{ Base: " + this.lado1 + " Altura: "+ this.lado2 +" }";
    }
    
    

}
