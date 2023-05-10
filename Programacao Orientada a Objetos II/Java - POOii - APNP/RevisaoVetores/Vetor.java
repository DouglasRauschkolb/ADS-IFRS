
public class Vetor {

	private String [] elementos;
	private int tamanho;
	
	public int getTamanho(){
		return tamanho;
	}
	
	//Adiciona elemento ao vetor "elementos"
	public boolean adicionar(String l_elemento){
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = l_elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	//Adiciona String na posição desejada
	public boolean adicionarEmPosicao(int l_posicao, String l_elemento){
		
		if (!(l_posicao >= 0 && l_posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int l_i = this.tamanho-1; l_i >= l_posicao; l_i--){
			this.elementos[l_i+1] = this.elementos[l_i]; 
		}
		
		this.elementos[l_posicao] = l_elemento;
		this.tamanho++;
		return true;
	}
	
	//Dobra capacidade do vetor "elementos"
	public void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			String[] elementosNovos = new String[this.elementos.length*2];
			
			for(int l_i = 0; l_i < this.elementos.length; l_i++){
				elementosNovos[l_i] = this.elementos[l_i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//Remove posição do vetor
	public void remove(int l_posicao){
		if(!(l_posicao >= 0 && l_posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		}
		for(int l_i = l_posicao; l_i < tamanho-1; l_i++){
			this.elementos[l_i] = this.elementos[l_i+1];
		}
		this.tamanho--;
	}
	
	//Retorna valor do campo na posição passado por parâmetro
	public String buscaValor(int l_posicao) {
		if (!(l_posicao >=0 && l_posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		}
		return elementos[l_posicao];
	}
	
	//Retorna posição da String passado por parâmetro
	public int buscaPosicao(String l_elemento) {
		for(int l_i = 0; l_i < tamanho; l_i++){
			if (elementos[l_i].equals(l_elemento)) {
				return l_i;
			}
		}
		return -1;
	}
	
	@Override
	public String toString(){ 
		StringBuilder l_string = new StringBuilder(); 
		
		l_string.append("["); 
		
		for(int l_i = 0; l_i < tamanho - 1; l_i++){ 
			l_string.append(this.elementos[l_i]); 
			l_string.append(",");  
		} 
		if (this.tamanho>0){
			l_string.append(this.elementos[this.tamanho-1]);
		} 
		
		l_string.append("]");
		
		return l_string.toString();
	}
	
	//Constructor
	public Vetor(int l_capacidade){
		this.elementos = new String[l_capacidade];
		this.tamanho = 0;
	}
	
}
