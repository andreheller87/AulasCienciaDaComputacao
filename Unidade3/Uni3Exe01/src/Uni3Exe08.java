/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
 Para isto ela entregou um valor em dólares para o atendente.
  Considerando que o atendente tem a cotação do dólar, 
  descreva um programa para calcular
 quantos reais o atendente deve devolver para a pessoa.

*/

//Entrada
//dolarCotacao;
//dolarQtd;

//processo
//multiplicar dolar pela cotação

//saida
//qtdReais


import java.util.Scanner;
public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double dolarCotacao = 5.02;
        double reais;
        System.out.print("Digite a quantidade em dolar para a conversão: ");
        double dolarQtd = teclado.nextDouble();

        //processo
        reais= dolarQtd * dolarCotacao;

        //saida
        System.out.println("A quantidade em R$ : " + reais);


        teclado.close();
        
    }
    
}
