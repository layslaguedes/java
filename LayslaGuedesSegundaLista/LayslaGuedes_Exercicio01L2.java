package exercícioL2;

/*Descrição: Algoritmo que recebe um valor e desconta 15% dele
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class LayslaGuedes_Exercicio01L2 {
    public static void main(String[]args){
        Scanner exe1 = new Scanner(System.in);

        double num, resul, resul2;
        num = 0.0;
        resul = 0.0;
        resul2 = 0.0;

        System.out.println(" Digite um valor: ");
        num= exe1.nextInt();

        resul = (num/100)*15;
        resul2 = num - resul;

        System.out.println("O valor original: " + num);
        System.out.println("O valor com desconto: " + resul2);

        exe1.close();

    }

    
}