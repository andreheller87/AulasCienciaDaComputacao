import java.util.Scanner;

/*Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/


public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = teclado.next().charAt(0);

     
        boolean teste = letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'|| letra == 'u' ||
         letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O'|| letra == 'U';

        if(teste){
            System.out.println("A Letra É uma Vogal");

        }else{
            System.out.println("A Letra Não É Vogal");
        }


        teclado.close();
    }
}
