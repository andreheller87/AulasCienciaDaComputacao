import java.util.Scanner;

/*Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
 escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. 
 Se for informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva
  “Entrada Incorreta”. Atenção: antes de testar a letra,
 converta-a para maiúscula.*/

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o sexo: ` M ou F ` ");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if(letra == 'M'){
            System.out.println("Masculino");
        } else if( letra == 'F'){
            System.out.println("Feminino");
        } else if (letra == 'I'){
            System.out.println("Não Informado");
         } else {
            System.out.println("Entrada Incorreta");
        }



        teclado.close();
        
    }
}
