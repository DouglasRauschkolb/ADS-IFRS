
package Exercicio3;

/**
 *
 * @author douglas
 */
public class Circulo implements FormaGeometrica{
    
    private Double raio;
    
    public Double calculaArea() {
        Double area = 3.14 * (this.raio * this.raio);
        return area;
    }
    
    @Override
    public Double calculaPerimetro() {
        return 2 * 3.14 * this.raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }


    
}
