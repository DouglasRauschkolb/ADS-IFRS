package Exercicio1;

import java.util.GregorianCalendar;

/**
 *
 * @author douglas.rauschkolb
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criando endereço
        Endereco endereco_joao = new Endereco();
        endereco_joao.setCep("99999-99");
        endereco_joao.setRua("Guido B. Donelli");
        endereco_joao.setComplemento("2000");
        endereco_joao.setBairo("Industrial");
        endereco_joao.setCidade("Barão");
        endereco_joao.setEstado("RS");
        
        //Criando proprietário
        Proprietario joao = new Proprietario("João", "999.999.999-99", "9999999999", endereco_joao);
        joao.setDt_nascimento(new GregorianCalendar(1997, 9, 22).getTime());
        System.out.println(joao.toString());
        
        //Criando marca de carro
        Marca ford = new Marca();
        ford.setNome("Ford");
        ford.setCod_identificador(12345);
        ford.setNr_modelos(2);
        ford.setAno_lancamento(2007);
        System.out.println(ford.toString());
        
        //Criando carro        
        Carro carro_do_joao = new Carro(); 
        carro_do_joao.setAno(2007);
        carro_do_joao.setChassi("123456789");
        carro_do_joao.setCor("Prata");
        carro_do_joao.setMarca(ford);
        carro_do_joao.setModelo("Fusion");
        carro_do_joao.setNr_marchas(5);
        carro_do_joao.setNr_portas(4);
        carro_do_joao.setProprietario(joao);
        carro_do_joao.setTem_cambio_aut(true);
        carro_do_joao.setTem_teto_solar(false);
        carro_do_joao.setVelocidade_atual(0);
        carro_do_joao.setVelocidade_max(2);
        carro_do_joao.setMarcha_atual(1);
        carro_do_joao.setVolume_combustivel(10.0);
        
        System.out.println(carro_do_joao.toString());
        
        carro_do_joao.acelera();
        carro_do_joao.acelera();
        carro_do_joao.acelera();
        carro_do_joao.freia();
        carro_do_joao.freia();
        carro_do_joao.freia();

        carro_do_joao.troca_marcha();
        carro_do_joao.troca_marcha();
        carro_do_joao.troca_marcha();
        carro_do_joao.troca_marcha();
        carro_do_joao.troca_marcha();

        carro_do_joao.reduz_marcha();
        carro_do_joao.reduz_marcha();
        carro_do_joao.reduz_marcha();
        carro_do_joao.reduz_marcha();
        carro_do_joao.reduz_marcha();

        carro_do_joao.acelera();
        carro_do_joao.colocar_marcha_re();
        carro_do_joao.freia();
        carro_do_joao.colocar_marcha_re();

        System.out.println("Autonomia de: " + carro_do_joao.calcula_autonomia(2.0));
        
        carro_do_joao.mostra_volume_combustivel();

    }
}
