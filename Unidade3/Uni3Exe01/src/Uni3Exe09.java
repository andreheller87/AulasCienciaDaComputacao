/*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:

\normalsize&space;volume:=:\Pi::raio^2::altura*/


import java.util.Scanner;
public class Uni3Exe09{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada
       final double Pi = 3.14;
       System.out.print("Escreva o numero do Raio: ");
       double raio = teclado.nextDouble();
       System.out.print("Escreva a altura: ");
       double altura = teclado.nextDouble();
       double volume;

       //processo
       volume = Pi *(raio*raio)*altura;

       //saida
       System.out.println("Volume da lata de oleo é: "+ volume) ;


        teclado.close();
    }
}