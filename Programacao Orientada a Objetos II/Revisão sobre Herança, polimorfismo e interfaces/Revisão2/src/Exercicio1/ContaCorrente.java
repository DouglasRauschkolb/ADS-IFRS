
package Exercicio1;

/**
 *
 * @author douglas.220997
 */
public class ContaCorrente {
    
    protected double saldo = 0;
    protected  double taxa_saque;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    protected void Depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Depositado o valor de $" + valor);
    }
    
    protected void Sacar(double valor){
        if((this.saldo - valor) >= 0){
            this.saldo = this.saldo - valor;
            System.out.println("Sacado o valor de $" + (valor - (valor * this.taxa_saque)));
        } else {
            System.out.println("Não foi possivel o saque por falta de fundos!");
        }
    }

    public ContaCorrente() {
        this.taxa_saque = 0.005;
    } 
    
}
