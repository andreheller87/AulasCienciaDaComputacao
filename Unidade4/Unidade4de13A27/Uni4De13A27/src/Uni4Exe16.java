import java.util.Scanner;

/*Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres
 (considere que a idade entre homens e mulheres sempre serão diferentes). 
 Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
 e o produto das idades do homem mais novo com a mulher mais velha.*/
public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade do primeiro Homem");
        int homem1 = teclado.nextInt();
        System.out.println("Digite a idade do segundo Homem");
        int homem2 = teclado.nextInt();
        System.out.println("Digite a idade da primeira Mulher");
        int mulher1 = teclado.nextInt();
        System.out.println("Digite a idade da segunda Mulher");
        int mulher2 = teclado.nextInt();
        int homenMaior = 0;
        int homemMenor = 0;
        int mulherMenor = 0;
        int mulherMaior = 0;
        int soma = 0;
        int multip = 0;

        if (homem1 > homem2 && !(homem2 > homem1)) {
            homenMaior = homem1;
        } else {
            homenMaior = homem2;
        }
        if (homem1 < homem2 && !(homem2 < homem1)) {
            homemMenor = homem1;
        } else {
            homemMenor = homem2;
        }

        if (mulher1 > mulher2 && !(mulher2 > mulher1)) {
            mulherMaior = mulher1;
        } else {
            mulherMaior = mulher2;
        }
        if (mulher1 < mulher2 && !(mulher2 < mulher1)) {
            mulherMenor = mulher1;
        } else {
            mulherMenor = mulher2;
        }
        soma = homenMaior + mulherMenor;
        multip = homemMenor * mulherMaior;

        System.out.println("A Soma entre a idade do homem mais velho e mulher mais jovem é: " + soma);

        System.out.println("A multiplicação da idade do homem mais novo com a da mulher mais velha é: " + multip);

        teclado.close();

    }
}
