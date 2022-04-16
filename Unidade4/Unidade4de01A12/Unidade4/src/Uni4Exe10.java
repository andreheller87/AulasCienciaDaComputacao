import java.util.Scanner;

/*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha.
Faça um algoritmo para ler as idades dos filhos e 
exibir quem é o caçula da família;
 suponha que não haja empates.
 //Entrada
 ler marquinhos
 ler zezinho
 ler luluzinha

 //processo 
 menor idade

 //saida
 imprimir("O caçula é: ")
*/

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idadeMarquinho, idadeZezinho, idadeLuluzinha;

        System.out.println("Entre com a idade do Marquinho: ");
        idadeMarquinho = teclado.nextInt();
        System.out.println("Entre com a idade do Zezinho: ");
        idadeZezinho = teclado.nextInt();
        System.out.println("Entre com a idade do Luluzinha: ");
        idadeLuluzinha = teclado.nextInt();

        // processo

        if (idadeMarquinho < idadeZezinho && idadeMarquinho < idadeLuluzinha) {
            System.out.println("Caçula: Marquinho");
        } else {
            if (idadeZezinho < idadeLuluzinha) {
                System.out.println("Caçula: Zezinho");
            } else {
                System.out.println("Caçula: Luluzinha");
            }
        }

        teclado.close();
    }

}
