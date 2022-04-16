/*Faça um programa para ler três notas de um aluno em uma disciplina
 e imprimira sua média ponderada 
(as notas tem pesos respectivos de 5, 3 e 2).
*/

//Entrada 
// ler 3 notas
//ler disciplina

//processo
//nota ponderada

//saida
// imprimir media

import java.util.Scanner;
public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Entradas
        double nota1, nota2 , nota3;
        double mediaPonderada;
        String disciplina;
        String nomeAluno;

        System.out.print("Digite a disciplina: ");
        disciplina = teclado.nextLine();
        System.out.print("Digite o nome do aluno: ");
        nomeAluno =  teclado.nextLine();
        System.out.println("Digite as 3 notas do aluno");
        nota1= teclado.nextDouble();
        nota2= teclado.nextDouble();
        nota3= teclado.nextDouble();

        //processo
        nota1= nota1 * 5;
        nota2= nota2 * 3;
        nota3 = nota3 * 2;
        mediaPonderada = (nota1 + nota2 + nota3)/10;


        System.out.println("A media do aluno "+ nomeAluno +" na materia de "+ disciplina+ " é: " + mediaPonderada);

        teclado.close();

    }
}
