package busca;

public class TestBusca {

	public static void main(String[] args) {
	Integer[] vetInt = {2,15,22,31,47,55,62,79,90,98};
	
	Buscador busca = new Buscador<>();
	int inteiro = busca.pesquisaBinaria(vetInt,22);
	
	System.out.println(inteiro);

	}

}
