package ListasDuplamenteLigadas;

public class Carro {

    private String modelo;
    private int ano;
    private int potencia;

    public Carro(String modelo, int ano, int potencia) {
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "[Carro = " + this.modelo + " - " + this.ano + " - " + this.potencia + " ]";
    }
    
}
