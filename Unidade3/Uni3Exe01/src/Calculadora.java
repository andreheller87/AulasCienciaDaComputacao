import java.util.Scanner;

public class Calculadora {
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

        /*
         * if (operador == '+') {
         * resultado = termo1 + termo2;
         * } else {
         * if (operador == '-') {
         * resultado = termo1 - termo2;
         * } else {
         * if (operador == '*') {
         * resultado = termo1 * termo2;
         * } else {
         * if (operador == '/') {
         * resultado = termo1 / termo2;
         * }else {
         * System.out.println("Operador ERRADO!!");
         * }
         * }
         * }
         * }
         */

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
            if (termo2 == 0){
                System.out.println("Divisão por Zero!!");
            }else{
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
