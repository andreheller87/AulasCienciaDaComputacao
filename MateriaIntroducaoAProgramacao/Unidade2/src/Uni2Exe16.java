import java.util.Scanner;

/*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml,
 garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada 
 quantidade de cada formato, informe quantos litros de refrigerante ele comprou.
*/

public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qtd de Latas 300ml: ");
        int qtdLata = teclado.nextInt();

        System.out.print("Qtd de garrafas 600ml: ");
        int qtd600 = teclado.nextInt();

        System.out.print("Qtd de garrafas 2000ml: ");
        int qtd2L = teclado.nextInt();

        int qtdTotal = (qtdLata * 300 + qtd600 * 600 + qtd2L * 2000)/1000;

        System.out.println("Quantidade em litros comprada pelo cliente foi: " + qtdTotal + " Litros");

        teclado.close();
    }
    
}
