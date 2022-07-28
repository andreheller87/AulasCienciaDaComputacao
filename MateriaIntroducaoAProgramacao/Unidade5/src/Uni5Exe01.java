import java.util.Scanner;

/*Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.*/

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva 20 numeros inteiros");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "º digite um numero:");
            int numeroDigitado = teclado.nextInt();
            if (numeroDigitado % 2 == 0) {
                System.out.println("numero " + numeroDigitado + " é Par");
            } else {
                System.out.println("numero " + numeroDigitado + " é Impar");
            }

        }

        teclado.close();
    }
}
