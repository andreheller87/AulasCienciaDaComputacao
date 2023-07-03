package lineares;

public class ListaEstatica {

	private int[] info;
	private int tamanho;

	public ListaEstatica() {
		this.info = new int[10];
		this.tamanho = 0;
	}

	public void inserir(int valor) {
		if (tamanho == info.length) {
			this.redimensionar();
		} else {
			info[tamanho] = valor;
			tamanho++;
		}
	}

	private void redimensionar() {
		int novo[] = new int[tamanho + 10];
		for (int i : info) {
			novo[i] = info[i];

		}
		info = novo;
		
	}

	public String exibir() {
		String palavra = "{";
		for (int i = 0; i < tamanho; i++) {
			palavra += info[i] + ",";
		}
		palavra += "}";

		return palavra;

	}

	public int buscar(int valor) {
		int valorBusca = 0;

		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				valorBusca = i;

				return valorBusca;
			}
			valorBusca = -1;

		}
		return valorBusca;

	}
	
	public Boolean estaVazia() {
		
		if(tamanho == 0) {
			return true;
		}
		return false;
		
	}
	public void retirar(int valor) {
		int pos =this.buscar(valor);
		if(pos != -1) {
		for(int i = pos;i< tamanho-1 ; i++) {
			info[i] = info[i+1];
		}
		tamanho--;
		}
		
	}

}
