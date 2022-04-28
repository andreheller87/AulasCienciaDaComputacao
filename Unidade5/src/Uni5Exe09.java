import java.util.Scanner;

/*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:
escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima de 20 anos.*/


public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int n =teclado.nextInt();
        String nomes = "";
        int idade = 0;
        String todosOsNomes ="";
        int qtdDeMaioresDe20 = 0;

        for(int i=0;i<n;i++){

            System.out.print("digite o nome: ");
            nomes = teclado.next();
            System.out.print("Digite a idade: ");
            idade =teclado.nextInt();
            if(idade == 18){
               

                todosOsNomes = todosOsNomes + nomes + ", ";
                }else{
                    if(idade>20){
                        qtdDeMaioresDe20++;
                    }
                }



        }

        System.out.println("Os alunos "+todosOsNomes + " tem 18 anos");
        System.out.println("Tem " + qtdDeMaioresDe20 +" de alunos maiores que 20 anos");
    
    
    
    teclado.close();
    
}}
