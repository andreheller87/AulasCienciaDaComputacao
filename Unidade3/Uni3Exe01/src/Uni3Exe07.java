/*Uma fábrica de refrigerantes vende seu produto em três formatos: 
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante 
compra uma determinada quantidade de cada formato, faça um programa para calcular
 quantos litros de refrigerante ele comprou.
*/
//Entrada 
//qtd350
//qtd600
//qtd2L

//processo somar quanto litros

//saida litrosComprado

import java.util.Scanner;
public class Uni3Exe07{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Entrada 
        double somaComprada;
        System.out.println("Digite a Quantidade de produtos");
        System.out.print("Lata 350ml : ");
    double qtd350 = teclado.nextDouble() * 0.350;
        System.out.print("Pet 600ml: ");
    double qtd600 = teclado.nextDouble() * 0.600;
        System.out.print("Pet 2Litros: ");
    double qtd2L = teclado.nextDouble() * 2.00;

    //processo
    somaComprada = qtd350 + qtd600 + qtd2L;

        //Saida
        System.out.println("A quantidade de litros comprado pelo cliente foi : " + somaComprada);

        teclado.close();
    }
}
