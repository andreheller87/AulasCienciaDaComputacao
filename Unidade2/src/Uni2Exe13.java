import java.util.Scanner;

/*Dois carros (X e Y) partem na mesma direção.
 O carro X sai com uma velocidade constante de 60 km/h
  e o carro Y sai com uma velocidade constante de 90 km/h.

Em uma hora (60 minutos) o carro Y pode percorrer uma 
distância de 30 quilômetros do carro X, ou seja, ele
pode se afastar um quilômetro a cada 2 minutos.

Leia a distância (em km) e calcule quanto tempo leva
 (em minutos) para o carro Y percorrer essa distância
  em relação ao outro carro.

Entrada
O arquivo de entrada contém 1 valor inteiro.

Saída
Imprima o tempo necessário seguido da mensagem 
"minutos" que significa minutos em português.
*/
public class Uni2Exe13 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int distanciaFornecida = teclado.nextInt();
    int qtdMinutos ;

    qtdMinutos = (60 *distanciaFornecida)/30;

    System.out.println( qtdMinutos + " minutos" );

    teclado.close();
}
}
