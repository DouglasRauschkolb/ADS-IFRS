
package Exercicio1;

/**
 *
 * @author douglas.220997
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("############### Conta Normal ###################");
        ContaCorrente conta_corrente = new ContaCorrente();
        conta_corrente.setSaldo(1000);
        System.out.println("Saldo atual: " + conta_corrente.getSaldo());
        conta_corrente.Depositar(1000);
        System.out.println("Saldo atual: " + conta_corrente.getSaldo());
        conta_corrente.Sacar(500);
        System.out.println("Saldo atual: " + conta_corrente.getSaldo());
   
        System.out.println("############### Conta Especial ###################");
        ContaCorrenteEspecial conta_corrente_especial = new ContaCorrenteEspecial();
        conta_corrente_especial.setSaldo(1000);
        System.out.println("Saldo atual: " + conta_corrente_especial.getSaldo());
        conta_corrente_especial.Depositar(1000);
        System.out.println("Saldo atual: " + conta_corrente_especial.getSaldo());
        conta_corrente_especial.Sacar(500);
        System.out.println("Saldo atual: " + conta_corrente_especial.getSaldo());

    }
    
}
