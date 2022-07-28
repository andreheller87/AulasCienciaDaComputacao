import java.util.Scanner;

/*Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
8,10,16,18,32,34,64
O valor n deve ser lido e deve ser maior do que 2.

*/
public class Uni5Exe5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int soma = 8;
        int mult = 8;
        System.out.print("8,");

        for (int i = 0; i < n; i++) {

            soma = mult + 2;
            mult = mult * 2;
            System.out.print(soma + "," + mult + ",");

        }

        teclado.close();

    }
}
