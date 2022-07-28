/*Construa um programa para ler um número inteiro 
(assuma até 3 dígitos) e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s) */

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int centena;
        int dezenas;
        int unidade;

        System.out.print("Entre com o valor: ");
        int valor = teclado.nextInt();

        centena = valor / 100;
        // dezenas = (valor % 100) /10;

        int menosCentena = centena * 100;

        dezenas = (valor - menosCentena) / 10;
        int menosDezena = dezenas * 10;

        unidade = (valor - menosCentena - menosDezena);

        System.out.println(centena + " centenas  " + dezenas + "  dezenas  " + unidade + " unidade ");

        teclado.close();
    }

}