
/*Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

Vetor origem: [0][4][2][6][3]
Vetor ordenado: [0][2][3][4][6]

Crie um método para inserir os valores no vetor, outro para ordenar o vetor e outro para informar o vetor resultante. Para "método ordenar" se pode usar o "método bolha" explicado neste vídeo.*/

import java.util.Scanner;

public class Uni6Exe07 {
    private Uni6Exe07() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("entre valor [1..A..20:");

        int valor = teclado.nextInt();
        int numeros[] = new int[valor];
        int bolha = 0;

        Ler(numeros, teclado);
        troca(numeros, bolha);
        imprimir(numeros);

        teclado.close();
    }

    private void Ler(int numeros[], Scanner teclado) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("valor [" + i + "]: ");
            numeros[i] = teclado.nextInt();
            for (int j = i - 1; j >= 0; j--) {
                if (numeros[i] == numeros[j]) {
                    System.out.println("Valor Ja Existe");
                    i--;
                }
            }

        }

    }

    public void troca(int numeros[], int bolha) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] >= numeros[i + 1]) {
                bolha = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = bolha;
                i = -1;

            }

        }

    }

    private void imprimir(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }

}
