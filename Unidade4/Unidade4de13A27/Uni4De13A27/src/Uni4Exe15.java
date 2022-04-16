/*Elabore um algoritmo para exibir o valor de reajuste que um funcionário 
receberá no seu salário. A empresa irá conceder 5% de reajuste para o funcionário
que for admitido há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses,
irá conceder 7% de reajuste. O seu algoritmo deve solicitar ao usuário que 
digite a quantidade de meses que o funcionário foi admitido.
*/

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quanto meses o funcionario trabalha na empresa: ");
        int meses = teclado.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionario recebera 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("O funcionario recebera 7% de reajuste");
        }

        teclado.close();
    }
}
