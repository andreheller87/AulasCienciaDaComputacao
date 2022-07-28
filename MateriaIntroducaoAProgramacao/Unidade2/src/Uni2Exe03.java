

import java.util.Scanner;

/*Calcule a área da circunferência elevando o valor de raio ao quadrado 
e multiplicando por π (π = 3.14159).

*/ 


public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o rai do circulo: ");
        double raio = teclado.nextDouble();
        double circunferencia = (raio * raio)/ 3.14159;

        System.out.println("A circuferência do circulo é: " + circunferencia);

        teclado.close();
    }
}
