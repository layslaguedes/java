/*Descrição: Algoritmo que recebe tres números e enquanto a soma for diferente de 48 ou 71, continue recebendo os velores
 * Autor: Laysla Anizio Guedes
 * Data: 29/05/2023
 */

 // inicialização da class Scanner
import java.util.Scanner;

//inicialização da class princinpal
public class LayslaGuedes_Exercicio02L4 {
    public static void main(String[] args) {
        Scanner ex2 = new Scanner(System.in);
        
        //inicialização do "while" e das variaveis
        while (true) {
            System.out.println("Digite três números: ");
            int n1 = ex2.nextInt();
            int n2 = ex2.nextInt();
            int n3 = ex2.nextInt();
            
            //calcular os tres numeros
            int soma = n1 + n2 + n3;
            
            //inicialização do "se" para a mostra do 48 e do 71
            if (soma == 48 || soma == 71) {
                System.out.println("Soma igual a 48 ou 71. Saída do programa.");
            }
            ex2.close(); 
        }
    }
}
