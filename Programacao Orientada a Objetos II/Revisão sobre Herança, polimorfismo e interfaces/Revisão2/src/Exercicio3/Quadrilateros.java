
package Exercicio3;

/**
 *
 * @author douglas
 */
public abstract class Quadrilateros implements FormaGeometrica{
    
    protected Double lado1;
    protected Double lado2;
    protected Double lado3;
    protected Double lado4;

    public Quadrilateros(Double lado1, Double lado2, Double lado3, Double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    
    @Override
    public Double calculaPerimetro(){
        return this.lado1 + this.lado2 + this.lado3 + this.lado4;        
    }
   
}
