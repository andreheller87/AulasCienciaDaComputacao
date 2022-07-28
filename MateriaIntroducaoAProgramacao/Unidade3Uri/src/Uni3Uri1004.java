
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri1004{
 
    public static void main(String[] args)  {
 Scanner teclado = new Scanner(System.in);
 int valor1;
 int valor2;
 int PROD;
 
 valor1 =teclado.nextInt();
 valor2=teclado.nextInt();
 
 PROD = valor1 * valor2;
 
 System.out.println("PROD = " + PROD);
 teclado.close();
    }
 
}