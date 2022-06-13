import java.util.Scanner;

/*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor*/

public class Uni6Exe03 {
  private Uni6Exe03() {
    Scanner teclado = new Scanner(System.in);
    double valores[] = new double[12];

    vetorLer(teclado, valores);
    ajustar(valores);
    imprimir(valores);

    teclado.close();
  }

  private void vetorLer(Scanner teclado, double valores[]) {
    for (int i = 0; i < valores.length; i++) {
      System.out.print("Valor [" + i + "] : ");
      valores[i] = teclado.nextInt();
    }
  }

  private void ajustar(double valores[]) {
    for (int i = 0; i < valores.length; i++) {
      if (i % 2 == 0) {
        valores[i] = valores[i] + valores[i] * 0.05;
      } else {
        valores[i] = valores[i] + valores[i] * 0.02;
      }

    }
  }

  private void imprimir(double valores[]) {
    for (int i = 0; i < valores.length; i++) {
      System.out.println("valor {" + i + "}: " + valores[i]);
    }

  }

  public static void main(String[] args) {
    new Uni6Exe03();
  }

}