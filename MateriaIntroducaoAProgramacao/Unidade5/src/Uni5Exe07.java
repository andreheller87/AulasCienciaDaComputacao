import java.util.Scanner;

/*Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.
*/


public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a qtd de Numeros que você quer comparar o maior");
        int n = teclado.nextInt();
        double numeros = 0;
        double troca = 0;
        
        
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero Real:");
            numeros = teclado.nextDouble();

            if(troca<= numeros){
                troca = numeros;
            }

        }
        System.out.println("O maior numero digitado foi o: " + troca);

        teclado.close();
    }
}
