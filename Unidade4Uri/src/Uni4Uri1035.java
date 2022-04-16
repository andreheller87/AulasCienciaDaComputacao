import java.util.Scanner;

/*Leia 4 valores 
inteiros A, B, C e D. Então se B for maior que C e D
 for maior que A e se a soma de C e D for maior que a 
 soma de A e B e se C e D forem valores positivos e se
  A for par, escreva a mensagem “Valores aceitos” .
   Caso contrário, escreva a mensagem “Valores não
    aceitos” (Valores não aceitos).

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a mensagem correspondente após a validação 
dos valores​​.
*/


public class Uni4Uri1035 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valorA = teclado.nextInt();
    int valorB = teclado.nextInt();
    int valorC = teclado.nextInt();
    int valorD = teclado.nextInt();

    if (valorB > valorC && valorD > valorA && (valorC + valorD)> (valorA + valorB) && (valorC%2 == 0)&&(valorD%2 == 0)){
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores nao aceitos");
    }



  




    teclado.close();
}



}