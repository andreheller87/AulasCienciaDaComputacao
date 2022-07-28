/*Leia os quatro valores correspondentes aos eixos x e y de dois
 pontos do plano, p1 (x1, y1) e p2 (x2, y2) e calcule a distância 
 entre eles, mostrando quatro casas decimais após a vírgula, conforme a fórmula :

Distância =

Entrada
O arquivo de entrada contém duas linhas de dados. O primeiro contém dois
 valores duplos:  x1 y1 e o segundo também contém dois valores duplos com 
 um dígito após o ponto decimal: x2 y2 .

Saída
Calcule e imprima o valor da distância usando a fórmula fornecida, com 4
 dígitos após o ponto decimal.

*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pontoX1 = teclado.nextDouble();
        double pontoY1 = teclado.nextDouble();
        double pontoX2 = teclado.nextDouble();
        double pontoY2 = teclado.nextDouble();
        double pontoDistancia;
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        pontoDistancia = Math.sqrt((pontoX2 - pontoX1)*(pontoX2 - pontoX1)+ (pontoY2 - pontoY1)*(pontoY2 - pontoY1));

        System.out.println( df_4.format(pontoDistancia));
        //System.out.println(String.format("%.4f", pontoDistancia));
        
        teclado.close();

    }
}