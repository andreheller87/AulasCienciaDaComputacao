/*Escreva um programa que leia o número de um funcionário, seu número de horas 
 em um mês e o valor que ele recebeu por hora. Imprima o número do funcionário
  e o salário que ele receberá no final do mês, com duas casas decimais.

Não se esqueça de imprimir o final da linha após o resultado, caso contrário 


você receberá “Erro de apresentação”.
Não se esqueça do espaço antes e depois do sinal igual e depois do U$.
Entrada
O arquivo de entrada contém 2 números inteiros e 1 valor de ponto flutuante,
 representando o número, a quantidade de horas trabalhadas e a quantidade que
 
 o funcionário recebe por hora trabalhada.

Saída
Imprima o número e o salário do funcionário, conforme o exemplo dado, 
com um espaço em branco antes e depois do sinal de igual.

*/


import java.util.Scanner;

public class Uni3Uri1008{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numfuncionário = teclado.nextInt();
        int numHorasMes = teclado.nextInt();
        double numValorDaHora = teclado.nextDouble();
        double numValorSalario;

        numValorSalario = numValorDaHora * numHorasMes;
     
      
      
        System.out.println("NUMBER = " + numfuncionário);
        System.out.println("SALARY = U$ "+String.format("%.2f", numValorSalario));
        
        
        teclado.close();
        
    }
}
