import java.util.Scanner;

/*Uma loja que trabalha com crediário funciona da seguinte maneira:
se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% 
de desconto e é avisado que o pagamento está em dia. Se o pagamento
é realizado até cinco dias após o vencimento o cliente perde o desconto, 
e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por
cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia 
do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente,
exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia
dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.*/

public class Uni4Exe18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia do vencimento");
        int diaVencimento = teclado.nextInt();
        System.out.println("Digite o dia do Pagamento");
        int diaDoPagamento = teclado.nextInt();
        System.out.println("Digite o valor da Parcela: ");
        double valorDaParcela = teclado.nextDouble();
        int diaDeAtraso = (diaVencimento +5) - diaDoPagamento;

        if (diaDoPagamento <= diaVencimento) {
            valorDaParcela = valorDaParcela - (valorDaParcela * 10)/100;
            System.out.println("Cliente você ganhou desconto de 10% por estar em dia");
            System.out.println("Sua Parcela ficara por: " + valorDaParcela + "R$");
        } else {
            if (diaDoPagamento > diaVencimento && diaDoPagamento < (diaVencimento + 5)) {
                System.out.println("Sua Parcela ficara por: " + valorDaParcela + "R$");
            } else {
                if (diaDoPagamento >= (diaVencimento + 5)) {
                    valorDaParcela = valorDaParcela + ((((valorDaParcela * 2)/100) * diaDeAtraso)*-1);
                    System.out.println("Cliente você ganhou um multa de 2% ao dia por estar em atraso");
                    System.out.println("Sua Parcela ficara por: " + valorDaParcela + "R$");

                }
            }
        }

        teclado.close();

    }

}
