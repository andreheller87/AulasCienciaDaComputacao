import java.util.Scanner;

/*Para realizar o cálculo do Imposto de Renda a ser pago,
é solicitado a renda anual e o número de dependentes do contribuinte. 
A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada
dependente do contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00
não paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e
R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas líquidas
de R$ 5.000,00 até R$ 10.000,00 é de 10%.
Rendas superiores a R$ 10.000,00 pagam 15% de imposto
*/

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a renda do ano do contribuinte: ");
        double rendaAnual = teclado.nextDouble();
        System.out.print("Digite o numero de dependentes do contribuinte: ");
        int numeroDeDependentes = teclado.nextInt();
        double imposto = 0;

        double rendaMensal = (rendaAnual / 12);
        if (numeroDeDependentes > 0) {
            rendaMensal = rendaMensal - (rendaMensal * (0.02 * numeroDeDependentes));
        }

        if (rendaMensal <= 2000) {
            System.out.println("Não paga Imposto");
        } else if (rendaMensal > 2000 && rendaMensal <= 5000) {
            imposto = (rendaMensal * 5) / 100;
            System.out.println("O usuario vai ter que pagar " + imposto + "R$");
        } else if (rendaMensal > 5000 && rendaMensal <= 10000) {
            imposto = (rendaMensal * 10) / 100;
            System.out.println("O usuario vai ter que pagar " + imposto + "R$");
        } else if (rendaMensal > 10000) {
            imposto = (rendaMensal * 15) / 100;
            System.out.println("O usuario vai ter que pagar " + imposto + "R$");
        }

        teclado.close();
    }

}
