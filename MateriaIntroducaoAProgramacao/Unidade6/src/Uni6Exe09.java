import java.util.Scanner;

/*Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.
Baseado nisto faça um programa que informe:
qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício*/

public class Uni6Exe09 {
    private Uni6Exe09() {
        Scanner teclado = new Scanner(System.in);

        int pesquisaSexo[] = new int[30];
        int pesquisaNota[] = new int[30];
        int pesquisaIdade[] = new int[30];

        pesquisaInforme(pesquisaSexo, pesquisaNota, pesquisaIdade, teclado);
        imprimirPesquisa(pesquisaSexo, pesquisaNota, pesquisaIdade);
        int media = mediaNotaCinema(pesquisaNota);
        mediaDosHomen(pesquisaSexo, pesquisaNota);
        notaMulherMaisNova(pesquisaSexo, pesquisaNota, pesquisaIdade);
        qtdMulherMaiorQue50(pesquisaSexo, pesquisaNota, pesquisaIdade, media);

        teclado.close();

    }

    private void pesquisaInforme(int pesquisaSexo[], int pesquisaNota[], int pesquisaIdade[], Scanner teclado) {
        for (int i = 0; i < pesquisaSexo.length; i++) {
            System.out.print("o sexo (1=feminino 2=masculino): ");
            pesquisaSexo[i] = teclado.nextInt();
            System.out.print("nota para o cinema (zero até dez, valor inteiro): ");
            pesquisaNota[i] = teclado.nextInt();
            System.out.print("Idade: ");
            pesquisaIdade[i] = teclado.nextInt();

        }
    }

    private void imprimirPesquisa(int pesquisaSexo[], int pesquisaNota[], int pesquisaIdade[]) {
        for (int i = 0; i < pesquisaIdade.length; i++) {
            System.out.println("Sexo: " + pesquisaSexo[i] + " Nota: " + pesquisaNota[i] +
                    " Idade: " + pesquisaIdade[i]);
        }

    }

    private int mediaNotaCinema(int pesquisaNota[]) {
        int soma = 0;
        System.out.println("______________________");
        System.out.println("Media Nota do cinema: ");

        for (int i = 0; i < pesquisaNota.length; i++) {
            soma = soma + pesquisaNota[i];
        }
        soma = soma / 30;
        System.out.println("Media: " + soma);
        return soma;
    }

    private void mediaDosHomen(int pesquisaSexo[], int pesquisaNota[]) {
        System.out.println("______________________");
        System.out.println("Media dos homens: ");

        int soma = 0;
        int media = 0;
        int qtdH = 0;
        for (int i = 0; i < pesquisaNota.length; i++) {
            if (pesquisaSexo[i] == 2) {
                soma = soma + pesquisaNota[i];
                qtdH++;

            }
        }
        if (qtdH != 0) {
            media = soma / qtdH;
            System.out.println("Media das notas dos Homen: " + media);
        }

    }

    private void notaMulherMaisNova(int pesquisaSexo[], int pesquisaNota[], int pesquisaIdade[]) {
        System.out.println("______________________");
        System.out.println("Nota Mulhere Mais Nova : ");

        int bolha = 100;
        int ind = 0;

        for (int i = 0; i < pesquisaIdade.length - 1; i++) {

            if (pesquisaIdade[i] < pesquisaIdade[i + 1] && bolha > pesquisaIdade[i + 1] && pesquisaSexo[i] == 1) {

                bolha = pesquisaIdade[i];

                ind = i;
            }
        }
        if (bolha < pesquisaIdade[29]) {
            System.out.println("Idade:" + bolha + " nota: " + pesquisaNota[ind]);
        } else {
            System.out.println("Idade:" + pesquisaIdade[29] + " nota: " + pesquisaNota[29]);
        }

    }

    private void qtdMulherMaiorQue50(int pesquisaSexo[], int pesquisaNota[], int pesquisaIdade[], int media) {
        System.out.println("______________________");
        System.out.println("Mulheres maiores que 50 anos ");
        System.out.println("com nota maior que a media: ");

        int ind = 0;
        for (int i = 0; i < pesquisaIdade.length; i++) {

            if (pesquisaIdade[i] > 50 && pesquisaSexo[i] == 1 && media < pesquisaNota[i]) {
                ind++;
                System.out.println("Idade:" + pesquisaIdade[i] + " nota: " + pesquisaNota[i]);
            }

        }

        System.out.println("qtd:" + ind);

    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
