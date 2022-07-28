import java.util.Scanner;

/*O número 3025 possui a seguinte característica:
30+25=55 => 55^2=3025
Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:*/

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, n1, n2, n3, n4, aux, primeira, segunda, soma, calculo;
        for(int primeiros20 = 0; primeiros20 < 20;){
        for (int i = 1000; i <= 9999; i++) {
            numero = i;
            n1 = numero / 1000;
            aux = numero % 1000;
            n2 = aux / 100;
            aux = aux % 100;
            n3 = aux / 10;
            n4 = aux % 10;

            primeira = (n1 * 10) + n2;
            segunda = (n3 * 10) + n4;
            soma = primeira + segunda;
            calculo = soma * soma;

            if(calculo == numero){
                primeiros20++;
                System.out.println(" O numero possui a caracteristica: " +numero );
            }

        }
    }
        teclado.close();
    }

}
