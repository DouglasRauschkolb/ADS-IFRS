package Exercicio1;

/**
 *
 * @author douglas.rauschkolb
 */
public class Carro {
    
    private String          modelo;
    private String          cor;
    private Integer         ano;
    private Marca           marca;
    private String          chassi;
    private Proprietario    proprietario;
    private Integer         velocidade_max;
    private Integer         velocidade_atual;
    private Integer         nr_portas;
    private Boolean         tem_teto_solar;
    private Integer         nr_marchas;
    private Integer         marcha_atual;
    private Boolean         tem_cambio_aut;
    private Double          volume_combustivel;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getVelocidade_max() {
        return velocidade_max;
    }

    public void setVelocidade_max(Integer velocidade_max) {
        this.velocidade_max = velocidade_max;
    }

    public Integer getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(Integer velocidade_atual) {
        this.velocidade_atual = velocidade_atual;
    }

    public Integer getNr_portas() {
        return nr_portas;
    }

    public void setNr_portas(Integer nr_portas) {
        this.nr_portas = nr_portas;
    }

    public Boolean getTem_teto_solar() {
        return tem_teto_solar;
    }

    public void setTem_teto_solar(Boolean tem_teto_solar) {
        this.tem_teto_solar = tem_teto_solar;
    }

    public Integer getNr_marchas() {
        return nr_marchas;
    }

    public void setNr_marchas(Integer nr_marchas) {
        this.nr_marchas = nr_marchas;
    }

    public Integer getMarcha_atual() {
        return marcha_atual;
    }

    public void setMarcha_atual(Integer marcha_atual) {
        this.marcha_atual = marcha_atual;
    }

    public Boolean getTem_cambio_aut() {
        return tem_cambio_aut;
    }

    public void setTem_cambio_aut(Boolean tem_cambio_aut) {
        this.tem_cambio_aut = tem_cambio_aut;
    }

    public Double getVolume_combustivel() {
        return volume_combustivel;
    }

    public void setVolume_combustivel(Double volume_combustivel) {
        this.volume_combustivel = volume_combustivel;
    }

    public void acelera(){
        if(this.velocidade_atual+1<=this.velocidade_max){
            this.velocidade_atual ++;
            System.out.println("Velocidade atual: " + this.velocidade_atual);
        }else{
            System.out.println("Carro já está na velocidade máxima!");
        }      
    }
    
    public void freia(){
        if(this.velocidade_atual >= 1){
            this.velocidade_atual = 0;
            System.out.println("Velocidade atual: " + this.velocidade_atual);
        }else{
            System.out.println("Carro já está parado!");
        }
    }
    
    public void troca_marcha(){
        if(this.marcha_atual+1<=this.nr_marchas){
            this.marcha_atual ++;
            System.out.println("Marcha atual: " + this.marcha_atual);
        }else{
            System.out.println("Já está na ultima marcha!");
        }
    }
    
    public void reduz_marcha(){
        if(this.marcha_atual > 1){
            this.marcha_atual --;
            System.out.println("Marcha atual: "+ this.marcha_atual);
        }else{
            System.out.println("Carro já está na primeira marcha");
        }
    }
    
    public void colocar_marcha_re(){
        if(this.velocidade_atual == 0){
            this.marcha_atual = 0;
            System.out.println("Marcha ré!");
        }else{
            System.out.println("O carro deve estar parado!");
        }
    }
    
    public Double calcula_autonomia(Double consumo_medio){
        return this.volume_combustivel * consumo_medio;
    }
    
    public void mostra_volume_combustivel(){
        System.out.println(this.volume_combustivel);
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", marca=" + marca + ", chassi=" + chassi + ", proprietario=" + proprietario + ", velocidade_max=" + velocidade_max + ", velocidade_atual=" + velocidade_atual + ", nr_portas=" + nr_portas + ", tem_teto_solar=" + tem_teto_solar + ", nr_marchas=" + nr_marchas + ", marcha_atual=" + marcha_atual + ", tem_cambio_aut=" + tem_cambio_aut + ", volume_combustivel=" + volume_combustivel + '}';
    }       
}
