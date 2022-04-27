import java.text.DecimalFormat;

/*Descreva um algoritmo para calcular o valor de S dado por:


Considere os 20 primeiros termos da série.*/

public class Uni5Exe04 {
    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("0");
        DecimalFormat df2 = new DecimalFormat("0.00");
        double impar = 1;
        double divisor = 2;
        double soma = 0;
        double par = 0;
        double numX = 1;
        for (double i = 1; i <= 40; i++) {

            impar = i + 1;

            if (impar % 2 == 1) {
                divisor = divisor + par;
                System.out.println(df1.format(impar));
                System.out.println("----");
                System.out.println(df1.format(divisor));
                System.out.println();
                soma = soma + impar / divisor;

                numX++;
                par = numX * 2;

            }

        }
        System.out.println("Soma Da Frações: " + df2.format(soma));
    }

}
