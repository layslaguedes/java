package exercícioL2;

/*Descrição: Algoritmo que recebe um valor e mostra se ele é ímpar ou par
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class LayslaGuedes_Exercicio10L2 {
     public static void main(String[] args){
         Scanner exe10 = new Scanner(System.in);
 
         int n1;
         n1 = 0;
     
         System.out.println(" Digite um valor: ");
         n1 = exe10.nextInt();
         
         if((n1%2)==0){
             System.out.println("número par");
         } else {
             System.out.println("número ímpar ");
         }
 
         exe10.close();
     }
     
    
}
