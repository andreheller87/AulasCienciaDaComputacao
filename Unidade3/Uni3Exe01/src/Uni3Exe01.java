import java.util.Scanner;

/*  Enunciados Uma imobiliária vende apenas terrenos retangulares.
 Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.

     -Analize
     ok

     -gordura

    // -entradas
    //ler largura
    // ler comprimento
    
    //-processos
     

    // saida-
    // area do terreno
    //largura * comprimento
    */ 
  public class Uni3Exe01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double largura;
        double comprimento;
// -entradas
System.out.print("Entre com a largura: ");
largura = teclado.nextDouble();
System.out.print("Entre com a Comprimento: ");
comprimento = teclado.nextDouble();
    
//-processos
     double area =largura*comprimento;


// saida- area do terreno

    System.out.println("A área do terreno é :" + area);
       
     teclado.close();
    }
}
