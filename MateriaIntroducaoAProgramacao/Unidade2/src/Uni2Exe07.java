import java.util.Scanner;

/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
 de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
  ganha 15% de comissão sobre suas vendas efetuadas, informar o total
   a receber no final do mês, 
com duas casas decimais.
*/ 
  
  
  public class Uni2Exe07 {
      public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          System.out.print("Digite o nome do funcionario: ");
          String funcionarionome = teclado.nextLine();

          System.out.print("Digite o Salario Do funcionario: ");
          double funcionarioSalario = teclado.nextDouble(); 

          System.out.print("Digite o total de vendas realizada pelo Funcionario: ");
          double funcionarioTotalVendas = teclado.nextDouble();

          double salarioComComissao = ((funcionarioTotalVendas*15) /100) + funcionarioSalario;

        System.out.println("O salario com comissão do funcionario: " +funcionarionome+ " é " + salarioComComissao);
          teclado.close();
      }
    
}
