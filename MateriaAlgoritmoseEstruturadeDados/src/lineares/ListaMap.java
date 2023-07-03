package lineares;

public class ListaMap<K,T> {
	

    	
		private T[] info;
		private K chave;
		private int tamanho;
		
		
	     public ListaMap(int quantidade) {
			
			this.info = (T[]) new Object[quantidade];
			
			this.tamanho = 0;
		}
		
		
		public void inserir(int chaves,T valor) {
			
			info[chaves] = valor;
			tamanho++;
		}

		
		
		public int buscar(T valor) {
			for (int i=0; i < tamanho; i++) {
				if (info[i].equals(valor)) {
					return i;
				}
			}
			return -1;
		}
		
		
		public void retirar(T valor) {
			int pos = this.buscar(valor);
			if (pos != -1) {
				for (int i=pos; i < tamanho-1; i++) {
					info[i] = info[i+1];
				}
				tamanho--;
			}
		}
		
		
		public String exibir() {
			String str = "[";
			for (int i=0; i < info.length; i++) {
				str += info[i]+", ";
			}
			return str+"]";
		}
		
	
		
		
		public int getTamanho() {
			return this.tamanho;
		}
		
		
		public T pegar(int pos) {
			if (pos <0 || pos >= tamanho) {
				throw new IndexOutOfBoundsException("Pos = "+pos);
			}
			return info[pos];
		}
		
		
		
		public boolean estaVazia() {
			return (tamanho == 0);
		}
		
	
		public K getChave() {
			return chave;
		}
		public void setChave(K chave) {
			this.chave = chave;
		}
		
	}

