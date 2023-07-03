package lineares;

import java.util.ArrayList;

public class TesteListaEstatica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaEstatica lista = new ListaEstatica();
		ArrayList<Integer> listaParalela = new ArrayList<>();
		
		listaParalela.add(50);
		listaParalela.add(-15);
		listaParalela.add(12);
		listaParalela.add(28);
		listaParalela.add(91);
		System.out.println("listaParalela " + listaParalela );
		
		lista.inserir(50);
		lista.inserir(-15);
		lista.inserir(12);
		lista.inserir(28);
		lista.inserir(91);
		
		System.out.println("Lista original = " + lista.exibir());
		System.out.println("Indice: " + lista.buscar(-15));
		System.out.println("Indice: " + lista.buscar(91));
		System.out.println("Indice: " + lista.buscar(20));
		System.out.println("Esta Vazia: " + lista.estaVazia());
		
		lista.retirar(28);
		System.out.println("Lista retirada  = " + lista.exibir());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	
}
