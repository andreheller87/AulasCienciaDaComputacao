/*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50
. Faça um programa para ler o comprimento e altura de uma parede (em metros),
 e depois escrever o valor gasto com a compra de azulejos.
 Considere que um metro quadrado é formado por 9 azulejos.*/ 
 import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a a altura e comprimento da parede: ");
        double paredeAltura = teclado.nextDouble();
        double paredeComprimento = teclado.nextDouble();
        double paredeMetroQuadrado = paredeAltura * paredeComprimento;
        double valor = (paredeMetroQuadrado / 9) * 12.5;

        System.out.println("O valor a Pagar é: " + valor);

        teclado.close();


        
    }
    
}
