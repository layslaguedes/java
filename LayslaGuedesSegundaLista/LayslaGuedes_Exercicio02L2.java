package exercícioL2;
/*Descrição: Algoritmo recebe três números e mostrar qual é o maior deles
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
*/


import java.util.Scanner;

public class LayslaGuedes_Exercicio02L2 {
    public static void main(String[] args){
        Scanner exe2 = new Scanner(System.in);

        int n1, n2, n3;
        n1 = 0;
        n2 = 0;
        n3 = 0;

        System.out.println(" Digite 3 números: ");
        n1= exe2.nextInt();
        n2= exe2.nextInt();
        n3= exe2.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " é o maior número ");
        } else if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " é o maior número ");
        } else {
            System.out.println(n3 + " é o maior número ");
        }
        exe2.close();

    }
}
