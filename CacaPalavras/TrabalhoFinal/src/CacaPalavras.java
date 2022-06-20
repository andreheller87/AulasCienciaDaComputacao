import java.util.Scanner;

public class CacaPalavras {
    private CacaPalavras() {
        Scanner teclado = new Scanner(System.in);
        String[][] palavras = new String[5][2];

        char[][] mapa = new char[10][5];
        int opcao = 0;

        palavrasEntradas(palavras);
        mapaEntrada(mapa);

        do {
            System.out.println("_____ Menu: Caça Palavras _____");
            System.out.println("1. listar palavras");
            System.out.println("2. listar mapa");
            System.out.println("3. listar respostas");
            System.out.println("4. sair");
            System.out.print("__opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    palavrasImprimir(palavras);
                    break;
                case 2:
                    mapaImprimi(mapa);
                    break;
                case 3:
                    mapaPesquisa(palavras, mapa);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção ERRADA!...");
                    break;
            }

        } while (opcao != 4);

        teclado.close();
    }

    private void palavrasEntradas(String palavras[][]) {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "LE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";

    }

    private void palavrasImprimir(String palavras[][]) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i][0]);
        }
    }

    private void mapaEntrada(char mapa[][]) {
        mapa[0][0] = 'D';
        mapa[0][1] = 'C';
        mapa[0][2] = 'Q';
        mapa[0][3] = 'W';
        mapa[0][4] = 'E';
        mapa[1][0] = 'I';
        mapa[1][1] = 'X';
        mapa[1][2] = 'F';
        mapa[1][3] = 'O';
        mapa[1][4] = 'R';
        mapa[2][0] = 'F';
        mapa[2][1] = 'F';
        mapa[2][2] = 'R';
        mapa[2][3] = 'G';
        mapa[2][4] = 'F';
        mapa[3][0] = 'E';
        mapa[3][1] = 'L';
        mapa[3][2] = 'I';
        mapa[3][3] = 'H';
        mapa[3][4] = 'W';
        mapa[4][0] = 'L';
        mapa[4][1] = 'S';
        mapa[4][2] = 'F';
        mapa[4][3] = 'O';
        mapa[4][4] = 'U';
        mapa[5][0] = 'S';
        mapa[5][1] = 'D';
        mapa[5][2] = 'G';
        mapa[5][3] = 'T';
        mapa[5][4] = 'S';
        mapa[6][0] = 'E';
        mapa[6][1] = 'J';
        mapa[6][2] = 'H';
        mapa[6][3] = 'E';
        mapa[6][4] = 'T';
        mapa[7][0] = 'I';
        mapa[7][1] = 'I';
        mapa[7][2] = 'I';
        mapa[7][3] = 'J';
        mapa[7][4] = 'M';
        mapa[8][0] = 'X';
        mapa[8][1] = 'C';
        mapa[8][2] = 'K';
        mapa[8][3] = 'B';
        mapa[8][4] = 'G';
        mapa[9][0] = 'V';
        mapa[9][1] = 'E';
        mapa[9][2] = 'T';
        mapa[9][3] = 'O';
        mapa[9][4] = 'R';
    }

    private void mapaImprimi(char mapa[][]) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 4) {
                    System.out.print("| " + mapa[i][j] + " |");

                } else {
                    System.out.print("| " + mapa[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private void mapaPesquisa(String palavras[][], char mapa[][]) {

        for (int i = 0; i < palavras.length; i++) {
            String texto = palavras[i][0];
            int textoTamanho = texto.length();
            int k = 0;

            // Esquerda para direita
            for (int l = 0; l < mapa.length; l++) {
                k = 0;
                for (int j = 0; j < 5; j++) {
                    if (mapa[l][j] == texto.charAt(k)) {
                        k++;
                        if (k == textoTamanho) {
                            palavras[i][1] = "[" + (l) + "," + (j - (k - 1)) + "]" + " - " + texto;
                            k=0;
                        }
                    }else{
                        k=0;
                    }

                }

            }
            // direita para esquerda
            for (int l = mapa.length - 1; l >= 0; l--) {
                k = 0;
                for (int j = 4; j >= 0; j--) {
                    if (mapa[l][j] == texto.charAt(k)) {
                        k++;
                        if (k == textoTamanho) {
                            palavras[i][1] = "[" + (l) + "," + (j + (k - 1)) + "]" + " - " + texto;
                            k=0;
                        }
                    }else{
                        k=0;
                    }

                }

            }
            // cima para baixo
            for (int j = 0; j < 4; j++) {
                k = 0;
                for (int l = 0; l < mapa.length; l++) {
                    if (mapa[l][j] == texto.charAt(k)) {
                        k++;
                        if (k == textoTamanho) {
                            palavras[i][1] = "[" + (l - (k - 1)) + "," + (j) + "]" + " - " + texto;
                            k=0;
                        }
                    }else{
                        k=0;
                    }
                }
            }
            // baixo para cima
            for (int j = 0; j < 5; j++) {
                k = 0;
                for (int l = 9; l >= 0; l--) {
                    if (mapa[l][j] == texto.charAt(k)) {
                        k++;
                        if (k == textoTamanho) {
                            palavras[i][1] = "[" + (l+ (k - 1)) + "," + (j) + "]" + " - " + texto;
                            k=0;
                        }
                    }else{
                        k=0;
                    }
                }
            }

        }
        for (int j2 = 0; j2 < 5; j2++) {
            if (palavras[j2][1] != null) {
                System.out.println(palavras[j2][1]);
            } else {
                System.out.println("Palavra NÃO encontrada " + palavras[j2][0]);
            }
        }
    }

    public static void main(String[] args) {
        new CacaPalavras();
    }
}