/*Uma granja possui um controle automatizado de cada frango da sua produção.
 No pé direito do frango há um anel com um chip de identificação; no pé esquerdo 
 são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que
  o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa
   para calcular o gasto total da granja para marcar todos os seus 
frangos.
*/

//entrada
//anelChip
//anelAlimento

//processo
//calcular quanto custa para indentificar os frangos

//saida
//Gasto
import java.util.Scanner;
public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double qtdFrangos, qtdGasto;
        final double anelChip = 4.00;
        final double anelAlimento = 3.50;


        //Entrada
        System.out.print("Escreva a quantidade de frangos: ");
        qtdFrangos = teclado.nextDouble();

        //Processo
        qtdGasto = qtdFrangos * anelChip + (qtdFrangos *2)*anelAlimento;

        //Saida
        System.out.println("Quantidade Gasta pela empressa para indentificar os frangos é: " + qtdGasto);

        teclado.close();

    }
    
}
