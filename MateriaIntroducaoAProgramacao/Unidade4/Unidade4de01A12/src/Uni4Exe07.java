import java.text.DecimalFormat;
import java.util.Scanner;

/*O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso
superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem
aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, determine o 
custo do selo.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

public class Uni4Exe07 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o peso da carta:");
        float pesoDaCarta = teclado.nextFloat();
        float valorAPagar = 0;
        float pesoExedido;
        float qtAdicional;
        if (pesoDaCarta <= 50) {
            valorAPagar = 0.45f;
        } else {
            pesoExedido = pesoDaCarta - 50;
            qtAdicional = (pesoExedido / 20) + 1;
            valorAPagar = 0.45f + 0.45f * qtAdicional;
        }

        System.out.println("Custo do selo : " + df.format(valorAPagar) + " R$");

        teclado.close();

    }
}
