import java.util.Scanner;

/*Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores*/

public class Uni6Exe04 {
    private Uni6Exe04() {
        Scanner teclado = new Scanner(System.in);
        int valor1[] = new int[10];
        int valor2[] = new int[10];
        int soma[] = new int[10];

        ler(valor1, valor2, teclado);
        somar(valor1, valor2, soma);
        imprimir(valor1, valor2, soma);

        teclado.close();
    }

    private void ler(int valor1[], int valor2[], Scanner teclado) {
        for (int i = 0; i < valor1.length; i++) {
            System.out.print("Digite o valor 1 : ");
            valor1[i] = teclado.nextInt();
            System.out.print("Digite o valor 2 : ");
            valor2[i] = teclado.nextInt();

        }
    }

    private void somar(int valor1[], int valor2[], int soma[]) {
        for (int i = 0; i < valor1.length; i++) {
            soma[i] = valor1[i] + valor2[i];

        }
    }

    private void imprimir(int valor1[], int valor2[], int soma[]) {
        for (int i = 0; i < soma.length; i++) {
            System.out.println(valor1[i] + " + " + valor2[i] + " = " + soma[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }

}
