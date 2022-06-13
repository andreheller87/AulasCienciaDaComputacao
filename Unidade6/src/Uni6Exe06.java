import java.util.Scanner;

/*Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valo*/

public class Uni6Exe06 {
  private Uni6Exe06() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe oo tamanho do vetor (N): ");
    int vetorTamanho = teclado.nextInt();
    double vetor[] = new double[vetorTamanho];

    vetorLer(teclado, vetor); // Ler vetor - popular

    // Opção A
    boolean achou;
    achou = vetorPesquisa(teclado, vetor); // Pesquisar vetor
    if (achou) {
      System.out.println("Encontrou..");
    }

    // Opção B
    if (vetorPesquisa(teclado, vetor)) {
      System.out.println("Encontrou..");
    }

    teclado.close();
  }

  // Ler vetor - popular
  private void vetorLer(Scanner teclado, double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Valor: ");
      vetor[i] = teclado.nextInt();
    }
  }

  private boolean vetorPesquisa(Scanner teclado, double vetor[]) {
    System.out.println("Informe valor a ser pesquisado: ");
    double valorPesquisado = teclado.nextInt();
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valorPesquisado) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new Uni6Exe06();
  }
}