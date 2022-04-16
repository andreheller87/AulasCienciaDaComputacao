import java.util.Scanner;

/*Você deve fazer um programa que leia um número de ponto flutuante e 
imprima uma mensagem dizendo em qual dos seguintes intervalos o número pertence:
 [0,25] (25,50], (50,75], (75,100). número for menor que zero ou maior que 100,
  o programa deve imprimir a mensagem “Fora de intervalo” que significa 
  “Fora de intervalo”.

O símbolo '(' representa maior que. Por exemplo:
[0,25] indica números entre 0 e 25,0000, incluindo ambos.
(25,50] indica números maiores que 25 (25,00001) até 50,0000000.

Entrada
O arquivo de entrada contém um número de ponto flutuante.

Saída
A saída deve ser uma mensagem como o exemplo a seguir.*/

public class Uni4Uri1037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor = teclado.nextDouble();
        if (valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        }else if(valor>=0 && valor <= 25 ){
            System.out.println("Intervalo [0,25]");
        } else if(valor>0 && valor <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(valor>0 &&valor <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(valor>0 &&valor <= 100){
            System.out.println("Intervalo (75,100]");
        } 


    teclado.close();
    }
    
    
}
