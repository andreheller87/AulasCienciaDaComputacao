import java.util.Scanner;

/*Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 
1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos,
e 28 dias em anos não bissextos.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o Dia:");
        int dia = teclado.nextInt();
        System.out.println("Escreva o Mes:");
        int mes = teclado.nextInt();
        System.out.println("Escreva o Ano:");
        int ano = teclado.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                    mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Valida");
            } else if (mes != 2 && dia < 31) {
                System.out.println("Valida");
            } else if (mes == 2 && dia < 29) {
                System.out.println("Valida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("Valida");
            } else {
                System.out.println("INVALIDO");
            }

        } else {
            System.out.println("INVALIDO");
        }

        teclado.close();
    }
}
