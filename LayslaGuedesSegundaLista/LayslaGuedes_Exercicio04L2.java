package exercícioL2;

/*Descrição: Algoritmo que recebe um valor e inverte as variaveis
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

import java.util.Scanner;

public class LayslaGuedes_Exercicio04L2 {
    public static void main(String[] args){
        Scanner exe4 = new Scanner(System.in);

        int b, a, c;
        b = 0;
        a = 0;
        c = 0;

        System.out.println(" Digite dois números: ");
        b = exe4.nextInt();
        a = exe4.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println(a + "e" + b);

        exe4.close();
    }

    
}
