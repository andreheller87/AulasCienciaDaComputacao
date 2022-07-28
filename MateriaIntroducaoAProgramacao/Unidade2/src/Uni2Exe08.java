import java.text.DecimalFormat;
import java.util.Scanner;

/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a
 ser pago.
*/ 



public class Uni2Exe08 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o codigo: ");
        int peca1Cod = teclado.nextInt();
        System.out.print("Digite quantidade: ");
        int peca1Qtd = teclado.nextInt();
        System.out.print("Digite o preço: ");
        double peca1Valor = teclado.nextDouble();

        System.out.print("Digite o codigo: ");
        int peca2Cod = teclado.nextInt();
        System.out.print("Digite quantidade: ");
        int peca2Qtd = teclado.nextInt();
        System.out.print("Digite o preço: ");
        double peca2Valor = teclado.nextDouble();

        double qtdTotal = peca1Qtd * peca1Valor + peca2Qtd *peca2Valor;

        System.out.println("Cod: " + peca1Cod);
        System.out.println("Cod: " + peca2Cod);
        System.out.println("Quantidade a pagar: " +df.format(qtdTotal) );
         
        teclado.close();
    }
    
}
