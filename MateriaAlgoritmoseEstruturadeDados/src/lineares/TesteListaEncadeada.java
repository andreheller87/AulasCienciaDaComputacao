package lineares;

public class TesteListaEncadeada {

		public static void main(String[] args) {
			ListaEncadeada lista = new ListaEncadeada();
			
			lista.inserir("L");
			lista.inserir("M");
			lista.inserir("A");
			lista.inserir("B");
			lista.inserir("M");
			
			System.out.println(lista.duplicado());
			System.out.println(lista.exibirInverso());
			System.out.println("Lista original = "+lista.exibir());
			/*
			System.out.println("Lista original = "+lista.exibir());
			System.out.println("Lista original. Tamanho = "+lista.getTamanho());
			System.out.println("Buscar 50 = "+lista.buscar(50));
			System.out.println("Buscar 91 = "+lista.buscar(91));
			System.out.println("Buscar 100 = "+lista.buscar(100));
			System.out.println("Pegar pela posi��o 2 = "+lista.pegar(2));
			lista.retirar(100);
			System.out.println("Retirar 50");
			lista.retirar(50);
			System.out.println("Lista ap�s retiradas = "+lista.exibir());
			System.out.println("Tamanho = "+lista.getTamanho());
			System.out.println("Buscar 50 = "+lista.buscar(50));
			System.out.println("Buscar 91 = "+lista.buscar(91));
			System.out.println("Pegar pela posi��o 2 = "+lista.pegar(2));
			System.out.println("Retirar 91");
			lista.retirar(91);
			System.out.println("Buscar ap�s retirada 91 = "+lista.buscar(91));
			lista.inserir(150);
			System.out.println("Lista ap�s inser��o = "+lista.exibir());
			System.out.println("Tamanho = "+lista.getTamanho());
			System.out.println("Pegar pela posi��o 2 = "+lista.pegar(2));
			//System.out.println("Pegar pela posi��o 20 = "+lista.pegar(20));
			
			System.out.println("\nNovos testes---------");
			Lista lista1 = new ListaEncadeada();
			lista1.inserir(50);
			lista1.inserir(-15);
			lista1.inserir(12);
			lista1.inserir(28);
			lista1.inserir(91);
			lista1.inserir(57);
			lista1.inserir(25);
			System.out.println("Lista 1 = "+lista1.exibir());
			Lista lista2 = lista1.dividir();
			System.out.println("Dividir Lista 1");
			System.out.println("Lista 1 = "+lista1.exibir());
			System.out.println("Lista 1 tam = "+lista1.getTamanho());
			System.out.println("Lista 2 = "+lista2.exibir());
			System.out.println("Lista 2 tam = "+lista2.getTamanho());
			System.out.println("Inserir 350 na lista 1");
			lista1.inserir(350);
			System.out.println("Lista 1 = "+lista1.exibir());
			System.out.println("Lista 1 tam = "+lista1.getTamanho());
			System.out.println("Retirar 28 da lista 2");
			lista2.retirar(28);
			System.out.println("Lista 2 = "+lista2.exibir());
			System.out.println("Lista 2 tam = "+lista2.getTamanho());
	*/
		}
}