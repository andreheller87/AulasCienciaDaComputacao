import java.util.Scanner;
/*Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno,
 usando a fórmula:

media=(notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7

A atribuição dos conceitos obedece à tabela abaixo:

media	conceito
>= 9.0	A
>= 7.5 e < 9.0	B
>= 6.0 e < 7.5	C
>= 4.0 e < 6.0	D
< 4.0	E
O algoritmo deve escrever a média de aproveitamento, o conceito correspondente 
e a mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado"
 caso o conceito seja D ou E.*/

public class Uni4Exe20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira Nota");
        double notaProva1 = teclado.nextDouble();
        System.out.println("Digite a segunda Nota");
        double notaProva2 = teclado.nextDouble();
        System.out.println("Digite a Terceira Nota");
        double notaProva3 = teclado.nextDouble();
        System.out.println("Digite a nota dos Exercicios");
        double notaExercicios = teclado.nextDouble();

        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

        if (media >= 9.0) {
            System.out.println("Aluno Aprovado nota:A");
        } else {
            if (media >= 7.5 && media < 9.0) {
                System.out.println("Aluno Aprovado nota:B");
            } else {
                if (media >= 6 && media < 7.5) {
                    System.out.println("Aluno Aprovado nota:C");
                } else {
                    if (media >= 4.0 && media < 6.0) {
                        System.out.println("Aluno Reprovado nota:D");
                    } else {
                        if (media < 4.0) {
                            System.out.println("Aluno Reprovado nota:E");
                        }
                    }
                }
            }
        }

        teclado.close();
    }
}