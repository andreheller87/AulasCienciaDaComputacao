import java.util.Scanner;

/*Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
escreva o menor valor negativo;
escreva a média dos números positivos.*/

public class Uni5Exe08 {
    public static void main(String[] args) {
        System.out.println("Digite a qtd de numeros que você quer saber o menor valor negativo e a media dos positivos:");

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int numero = 0,troca =0,soma =0,qtdVezes = 0,media = 0;
        

        for(int i=0;i<n;i++){
            System.out.print("Digite um numero inteiro: ");
            numero = teclado.nextInt();

            if(numero< 0 && numero<troca){
                troca = numero;
            }

            if(numero>0){
                
                soma = soma + numero;
                qtdVezes++;
                
            }
        }
        media = soma/qtdVezes;

        System.out.println("O menor numero negativo é: " + troca);
        System.out.println("A media dos positivos é : " + media);

       teclado.close();
        
    }
    
}
