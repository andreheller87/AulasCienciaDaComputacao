import java.util.Scanner;
import java.text.DecimalFormat;

/*Leia dois valores de ponto flutuante e calcule a média
 ponderada sabendo que a note A tem peso 3.5 e nota B 7.5
  (a soma dos pesos é 11)
 sendo que a nota vai de 0.0 a 10.0.

*/ 

public class Uni2Exe04{
     public static void main(String[] args) {

         DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é a Primeira Nota:");
        double notaA = teclado.nextDouble();
        System.out.print("Qual é a Segunda Nota:");
        double notaB = teclado.nextDouble();
        double mediaPonderada = (notaA * 3.5 + notaB* 7.5) /11;

        System.out.println("A media é: " +df.format(mediaPonderada) );
        teclado.close();
     }
    
}
