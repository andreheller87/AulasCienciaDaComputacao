/*Ler um valor inteiro, que é a duração em segundos de um determinado 
evento em uma fábrica, 
e informá-lo expresso em horas:minutos:segundos.

Entrada
O arquivo de entrada contém um inteiro N .

Saída
Imprima o tempo de leitura no arquivo de entrada (segundos) convertido
 em horas:minutos:segundos como no exemplo a seguir.*/
import java.util.Scanner;

public class Uni3Uri1019{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorEmSegundos = teclado.nextInt();
        int valorHoras = (valorEmSegundos/60)/60;
        int valorMinutos =( valorEmSegundos /60)%60;
        
        valorEmSegundos = valorEmSegundos %60;

        System.out.println(valorHoras + ":" + valorMinutos + ":" +valorEmSegundos);







        teclado.close();
    }
}
