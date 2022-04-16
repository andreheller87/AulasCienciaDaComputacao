/*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
Considerando que alguém está pagando uma compra, faça um programa que
 determine e escreva o número mínimo de notas que o caixa deve fornecer 
 como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco.
  Suponha que o sistema monetário não utilize centavos.
*/ 

import java.util.Scanner;

public interface Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        int n100 = (valor / 100);
        int n10 = (valor%100)/10;
        int n01 = ((valor%100) %10)/1;


        System.out.println(n100 + " notas de R$ 100.00");
        System.out.println(n10 + " notas de R$ 10.00");
        System.out.println(n01+ " notas de R$ 1.00");

        teclado.close();


    }
    
}
