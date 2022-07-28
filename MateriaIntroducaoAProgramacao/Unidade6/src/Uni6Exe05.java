/* Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:

Gosta de música sertaneja?
Gosta de futebol?
Gosta de seriados?
Gosta de redes sociais?
Gosta da Oktoberfest?
A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

se ambos deram a mesma resposta soma-se 3 pontos ao índice;
se um respondeu IND e o outro SIM ou NÃO soma-se 1;
se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade. Por fim, escreva a afinidade considerando os seguintes intervalos*/

import java.util.Scanner;

public class Uni6Exe05 {
    private Uni6Exe05() {
        Scanner teclado = new Scanner(System.in);
        String rapas[] = new String[5];
        String moca[] = new String[5];
        String perguntas[] = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
                "Gosta de redes sociais?", "Gosta da Oktoberfest?" };
        int calculo = 0;

        respostas(rapas, moca, teclado, perguntas);
        calcular(rapas, moca, calculo);
        imprimir(calculo);

        teclado.close();
    }

    private void respostas(String rapas[], String moca[], Scanner teclado, String perguntas[]) {
        for (int i = 0; i < moca.length; i++) {
            System.out.println("(Ela) responda as perguntas com {SIM}{NÃO} ou {IND}");
            System.out.println(perguntas[i]);
            moca[i] = teclado.next();
        }
        for (int i = 0; i < rapas.length; i++) {
            System.out.println("(Ele) responda as perguntas com {SIM}{NÃO} ou {IND}");
            System.out.println(perguntas[i]);
            rapas[i] = teclado.next();
        }
    }

    private void calcular(String rapas[], String moca[], int calculo) {
        for (int i = 0; i < moca.length; i++) {
            if (rapas[i].equals(moca[i])) {
                calculo = calculo + 3;
            } else {
                if (rapas[i].equals("IND") && (moca[i].equals("SIM") || moca[i].equals("NÃO"))) {
                    calculo = calculo + 2;
                } else {
                    if (moca[i].equals("IND") && (rapas[i].equals("SIM") || rapas[i].equals("NÃO"))) {
                        calculo = calculo + 1;
                    } else {
                        calculo = calculo - 2;
                    }
                }
            }
        }
        System.out.println("quantidade de afinidade: " + calculo);
    }

    private void imprimir(int calculo) {
        if (calculo == 15) {
            System.out.println("Casem!");
        } else {
            if (calculo <= 14 || calculo >= 10) {
                System.out.println("Vocês têm muita coisa em comum!");
            } else {
                if (calculo <= 9 || calculo >= 5) {
                    System.out.println("Vocês têm muita coisa em comum!");
                } else {
                    if (calculo <= 4 || calculo >= 0) {
                        System.out.println("Vale um encontro");
                    } else {
                        if (calculo <= -1 || calculo >= -9) {
                            System.out.println("Melhor não perder tempo");
                        } else {
                            System.out.println("Vocês se odeiam!");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }

}
