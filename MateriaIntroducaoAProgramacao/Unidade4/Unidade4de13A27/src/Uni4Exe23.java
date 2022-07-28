import java.util.Scanner;
/*Escreva um algoritmo que leia um número inteiro positivo representando um determinado
 mês do ano e escreva o mês por extenso. Para valores maiores do que
  12 informe que o valor não é válido.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/

public class Uni4Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mesExtenso = "";

        System.out.println("informe o mês: ");
        int mes = teclado.nextInt();

        if (mes < 1 || mes> 12) {
            System.out.println("O valor não é valido");
        } else {
                switch (mes) {
                    case 1:
                        mesExtenso = "janeiro";
                        break;
                    case 2:
                        mesExtenso = "Fevereiro";
                        break;
                    case 3:
                        mesExtenso = "Março";
                        break;
                    case 4:
                        mesExtenso = "Abril";
                        break;
                    case 5:
                        mesExtenso = "Maio";
                        break;
                    case 6:
                        mesExtenso = "Junho";
                        break;
                    case 7:
                        mesExtenso = "Julho";
                        break;
                    case 8:
                        mesExtenso = "Agosto";
                        break;
                    case 9:
                        mesExtenso = "Setembro";
                        break;
                    case 10:
                        mesExtenso = "Outubro";
                        break;
                    case 11:
                        mesExtenso = "Novembro";
                        break;
                    case 12:
                        mesExtenso = "Dezembro";
                        break;
                    default:
                        break;

                }
            }
        

        switch (mes) {
            case 1:
                mesExtenso = "janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
            default:
                break;

        }

        System.out.println("Mes " + mesExtenso);

        teclado.close();
    }
}
