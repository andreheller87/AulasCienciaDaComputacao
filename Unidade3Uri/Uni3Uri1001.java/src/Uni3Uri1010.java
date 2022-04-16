/*Neste problema, a tarefa é ler o código de um produto 1, o número de unidades 
do produto 1, o preço de uma unidade do produto 1, o código de um produto 2, o número 
de unidades do produto 2 e o preço para uma unidade de produto 2. Após isso, calcule 
e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores:
 dois inteiros e um valor flutuante com 2 dígitos após o ponto decimal.

Saída
O arquivo de saída deve ser uma mensagem como no exemplo a seguir onde 
"Valor a pagar" significa Valor a Pagar . Lembre-se do espaço após o símbolo ":"
 e após o símbolo "R$". O valor deve ser apresentado com 2 dígitos
 após o ponto.

*/

import java.util.Scanner;

public class Uni3Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      int produto1Cod = teclado.nextInt();
      int produto1Qtd = teclado.nextInt();
      double produto1Valor= teclado.nextDouble();
      int produto2Cod = teclado.nextInt();
      int produto2Qtd = teclado.nextInt();
      double produto2Valor = teclado.nextDouble();
        double valorTotal;

        valorTotal = (produto1Qtd * produto1Valor ) + (produto2Qtd * produto2Valor);
    



        System.out.println("produto 1 " + produto1Cod +"produto 2 " +produto2Cod);
        System.out.println( "VALOR A PAGAR: R$" +String.format("%.2f", valorTotal));
        teclado.close();
        
    }
}

