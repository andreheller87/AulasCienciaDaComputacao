import java.text.DecimalFormat;
import java.util.Scanner;

/*Escreva um programa que leia o número de um funcionário,
 seu número de horas trabalhadas, o valor que recebe por hora 
 e calcula o salário desse funcionário. A seguir, mostre o número 
 e o salário do funcionário
, com duas casas decimais.
*/ 



public class Uni2Exe06 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero do Funcionario: ");
        int funcionario = teclado.nextInt();

        System.out.print("Digite o numero de horas trabalhadas: ");
        double funcionarioHorasTrabalhada = teclado.nextDouble();

        System.out.print("Digite quanto o funcionario ganha por hora: ");
        double funcionarioGanhaPorHora = teclado.nextDouble();

        double funcionarioSalario = funcionarioGanhaPorHora * funcionarioHorasTrabalhada;

        System.out.println("Funcionario numero: " + funcionario);
        System.out.println("Funcionario recebera o salario de: " +df.format(funcionarioSalario));



        teclado.close();
    }
}
