// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis

package lineares;



public class MapaDispersao<K,T> {
	
//Tem que ver como criar a Lista 
	
	
	private ListaMap<K,T> tabela;
	private int quantidade;
	
	@SuppressWarnings("unchecked")
	public MapaDispersao(int quantidade) {
		this.quantidade = quantidade;
		this.tabela = new ListaMap<>(quantidade);
			
	}
	
	
	private  int calcularHash(K chave) {
		
		
		    String chaves = (String) chave;
		    int n = chaves.length() - 1;
		    int h = 0;
		    for (int c = 0; c <= n; c++) {
		        char caractere = chaves.charAt(c);
		        int codigo = caractere;
		        h += (codigo * Math.pow(31, c));
		    }
		    
		    int key = h % quantidade;
		    return key;
		}
	
	
	
	public boolean inserir(K chave,T dado) {
		int chaves = this.calcularHash(chave);
		tabela.inserir(chaves ,dado);
		return true;
	}
	
	public T remover(K chave) {
		T retorno = null;
		
		return retorno;
	}
	
	public T buscar(K chave) {
		return null;
	}
	
	public int  quantosElementos() {
		return 0;
	}


	@Override
	public String toString() {
		return "MapaDispersao [tabela=" + tabela.exibir() + "Tamanho"+ tabela.getTamanho() +", quantidade=" + quantidade + "]";
	}
	
	
	
	
}