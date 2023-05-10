package Exercicio3;

/**
 *
 * @author douglas.rauschkolb
 */
public class CamaroteInferior extends Vip{
    
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void imprimirLocalizacao(){
        System.out.println("Localização: " + this.localizacao);
    }

    //Construtor
    public CamaroteInferior(Ingresso ingresso) {
        super(ingresso);
    }
    
}
