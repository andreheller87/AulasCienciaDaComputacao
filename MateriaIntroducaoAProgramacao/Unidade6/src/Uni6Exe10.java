import java.util.Scanner;

/*Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
“7 – Inverter valores”: desafio (ver abaixo);
“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.
Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.
Para a opção "6 - Ordenar valores" se pode usar o "método bolha" explicado neste vídeo. Existem também outros vídeos que mostram a lógica de ordenação usando o "método bolha", no caso é só procurar por "Bubble Sort". Um deles é Bubble Sort | GeeksforGeeks. Um outro um pouco mais "divertido" procura mostrar a lógica usando uma coreografia de dança: Bubble sort with Hungarian, folk dance.

Desafio: adapte o código acima para ter mais uma opção no menu para também poder inverter os elementos dentro de um vetor. Assim o último elemento passa a ser o primeiro, o penúltimo passa ser o segundo, e assim sucessivamente para todos os elementos da lista. Mas lembre, não se deve considerar o vetor inteiro, mas somente os elementos que já foram adicionados no vetor. Como base use o código descrito em vetorInverter.java.*/

public class Uni6Exe10 {
    private Uni6Exe10() {
        Scanner teclado = new Scanner(System.in);
        int vetorValores[] = new int[50];
        int valor = 0;

        menu(vetorValores, valor, teclado);
        teclado.close();
    }

    private void menu(int vetorValores[], int valor, Scanner teclado) {
        int n = 0;
        int inc = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 para adicionar um numero");
            System.out.println("2 para pesquisar um valor");
            System.out.println("3 para Alterar valor");
            System.out.println("4 Excluir um valor");
            System.out.println("5 Mostrar valores");
            System.out.println("6 Ordenar valores");
            System.out.println("7 Inverter valores");
            System.out.println("8 Sair do sistema");
            n = teclado.nextInt();
            switch (n) {
                case 1:
                    incluirValor(vetorValores, valor, teclado, inc);
                    inc++;
                    break;
                case 2:
                    pesquisarValor(vetorValores, valor, teclado);
                    break;
                case 3:
                    alterarValor(vetorValores, valor, teclado);
                    break;
                case 4:
                    excluirValor(vetorValores, valor, teclado);
                    break;
                case 5:
                    mostrarValores(vetorValores, valor);
                    break;
                case 6:
                    ordenarValores(vetorValores, valor);
                    break;
                case 7:
                    inverterValores(vetorValores, valor);
                    break;
                default:
                    System.out.println("numero invalido");
                    break;
            }
        } while (n != 8);
    }

    private void incluirValor(int vetorValores[], int valor, Scanner teclado, int inc) {
        System.out.println("Digite um numero int");
        valor = teclado.nextInt();
        for (int i = inc; i < vetorValores.length;) {
            if (vetorValores[i] == 0) {
                vetorValores[i] = valor;
                System.out.println("Numero foi Cadastrado com sucesso");
                return;
            } else {
                System.out.println("Limete atingido numero não cadastrado");
                return;
            }

        }

    }

    private void pesquisarValor(int vetorValores[], int valor, Scanner teclado) {
        System.out.println("Digite o valor a ser encontrado");
        valor = teclado.nextInt();
        for (int i = 0; i < vetorValores.length; i++) {
            if (valor == vetorValores[i]) {
                System.out.println("Numero Encontrado ind " + i);
            }
        }

    }

    private void alterarValor(int vetorValores[], int valor, Scanner teclado) {

        int valor2 = 0;
        System.out.println("Digite o valor que vc quer alterar");
        valor = teclado.nextInt();
        System.out.println("Digite o valor que vc quer colocar no lugar");
        valor2 = teclado.nextInt();

        for (int i = 0; i < vetorValores.length; i++) {
            if (valor == vetorValores[i]) {
                vetorValores[i] = valor2;
                return;
            }
        }

    }

    private void excluirValor(int vetorValores[], int valor, Scanner teclado) {

        System.out.println("Digite o valor que vc quer excluir");
        valor = teclado.nextInt();

        for (int i = 0; i < vetorValores.length; i++) {
            if (valor == vetorValores[i]) {
                vetorValores[i] = 0;
                return;
            }
        }

    }

    private void mostrarValores(int vetorValores[], int valor) {
        for (int i = 0; i < vetorValores.length; i++) {
            if (vetorValores[i] != 0) {
                System.out.print(" " + vetorValores[i] + ",");
            }
        }
        System.out.println();
    }

    private void ordenarValores(int vetorValores[], int valor) {
        int bolha = 0;
        for (int i = 0; i < vetorValores.length - 1; i++) {

            if (vetorValores[i] >= vetorValores[i + 1] && vetorValores[i] != 0) {
                bolha = vetorValores[i];
                vetorValores[i] = vetorValores[i + 1];
                vetorValores[i + 1] = bolha;
                i = -1;

            }

        }
        return;
    }

    private void inverterValores(int vetorValores[], int valor) {
        int bolha = 0;
        for (int i = 0; i < vetorValores.length - 1; i++) {
            if (vetorValores[i] <= vetorValores[i + 1] && vetorValores[i] != 0) {
                bolha = vetorValores[i];
                vetorValores[i] = vetorValores[i + 1];
                vetorValores[i + 1] = bolha;
                i = -1;

            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }

}
