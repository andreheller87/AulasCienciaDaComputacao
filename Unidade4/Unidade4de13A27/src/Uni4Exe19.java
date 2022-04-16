import java.util.Scanner;

/*Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante
 ele está localizado

0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se x for positivo e y, negativo
3, se os dois valores forem negativos
4, se x for negativo e y, positivo
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite cordenada X");
        double cordX = teclado.nextDouble();
        System.out.println("digite cordenada Y");
        double cordY = teclado.nextDouble();

        if (cordX == 0 && cordY == 0) {
            System.out.println("Esta no quadrante: 0 ");
        } else {
            if (cordX > 0 && cordY > 0) {
                System.out.println("Esta no quadrante: 1 ");
            } else {
                if (cordX > 0 && cordY < 0) {
                    System.out.println("Esta no quadrante: 2 ");
                } else {
                    if (cordX < 0 && cordY < 0) {
                        System.out.println("Esta no quadrante: 3 ");
                    } else {
                        if (cordX < 0 && cordY > 0) {
                            System.out.println("Esta no quadrante: 4 ");
                        }
                    }
                }
            }
        }

        teclado.close();

    }

}
