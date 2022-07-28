import java.text.DecimalFormat;
import java.util.Scanner;

/*Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:

*/
public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a opção:");
        System.out.println("T = calcular a área de um triângulo ");
        System.out.println("Q =  calcular a área de um quadrado");
        System.out.println("R: calcular a área de um retângulo");
        System.out.println("C: calcular a área de um círculo");

        char opcao = teclado.next().charAt(0);
        opcao = Character.toUpperCase(opcao);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        switch (opcao) {
            case 'T':
                System.out.println("Digite a Base e Altura do triangulo");
                double base = teclado.nextDouble();
                double altura = teclado.nextDouble();
                Double areaTriangulo = (base * altura) / 2;
                System.out.println("Area do triangulo = " +  df_2.format(areaTriangulo) );
                break;
            case 'Q':
                System.out.println("Digite o lado");
                double lado = teclado.nextDouble();
                Double areaQuadrado = lado * lado;
                System.out.println("Area do Quadrado = " + df_2.format(areaQuadrado));
                break;
            case 'R':
                System.out.println("Digite a Base e Altura do retangulo");
                base = teclado.nextDouble();
                altura = teclado.nextDouble();
                Double areaRetangulo = base * altura;
                System.out.println("Area do Quadrado = " + df_2.format(areaRetangulo));
                break;

            case 'C':
                System.out.println("Digite o raio: ");
                double raio = teclado.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("Area do circulo: " + df_2.format(areaCirculo));
                break;
                default:
                System.out.println("Letra Invalida");
                break;

        }

        teclado.close();
    }

}
