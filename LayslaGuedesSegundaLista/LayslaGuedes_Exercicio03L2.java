package exercícioL2;
/*Descrição: Algoritmo que calcula a area de um triangulo e mostra o resultado
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
*/

import java.util.Scanner;

public class LayslaGuedes_Exercicio03L2 {
    public static void main(String[] args){
        Scanner exe3 = new Scanner(System.in);

        double b, a, res;
        b = 0.0;
        a = 0.0;
        res = 0.0;

        System.out.println(" Digite a base do triangulo: ");
        b = exe3.nextInt();
        System.out.println(" Digite a altura do triangulo: ");
        a = exe3.nextInt();


        res = (b * a)/2;
        System.out.println("A area é de: " + res);

        exe3.close();
    }
}
