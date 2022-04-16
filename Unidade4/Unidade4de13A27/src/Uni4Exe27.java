import java.util.Scanner;

/*As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para 
baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se para
 baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar 
 durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35
minutos pagará por duas horas. Entretanto, se a pessoa permaneceu menos de 30
minutos, também pagará por uma hora. Os horários de chegada e partida são 
apresentados na forma de pares de inteiros, representando horas e minutos. 
 Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um
algoritmo que leia os horários de chegada e de partida e escreva na tela o
 preço a ser cobrado. Deverá haver validação de dados. Admite-se que a chegada
 e a partida se dão com intervalo não superior a 24 horas. Entretanto, 
 se uma dada hora de chegada for superior à da partida, isso não é uma situação
 de erro, significará que a partida ocorreu no dia seguinte ao da chegada.




*/
public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a hora : ");
        int horaEntrada = teclado.nextInt();
        System.out.println("Informe os minutos: ");
        int minutosDaEntrada = teclado.nextInt();
        System.out.println("Informe a hora de saida: ");
        int horaSaida = teclado.nextInt();
        System.out.println("Informe os minutos da saisda: ");
        int minutosDaSaida = teclado.nextInt();
        int qtdMinutosParaHoras = 0;
        int qtdMitutosPermanecido = minutosDaSaida - minutosDaEntrada;
        int qtdHorasPermanecido = 0;

        if (horaSaida < horaEntrada) {
            qtdHorasPermanecido = 24 - (horaEntrada - horaSaida);
        } else {
            qtdHorasPermanecido = qtdHorasPermanecido + (horaSaida - horaEntrada);
        }

        if (qtdMitutosPermanecido <= 29 && (horaSaida - horaEntrada) == 0) {
            qtdMinutosParaHoras = 1;
        } else {
            if (qtdMitutosPermanecido <= 29) {
                qtdMinutosParaHoras = 0;
            } else {
                if (qtdMitutosPermanecido > 29) {
                    qtdMinutosParaHoras = 1;
                }
            }
        }
        qtdHorasPermanecido = qtdHorasPermanecido + qtdMinutosParaHoras;

        double precoCobrado = 0;

        switch (qtdHorasPermanecido) {
            case 0:
                ;
            case 1:
                precoCobrado = 5.00;
                break;

            case 2:
                precoCobrado = 10.00;
                break;

            case 3:
                precoCobrado = 17.5;
                break;

            case 4:
                precoCobrado = 25;
                break;

            default:

                precoCobrado = 25 + (10 * (qtdHorasPermanecido - 4));
                break;
        }

        System.out.println("Preço cobrado = " + precoCobrado);

        teclado.close();
    }
}
