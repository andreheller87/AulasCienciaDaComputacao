import java.util.Scanner;

/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora 
regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas 
trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário,
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas horas o funcionario trabalhou: ");
        int horasTrabalhadas = teclado.nextInt();
        System.out.print("Entre com o valor da hora do trabalhador: ");
        double valorHoras = teclado.nextDouble();
        double funcionarioSalario = horasTrabalhadas * valorHoras ;
        double horaExtra;


        if (horasTrabalhadas >160){
            horaExtra = (horasTrabalhadas-160) * (valorHoras/2);
            funcionarioSalario = funcionarioSalario + horaExtra;
            
        } 

            System.out.print("Funcionario recebera o pagamento de: " + funcionarioSalario);
       
       teclado.close();
       
        }


        
    }

