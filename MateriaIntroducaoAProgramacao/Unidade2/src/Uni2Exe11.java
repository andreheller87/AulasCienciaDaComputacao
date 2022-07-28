/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/ 
import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni2Exe11 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
   
        double areaTriangulo= (A * C) /2;;
        double areaCirculo = (C *C)* 3.14159;
        double areaTrapezio = ((A + B)*C )/2;
        double areaQuadrado = B*B;
        double areaRetangulo = A*B;

        System.out.println("TRIANGULO: " +  df.format(areaTriangulo));
        System.out.println("CIRCULO: " + df.format(areaCirculo));
        System.out.println("TRAPEZIO: " + df.format(areaTrapezio));
        System.out.println("QUADRADO: " +df.format(areaQuadrado));
        System.out.println("RETANGULO: " + df.format(areaRetangulo));
          teclado.close();

    }
}
    

