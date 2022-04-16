

/*


 Escreva um programa para ler o preço do litro da gasolina e 
 o valor do pagamento e 
exibir quantos litros ele conseguiu colocar no tanque.
*/

//gordura
//Um motorista deseja abastecer seu tanque de combustível.
//entrada
//ler o preço do litro da gasolina e 
//ler valor do pagamento 
//saida
//exibir quantos litros ele conseguiu colocar no tanque.

import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double gasolinaPreco=0;
        double valorDoPagamento=0;
        double qtdLitros=0;

        //Entrada
        System.out.println("Entre com o preço da gasolina: ");
        gasolinaPreco = teclado.nextDouble();
        System.out.println("Entre com o valor a pago : ");
        valorDoPagamento = teclado.nextDouble();

        //processo
        qtdLitros = valorDoPagamento / gasolinaPreco;


        //saida
        System.out.println("Você conseguil colocar " + qtdLitros + " litros.");


        teclado.close();
    }
}


