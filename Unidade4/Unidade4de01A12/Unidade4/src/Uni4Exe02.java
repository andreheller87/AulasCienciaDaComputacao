import java.util.Scanner;

/*Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva um valor maior que 0: ");
        int valor = teclado.nextInt();

        if (valor % 2 == 0) {
            System.out.println(valor + " é um numero Par");
        } else {
            System.out.println(valor + " é um numero Ipar");
        }

        teclado.close();
    }

}
