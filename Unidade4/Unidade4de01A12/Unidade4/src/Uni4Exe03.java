import java.util.Scanner;
/*Dados dois números inteiros descreva um algoritmo para informar o maior valor
 entre eles.*/

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner tecaldo = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int valor1 = tecaldo.nextInt();
        System.out.println("Digite outro numero inteiro:");
        int valor2 = tecaldo.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior: " + valor1);
        } else {
            System.out.println("O segundo numero é o maior: " + valor2);
        }

        tecaldo.close();

    }

}
