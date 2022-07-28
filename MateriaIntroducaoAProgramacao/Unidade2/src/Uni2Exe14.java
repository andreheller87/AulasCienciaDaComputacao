import java.util.Scanner;

/*Neste problema você tem que ler um valor inteiro e calcular o menor número
 possível de notas em que o valor pode ser decomposto. As notas possíveis são 
 100, 50, 20, 10, 5, 2 e 1. Imprima o valor lido e a lista de notas.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o número lido e a quantidade mínima de cada cédula necessária em
 língua portuguesa, conforme o exemplo dado. Não se esqueça de imprimir o
  final de linha após cada linha, caso contrário você receberá “Erro de apresentação” .

*/



public class Uni2Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        int n100 = (valor / 100);
        int n50 = (valor%100)/50;
        int n20 = ((valor%100) %50)/20;
        int n10 = (((valor%100) %50)%20)/10;
        int n05 = ((((valor%100) %50)%20)%10)/5;
        int n02 = (((((valor%100) %50)%20)%10)%5)/2;
        int n01 = ((((((valor%100) %50)%20)%10)%5)%2)/1;

        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 +" nota(s) de R$ 50,00");
        System.out.println(n20 +" nota(s) de R$ 20,00");
        System.out.println(n10 +" nota(s) de R$ 10,00");
        System.out.println(n05 +" nota(s) de R$ 5,00");
        System.out.println(n02 + " nota(s) de R$ 2,00");
        System.out.println(n01 +" nota(s) de R$ 1,00");



        teclado.close();


    }
}
