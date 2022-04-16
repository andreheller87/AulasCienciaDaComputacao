import java.util.Scanner;


public class Uni3Uri1002 {
    public static void main(String[] args) {
        
                double n=3.14159;
                double raio;
                double area;
                Scanner teclado = new Scanner(System.in);
                raio = teclado.nextDouble();
                area = n*(raio*raio);
                System.out.println("A="+String.format("%.4f", area));
        teclado.close();

    }
}