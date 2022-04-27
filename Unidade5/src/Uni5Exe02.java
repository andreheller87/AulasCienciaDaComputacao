
/*Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.*/

public class Uni5Exe02 {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                pares = pares + i;

            } else {
                impares = impares + i;

            }

        }
        System.out.println("A soma de numeros pares de 1 a 100 é:  " + pares);
        System.out.println("A soma de numeros impares de 1 a 100 é: " + impares);

    }
}
