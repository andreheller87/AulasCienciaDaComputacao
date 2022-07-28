/*Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) 
e imprima o valor a pagar. O peso do prato é de 750 gramas.
*/
//Entrada
//quiloDaRefeicao
//pratoPesoMontado
//pratoPesoPrato
//pratoValor

//processo
// valor a pagar

//saida
// imprimir qtdAPagar




import java.util.Scanner;
public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    //Entrada
 double pratoPrecoRefeicao = 25.00;
 System.out.print("Digite a quantidade em quilos da refeição: ");
 double pratoPesoMontado = teclado.nextDouble();
 double pratoPesoPrato = 0.750;
 double pratoValor;

   //processo
   pratoValor = (pratoPesoMontado - pratoPesoPrato) * pratoPrecoRefeicao;
   //Saida
   System.out.println("O valor a pagar pelo cliente é: " + pratoValor+ " R$.");

   teclado.close();

    }
    
}
