package lineares;

import java.util.Arrays;
import java.util.Vector;

public class FilaVetor<T> implements Fila<T> {
	private T[] vetor;
	private int inicio;
	private int limite;
	private int tamanho;

	public FilaVetor(int limite) {

		this.vetor = ((T[]) new Object[limite]);
		this.setLimite(limite);
		this.setTamanho(0);
		this.setInicio(0);
	}

	@Override
	public void inserir(T valor) {
		if (tamanho == limite) {
			throw new RuntimeException("Fila Esta Cheia");
		}
		int posicaoInserir = (inicio + tamanho) % limite;
		vetor[posicaoInserir] = valor;
		tamanho++;

	}

	@Override
	public T retirar() {
		T valor = peek();
		this.vetor[inicio] = null;
		this.inicio = (this.inicio + 1) % this.limite;
		this.tamanho--;

		return valor;
	}
	

	@Override
	public T peek() {
		if (this.estaVazia()) {
			throw new RuntimeException("Fila Esta vazia");
		}

		return vetor[inicio];
	}

	@Override
	public boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void liberar() {
		this.vetor = (T[]) new Object[this.limite];
		this.setTamanho(0);
		this.inicio = 0;

	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < this.tamanho; i++) {
			str+= vetor[(inicio + i)% this.limite];
			if(i != tamanho -1) {
			str +=", ";
			}
			
		}
		return str+="]";
	}

	public FilaVetor<T> concatenar(FilaVetor<T> outra) {
	FilaVetor<T> nova = new FilaVetor<>(this.limite + outra.limite);
	
		for (int i = 0; i < this.getTamanho(); i++) {
			nova.inserir(vetor[(this.inicio + i)% this.limite]);
			}
		
		for (int i = 0; i < outra.getTamanho(); i++) {
			nova.inserir(outra.vetor[(outra.getInicio() + i)% outra.getLimite()]);
			}
		
     return nova;
	}

	public int getInicio() {
		return inicio;
	}

	private void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getLimite() {
		return limite;
	}

	private void setLimite(int limite) {
		this.limite = limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	private void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
