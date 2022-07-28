import java.util.Scanner;

/*Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e 
execute a operação correspondente. O algoritmo deve exibir uma mensagem de erro
 se a opção for inválida. O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero).
*/

public class Uni4Exe25 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora Poderosa ");
        System.out.println("Digite o primeiro termo");
        double termo1 = teclado.nextDouble();
        System.out.println("Digite o operador (+,-,/,*,)");
        char operador = teclado.next().charAt(0);
        System.out.println("Digite o segundo termo");
        double termo2 = teclado.nextDouble();
        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = termo1 + termo2;
                break;
            case '-':
                resultado = termo1 - termo2;
                break;
            case '*':
                resultado = termo1 * termo2;
                break;
            case '/':
                if (termo2 == 0) {
                    System.out.println("Divisão por Zero!!");
                    System.out.println("ERRO!!");
                } else {
                    resultado = termo1 / termo2;
                }
                break;
            default:
                System.out.println("Operador ERRADO!!");
                break;
               
        }

        System.out.println("Resultado " + resultado);

        teclado.close();

    }

}
