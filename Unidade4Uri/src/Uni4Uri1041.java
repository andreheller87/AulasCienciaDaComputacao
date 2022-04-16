import java.util.Scanner;

/*Escreva um algoritmo que leia dois valores flutuantes (x e y), 
que devem representar as coordenadas de um ponto em um plano.
 Em seguida, determine a qual quadrante o ponto pertence, ou se você está
  em um dos eixos cartesianos ou na origem (x = y = 0).



Se o ponto estiver na origem, escreva a mensagem "Origem".

Se o ponto estiver no eixo X escreva "Eixo X", senão se o ponto estiver no eixo Y escreva "Eixo Y".

Entrada
A entrada contém as coordenadas de um ponto.

Saída
A saída deve exibir o quadrante em que o ponto está.*/
public class Uni4Uri1041 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x = teclado.nextDouble();
        double y  = teclado.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (y > 0 && x > 0) {
            System.out.println("Q1");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (y < 0 && x > 0) {
            System.out.println("Q4");
        }
    

        teclado.close();
    }
    
}
