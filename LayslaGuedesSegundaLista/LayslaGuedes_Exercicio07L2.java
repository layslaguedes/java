package exercícioL2;

/*Descrição: Algoritmo que recebe um valor e mostra se acertou
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class LayslaGuedes_Exercicio07L2 {
    public static void main(String[] args){
        Scanner exe7 = new Scanner(System.in);

        int n1;
        n1 = 0;
    
        System.out.println(" Digite um valor: ");
        n1 = exe7.nextInt();
        
        if(n1>94 && n1 <456){
            System.out.println(" Você acertou: ");

        } else{
            System.out.println(" Você errou!: ");
        }

        exe7.close();
    }
    
}
