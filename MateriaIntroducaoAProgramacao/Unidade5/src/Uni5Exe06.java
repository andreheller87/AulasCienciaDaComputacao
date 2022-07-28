import java.text.DecimalFormat;
import java.util.Scanner;

/*Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

*/


public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a altura de 20 pessoas");
        double altura=0;
        double media = 0;
        double soma =0;
        DecimalFormat df = new DecimalFormat("0.00");

        for(int i= 0; i<20;i++){
            
            altura = teclado.nextDouble();
            soma = soma + altura;


        }

        media = soma / 20;

        System.out.println("A media da altura das vinte pessoas é: " +df.format(media) );

        teclado.close();
        
    }
}
