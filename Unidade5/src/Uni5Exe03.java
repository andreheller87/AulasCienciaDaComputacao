import java.text.DecimalFormat;

/*Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:

*/

public class Uni5Exe03 {

  public static void main(String[] args) {
    double soma = 0;
    DecimalFormat df = new DecimalFormat("0.00");
    for (double i = 1; i <= 100; i++) {
      soma = (1 / i) + soma;
    }
    System.out.println("A soma das frações de 0 a 100 / 1 é: " + df.format(soma));

  }
}