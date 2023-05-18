package exercícioL2;

/*Descrição: Algoritmo que recebe a quantidade e calcula o valor total da compra e mostra o resultado
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class LayslaGuedes_Exercicio06L2 {
    public static void main(String[] args){
        Scanner exe5 = new Scanner(System.in);

        int k, l, r;
        double res;

        k = 0;
        l = 0;
        r = 0;
        res = 0.0;

        System.out.println(" Digite a quantidade de picoles de kiwi: ");
        k = exe5.nextInt();
        System.out.println(" Digite a quantidade de picoles de laranja: ");
        l = exe5.nextInt();
        System.out.println(" Digite a quantidade de picoles de romã: ");
        r = exe5.nextInt();

        res = (k * 3.30)+(l * 2.39) + (r * 7.99);
        System.out.println("O valor total é: " + res);

        exe5.close();
    }
    
}
