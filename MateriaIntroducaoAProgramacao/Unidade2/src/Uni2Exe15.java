
import java.util.Scanner;

/*Leia um valor de ponto flutuante com duas casas decimais. Isso representa
 um valor monetário.
 Depois disso, calcule o menor número possível de notas e moedas em que
  o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2.
   As moedas possíveis são de 1, 0,50, 0,25, 0,10, 0,05 e 0,01. 
   Imprima a mensagem “NOTAS:” seguida da lista de notas e a mensagem
    “MOEDAS:” seguida da lista de moedas.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1.000.000,00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para alterar o valor inicial,
 conforme o exemplo dado.*/ 


public class Uni2Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        
        
        double valorinformado = teclado.nextDouble();
        int valor = (int) valorinformado;
        int n100 = (valor / 100);
        int n50 = (valor%100)/50;
        int n20 = ((valor%100) %50)/20;
        int n10 = (((valor%100) %50)%20)/10;
        int n05 = ((((valor%100) %50)%20)%10)/5;
        int n02 = (((((valor%100) %50)%20)%10)%5)/2;
        int reston02 = (((((valor%100) %50)%20)%10)%5)%2;

        double valorCentavos= (valorinformado - valor+ reston02)* 100.0; 
        int valor2 = (int ) valorCentavos;
     

        int n01 = (valor2 / 100);

        int n050 = (valor2%100)/50;
        int n025 = ((valor2%100) %50)/25;
        int n010 = (((valor2%100) %50)%25)/10;
        int n005 = ((((valor2%100) %50)%25)%10)/5;
        int n001 = (((((valor2%100) %50)%25)%10)%5)/1;
       

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 +" nota(s) de R$ 50.00");
        System.out.println(n20 +" nota(s) de R$ 20.00");
        System.out.println(n10 +" nota(s) de R$ 10.00");
        System.out.println(n05 +" nota(s) de R$ 5.00");
        System.out.println(n02 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(n01 + " moeda(s) de R$ 1.00");
        System.out.println(n050 +" moeda(s) de R$ 0.50");
        System.out.println(n025 +" moeda(s) de R$ 0.25");
        System.out.println(n010 +" moeda(s) de R$ 0.10");
        System.out.println(n005 +" moeda(s) de R$ 0.05");
        System.out.println(n001+ " moeda(s) de R$ 0.01");



       
        



    teclado.close();


    }
}
