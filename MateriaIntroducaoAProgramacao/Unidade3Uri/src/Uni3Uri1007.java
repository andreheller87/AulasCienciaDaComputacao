import java.util.Scanner;

public class Uni3Uri1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      int A;
      int B;
      int C;
      int D;
      int diferenca;

      A = teclado.nextInt();
      B= teclado.nextInt();
      C = teclado.nextInt();
      D = teclado.nextInt();

      diferenca = (A * B - C * D);

      
      
      
      
        System.out.println("DIFERENCA = "+ diferenca);
        
        teclado.close();
        
    }
}
