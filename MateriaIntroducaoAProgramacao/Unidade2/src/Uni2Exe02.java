import java.util.Scanner;

/*Leia 2 valores inteiros e imprima sua multiplicação.*/ 


public class Uni2Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero Inteiro para multiplicar: ");
        int valor1 = teclado.nextInt();
        System.out.println("Digite um numero Inteiro para multiplicar: ");
        int valor2 = teclado.nextInt();
        int multiplicação = valor1 * valor2;

        System.out.println("O produto da multiplicação é: " + multiplicação);
        teclado.close();

        
    }
}
