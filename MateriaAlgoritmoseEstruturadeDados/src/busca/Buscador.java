package busca;

public class Buscador<T extends Comparable<T>> {
	
	public int pesquisaLinear(T[] vetor, T chave) {
		
		
		return -1;
	}
	/*Algoritmo: buscaBinaria(int[] info, int valorBuscar)
n ← size(info);
inicio ← 0;
fim ← n-1;
enquanto inicio ≤ fim faça
meio ← (inicio + fim)/2 ;
se valorBuscar < info[meio] então
fim ← meio-1; // redefine posição final
senão
se valorBuscar > info[meio] então
inicio ← meio+1; // redefine posição inicial
senão
retornar meio; // achou
fim-se;
fim-se;
fim-enquanto;
retornar -1;
*/
	
public int pesquisaBinaria(T[] vetor, T chave) {
		
		int inicio = 0;
		int fim =vetor.length-1;
		
		while (inicio<= fim) {
			
			int meio = (inicio + fim) /2;
			
			if(chave.compareTo(vetor[meio])<0) {
				fim = meio -1;
			}else if(chave.compareTo(vetor[meio])>0) {
				inicio = meio +1;
			}else {
				return meio;
			}
		
			
		}
		
		return -1;
	}
	
	
	

}
