import java.util.Scanner;

/*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos,
escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, 
APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma
idade e o outro diferente dos demais,
e apenas irmãos se todas as idades forem diferentes.*/

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano de nacimento do primeiro irmâo: ");
        int irmao1 =teclado.nextInt();
        System.out.print("Digite o ano de nacimento do segundo irmâo: ");
        int irmao2 =teclado.nextInt();
        System.out.print("Digite o ano de nacimento do terceiro irmâo: ");
        int irmao3 =teclado.nextInt();

        if( irmao1 == irmao2 && irmao1 == irmao3 && irmao3 == irmao2){
            System.out.println("TRIGÊMEOS");
        } else if ((irmao1 == irmao2 || irmao1 == irmao3 && irmao3 != irmao2) || (irmao2 == irmao3 || irmao2 == irmao1 && irmao1 != irmao3)|| (irmao3 == irmao1 || irmao3 == irmao2 && irmao1 != irmao2)){
            System.out.println("Gemeos");
        } else {
            System.out.println("Só irmãos.");
        }

        teclado.close();
        
    }
    
}
