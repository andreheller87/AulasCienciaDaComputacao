import java.text.DecimalFormat;
import java.util.Scanner;

/*Uma empresa tem para um funcionário os
 seguintes dados: o nome, o número de horas 
 trabalhadas mensais e o número de dependentes.
  A empresa paga R$ 10,00 por hora (valor para 
  cálculo do salário trabalho) e R$ 60,00 por dependente 
  (valor para cálculo do salário família) e são feitos descontos
   de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o 
   salário trabalho para o imposto de renda. Descreva um programa 
   que informe o nome, 
o salário bruto e o salário líquido do funcionário.
*/
public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Digite o nome do Funcionario: ");
        String funcionarioNome = teclado.nextLine();
        System.out.print("Digite as horas trabalhadas do funcionario " + funcionarioNome + ": ");
        int funcionarioHoraTrabalhadas = teclado.nextInt();
        System.out.print("Digite numero de Dependentes: ");
        int funcionarioNumDependente = teclado.nextInt();

        double calcularSalario = (double) 10 * funcionarioHoraTrabalhadas + (60 * funcionarioNumDependente);

        double calculoINSS = (calcularSalario * 8.5) / 100;
        double calculoLiquido = (calcularSalario - calculoINSS);

        double calculoIR = (calculoLiquido * 5) / 100;

        calculoLiquido = calculoLiquido - calculoIR;

        System.out.println("Salario bruto = " + df_2.format(calcularSalario));
        System.out.println("Salario liquido = "+ df_2.format(calculoLiquido));
        
        teclado.close();
    }

}
