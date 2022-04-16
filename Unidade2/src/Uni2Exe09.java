import java.text.DecimalFormat;
import java.util.Scanner;

/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
 Para isto ela entregou um valor em dólares para o atendente. 
 Considerando que o atendente tem a cotação do dólar,
 calcule quantos reais o atendente deve devolver para a pessoa.

*/ 


public class Uni2Exe09 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00 R$");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a qtd em dolar: ");
        double valorEmDolar = teclado.nextDouble();
        double valorEmReais = valorEmDolar * 4.76;

        System.out.println("Você recebera " +df.format(valorEmReais)  );
        teclado.close();
    }
    
}
