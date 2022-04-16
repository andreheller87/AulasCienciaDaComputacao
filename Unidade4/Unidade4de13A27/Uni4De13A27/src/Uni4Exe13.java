import java.util.Scanner;

/*Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as 
três cartas deste usuário em uma mão de jogo de truco
 (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei).
 O algoritmo deve imprimir na tela a palavra "TRUCO" 
(se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS"
 (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE"
(se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas
 três cartas, não é impresso nada.
Dica: criar variáveis intermediárias para contar a quantidade de "boas".
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira carta:");
        int carta1 = teclado.nextInt();
        System.out.println("Digite a Segunda carta:");
        int carta2 = teclado.nextInt();
        System.out.println("Digite a Terceira carta:");
        int carta3 = teclado.nextInt();
        int qtdDeCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdDeCartasBoas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdDeCartasBoas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdDeCartasBoas++;
        }

        if (qtdDeCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (qtdDeCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qtdDeCartasBoas == 3) {
            System.out.println("NOVE");
        }

        teclado.close();

    }
}
