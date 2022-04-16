/*leia os valores de dois pontos flutuantes de precisão dupla A e B, correspondentes
 às notas de dois alunos. Após isso, calcule a média do aluno, considerando que a
  nota A tem peso 3,5 e B tem peso 7,5. Cada nota pode ser de zero a dez, sempre 
  com um dígito após a vírgula. Não se esqueça de imprimir o final da linha após 
  o resultado, caso contrário você receberá “Erro de apresentação” . Não se esqueça 
  do espaço antes e depois do sinal de igual.

Entrada
O arquivo de entrada contém valores de 2 pontos flutuantes com um dígito após
 o ponto decimal.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme o exemplo a seguir, 
com 5 dígitos após a vírgula e com um espaço em branco antes e depois do 
sinal de igual.*/
import java.util.Scanner;



public class Uni3Uri1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A ;
        double B ;
        double  media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        

       media= ((A* 3.5 )+(B * 7.5))/11;
       System.out.println("MEDIA = "+String.format("%.5f", media));
        teclado.close();


    }

}
