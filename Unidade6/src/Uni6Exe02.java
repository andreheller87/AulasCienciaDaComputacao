
import java.text.DecimalFormat;
import java.util.Scanner;

/*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média*/

public class Uni6Exe02 {
  private Uni6Exe02() {
    Scanner teclado = new Scanner(System.in);

    double valores[] = new double[12];
    double[] maioreQMedia = new double[12];
    double Media = 0;
    DecimalFormat df = new DecimalFormat("0.00");

    vetorLer(teclado, valores);
    double media = calcularMedia(valores, Media, df);
    MaioresQAMedia(valores, maioreQMedia, media);

    teclado.close();

  }

  private void vetorLer(Scanner teclado, double valores[]) {
    for (int i = 0; i < valores.length; i++) {
      System.out.println("Valor [" + (i + 1) + "] : ");
      valores[i] = teclado.nextInt();
    }
  }

  public double calcularMedia(double valores[], double Media, DecimalFormat df) {
    double Soma = 0;

    for (int i = 0; i < valores.length; i++) {
      Soma = Soma + valores[i];
    }
    Media = Soma / 12;
    System.out.println("Media é: " + df.format(Media));
    return Media;

  }

  private void MaioresQAMedia(double valores[], double maioreQMedia[], double media) {
    for (int i = 0; i < valores.length; i++) {
      if (valores[i] > media) {
        maioreQMedia[i] = valores[i];
        System.out.print(maioreQMedia[i] + ", ");
      }

    }

  }

  public static void main(String[] args) {
    new Uni6Exe02();

  }

}
