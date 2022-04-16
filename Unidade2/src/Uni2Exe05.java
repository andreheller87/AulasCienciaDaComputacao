/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
 diferença do produto de A e B pelo produto de C e D segundo a fórmula:
 DIFERENCA = (A * B - C * D).

*/
import java.util.Scanner;
public class Uni2Exe05 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite valor Inteiro de A: ");
        int valorA = teclado.nextInt();
        System.out.print("Digite valor Inteiro de B: ");
        int valorB = teclado.nextInt();
        System.out.print("Digite valor Inteiro de C: ");
        int valorC = teclado.nextInt();
        System.out.print("Digite valor de Inteiro D: ");
        int valorD = teclado.nextInt();
        int valorDiferenca = valorA*valorB - valorC*valorD;

        System.out.println("A diferença entre produto a.b - c.d é: " +valorDiferenca);



        teclado.close();
    }

}
