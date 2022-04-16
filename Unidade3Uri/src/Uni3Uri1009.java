/*Faça um programa que leia o nome de um vendedor, seu salário fixo e o total 
da venda feita por ele mesmo no mês (em dinheiro). Considerando que este 
vendedor recebe 15% sobre todos os produtos vendidos, escreva o salário 
final (total) deste vendedor ao final do mês, com duas casas decimais.

- Não se esqueça de imprimir o final da linha após o resultado,
 caso contrário você receberá “ Erro de apresentação ”.

- Não se esqueça dos espaços em branco.

Entrada
O arquivo de entrada contém um texto (primeiro nome do funcionário),
 e dois valores de precisão dupla, que são o salário do vendedor e o 
 valor total vendido por ele.

Saída
Imprima o salário total do vendedor, conforme o exemplo dado.

*/

import java.util.Scanner;

public class Uni3Uri1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      String funcionarioNome = teclado.nextLine();
      double valorSalario = teclado.nextDouble();
      double valorVendido = teclado.nextDouble();
      double valorTotalVendido;

      valorTotalVendido = valorSalario + ((valorVendido * 15)/100);


        System.out.println(funcionarioNome);
        System.out.println("TOTAL = R$ "+String.format("%.2f", valorTotalVendido) );
        teclado.close();
        
    }
}