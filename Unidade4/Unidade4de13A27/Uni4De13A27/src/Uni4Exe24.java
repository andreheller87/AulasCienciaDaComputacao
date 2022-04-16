import java.util.Scanner;

/*Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a
 partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio


*/


public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Digite um numero:");
        double valor1 =teclado.nextDouble();
        System.out.println("Digite mais um numero:");
        double valor2 =teclado.nextDouble();
        System.out.println("Digite mais um numero:");
        double valor3 =teclado.nextDouble();
        double valorMenor = 0;
        double valorMedio = 0;
        double valorMaior = 0;

		if ((valor1 <= valor2) && (valor1 <= valor3)) {
			valorMenor = valor1;
			if (valor2 <= valor3) {
				valorMedio = valor2;
				valorMaior = valor3;
			} else {
				valorMedio = valor3;
				valorMaior = valor2;
			}
		} else {
			if ((valor2 <= valor1) && (valor2 <= valor3)) {
				valorMenor = valor2;
				if (valor1 <= valor3) {
					valorMedio = valor1;
					valorMaior = valor3;
				} else {
					valorMedio = valor3;
					valorMaior = valor1;
				}
			} else {
				valorMenor = valor3;
				if (valor1 <= valor2) {
					valorMedio = valor1;
					valorMaior = valor2;
				} else {
					valorMedio = valor2;
					valorMaior = valor1;
				}
			}
		}
        System.out.println("Digite a opção:");
        System.out.println("1 = ordem crescente ");
        System.out.println("2 = ordem decrescente");
        System.out.println("3 = o maior valor fique no meio");
        
        int opcao =teclado.nextInt();




        switch(opcao){
            case 1:
            System.out.println("Ordem crescente: " + valorMenor + " - " + valorMedio + " - " + valorMaior);
            break;
            case 2 :
            System.out.println("ordem decrescente: "+ valorMaior + " - " + valorMedio + " - " + valorMenor);
            break;
            case 3: 
            System.out.println("o maior valor fique no meio: "+ valorMenor + " - " + valorMaior + " - " + valorMedio);
            break;
            default:
            System.out.println("Opção invalida");
            break;
        } 

        teclado.close();
    }
}
