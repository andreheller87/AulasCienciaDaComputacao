import java.util.Scanner;

/*12% de desconto nos produtos.
 Escreva um programa para calcular e exibir o valor de desconto a ser 
 dado num par de sapatos e quanto deve custar o produto com o desconto.
  O preço do par de sapatos deve ser informado pelo usuário. Como resultado,
   o programa deverá exibir as seguintes mensagens:
O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx


//analize
//ok
//Entrada
preço do par de sapato
//processo
12% de desconto

//saida
o valor do desconto
o preço do sapato com desconto

*/
public class Uni3Exe02 {
    public static void main(String[] args) {
        //Entradas
        Scanner teclado = new Scanner(System.in);
      double sapatoPreco=0;
      double sapatoDesconto=0;
      double sapatoPrecoDesconto = 0;

      System.out.println("Entre com o valor do sapato");
      sapatoPreco = teclado.nextDouble();
      //processo

      sapatoDesconto = sapatoPreco * 0.10;
      sapatoPrecoDesconto = sapatoPreco - sapatoDesconto;

      //saida
        System.out.println("O valor Do desconto é :" + sapatoDesconto);
        System.out.println("O vlaor do produto é " + sapatoPrecoDesconto);

        
        teclado.close();
    }
    
}
