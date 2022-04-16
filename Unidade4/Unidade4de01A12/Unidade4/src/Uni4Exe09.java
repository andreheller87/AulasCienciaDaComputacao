import java.util.Scanner;

/*Dados dois valores inteiros, escreva um algoritmo que informe se eles são
 múltiplos ou não.*/

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int valor1 = teclado.nextInt();
        System.out.print("Digite um numero inteiro: ");
        int valor2 = teclado.nextInt();

        int multiplo1 = valor1 % valor2;

        if (valor1 >= valor2 && multiplo1 == 0) {
            System.out.println("numero é multiplo");
        } else {
            System.out.println("numero não é multiplo");
        }

        teclado.close();

    }
}
