import java.util.Scanner;

/*Dado um número de ponto flutuante maior do que 0, informe se foram digitadas 
ou não casas
 decimais no número.
*/


public class Uni4Exe04 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Escreva um valor numero:");
    double valor = teclado.nextDouble();
    double resto = valor% (int)valor;

    if(resto == 0 || valor == 0){
        System.out.println("Valor sem nenhuma casa decimal");
    } else{
        System.out.println("Valor com casa decimal");
    }



  

    teclado.close();
}
    
}
