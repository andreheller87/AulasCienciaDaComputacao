/*Descreva um programa que dado uma temperatura em °C 
informe o seu valor em °F.
 Fórmula:°F = (9/5) °C + 32 
 */

import java.util.Scanner;
public class Uni3Exe11 {
    public static void main(String[] args) {
        double tempC;
        double tempF;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        tempC = teclado.nextDouble();

        //Processo
        tempF = ((tempC * 9)/5 ) +32;

        // Saida
        System.out.println("A temperatura de: "+ tempC + "Celsius em Fahrenheit é: " + tempF);

        teclado.close();

    }
    
}
