
import java.util.Scanner;
public class Uni2Exe01 {
    public static void main(String[] args){  
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um  numero Inteiro para somar:");
        int valor1 = teclado.nextInt();
        System.out.print("Digite um  numero Inteiro para somar:");
        int valor2 = teclado.nextInt();

        int soma = valor1 + valor2;

        System.out.println(" A soma do numero: " + valor1 + " e  " + valor2+ " é: " + soma);
        teclado.close();

    }
}
   