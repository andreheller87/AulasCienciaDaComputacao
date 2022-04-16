/*Faça um programa que leia três valores de ponto flutuante: A, B e C.
 Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem base A e altura C.
b) a área do círculo do raio C. (pi = 3,14159)
c) a área do trapézio que tem A e B por base e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores duplos com um dígito após o ponto decimal.

Saída
O arquivo de saída deve conter 5 linhas de dados. Cada linha corresponde a 
uma das áreas descritas acima, sempre com uma mensagem
 correspondente (em português) e um espaço entre os dois pontos e o valor.
  O valor calculado deve ser apresentado com 3 dígitos após a vírgula.

*/

import java.util.Scanner;

public class Uni3Uri1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
       
        double areaTriangulo= (A * C) /2;;
        double areaCirculo = (C *C)* 3.14159;
        double areaTrapezio = ((A + B)*C )/2;
        double areaQuadrado = B*B;
        double areaRetangulo = A*B;

        System.out.println("TRIANGULO: " + String.format("%.3f", areaTriangulo));
        System.out.println("CIRCULO: " +String.format("%.3f", areaCirculo));
        System.out.println("TRAPEZIO: " +String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " +String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: " +String.format("%.3f", areaRetangulo));



        
        teclado.close();

    }
}