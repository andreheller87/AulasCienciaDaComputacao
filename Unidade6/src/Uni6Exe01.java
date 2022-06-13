
/*Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever*/
import java.util.Scanner;

public class Uni6Exe01 {
  private Uni6Exe01() {
    Scanner teclado = new Scanner(System.in);
    int vet[] = new int[10];
    vetorLer(teclado, vet);
    vetorEscrever(vet);
    teclado.close();
  }

  // Ler vetor
  private void vetorLer(Scanner teclado, int vet[]) {
    for (int i = 0; i < vet.length; i++) {
      System.out.println("valor [" + i + "]: ");
      vet[i] = teclado.nextInt();
    }
  }

  // escrever vetor
  private void vetorEscrever(int vet[]) {
    for (int i = vet.length - 1; i >= 0; i--) {
      System.out.println("vet[" + i + "]:" + vet[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe01();
  }

}