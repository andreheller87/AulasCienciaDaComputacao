import java.util.Scanner;

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas
:minutos:segundos.
*/ 

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o tempo de duração: ");
        int tempoDuracao = teclado.nextInt();
        int horas = tempoDuracao / 120;
        int minutos = (tempoDuracao%120)/60;
        int segundos = ((tempoDuracao%120)%60)/1;

        System.out.println("Tempo:  " +horas + ":"+minutos+":" +segundos);
        
       
        teclado.close();
    }
    
}
