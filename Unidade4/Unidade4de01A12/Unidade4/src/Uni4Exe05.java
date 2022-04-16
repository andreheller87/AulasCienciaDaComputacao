
/*Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/
import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A Cor é Azul? Sim ou Não");
        String resposta = teclado.next();

        if (resposta.equals("Sim") || resposta.equals("sim")) {
            System.out.println("Sim");
        } else {
            System.out.println("Nâo");
        }

        teclado.close();

    }

}
