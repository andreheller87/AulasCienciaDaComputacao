/*Descreva um programa que a partir da distância percorrida e o do tempo gasto 
por um motorista durante uma viagem de final de semana, calcule a velocidade 
média e a quantidade de combustível gasto na viagem, 
sabendo que o automóvel faz 12 km por litro.
*/ 
import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni3Exe14 {
    public static void main(String[] args) {
        DecimalFormat df_2 = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double percorridaDistancia = teclado.nextDouble();
        double percorridaTempo = teclado.nextDouble();
        double velocidadeMedia = percorridaDistancia / percorridaTempo;
        double gastoCombustivel = percorridaDistancia / 12;


        System.out.println("A velocidade Media do automovel é: " + df_2.format(velocidadeMedia));
        System.out.println("O veiculo Gastou: " + df_2.format(gastoCombustivel) + " litros de gasolina");

        teclado.close();
    }
    
}
