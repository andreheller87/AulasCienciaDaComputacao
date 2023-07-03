// // Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis

package ordenacao;

public class BucketSort<T extends Comparable<T>> {

    public void sort(T[] vetor) {
        int tamanho = vetor.length;
        int numBaldes = 10;
        T min = vetor[0];
        T max = vetor[0];

        // Encontra o mínimo e o máximo do vetor
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i].compareTo(min) < 0) {
                min = vetor[i];
            } else if (vetor[i].compareTo(max) > 0) {
                max = vetor[i];
            }
        }

        // Criação dos baldes
        @SuppressWarnings("unchecked")
        BubbleSort<T>[] baldes = new BubbleSort[numBaldes];
        for (int i = 0; i < numBaldes; i++) {
            baldes[i] = new BubbleSort<>();
        }

        // Distribuição dos elementos nos baldes
        for (int i = 0; i < tamanho; i++) {
            int index;
            if (vetor[i] instanceof String) {
                index = (vetor[i].hashCode() % numBaldes + numBaldes) % numBaldes;
            } else {
                index = (int) ((double) (vetor[i].compareTo(min)) / (max.compareTo(min)) * (numBaldes - 1));
            }
            baldes[index].sort(vetor);
        }

        // Concatenação dos baldes ordenados
        int pos = 0;
        for (int i = 0; i < numBaldes; i++) {
            T[] baldeOrdenado = baldes[i].getSortedArray();
            if (baldeOrdenado != null) {
                for (T elemento : baldeOrdenado) {
                    vetor[pos] = elemento;
                    pos++;
                }
            }
        }
    }
}
