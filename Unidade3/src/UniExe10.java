/*Descreva um programa que leia o comprimento dos catetos de um triângulo 
retângulo e calcule o comprimento da hipotenusa.
Fórmula:

\normalsize&space;hipotenusa^2=cateto1^2+cateto^2*/
import java.util.Scanner;
public class UniExe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o cateto1 ");
        double cateto1 = teclado.nextDouble();
        System.out.print("Digite o cateto2 ");
        double cateto2 = teclado.nextDouble();
        double hipotenusa;

        //processo
        hipotenusa = (cateto1*cateto1)+ (cateto2 * cateto2);
        hipotenusa = hipotenusa*hipotenusa;

        //saida
        System.out.println("O comprimento da hipotenusa é: " + hipotenusa);

        teclado.close();
    }
}
