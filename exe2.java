/* Somar 4 números elevados ao quadrado e mostrar o resultado
 * Laysla Anizio Guedes
 * 03/05/2023
 */
import java.util.Scanner;

public class exe2 {
        public static void main (String[] args){
            Scanner ex = new Scanner(System.in);

             // Declaração e Inicialização das variaveis
    
            System.out.println("Digite um valor: ");
            int n1 = ex.nextInt();
            System.out.println("Digite um valor: ");
            int n2 = ex.nextInt();
            System.out.println("Digite um valor: ");
            int n3 = ex.nextInt(); 
            System.out.println("Digite um valor: ");
            int n4 = ex.nextInt();
    
            // Calculo com as variaveis

            int res = (n1*n1)+(n2*n2)+(n3*n3)+(n4*n4);

            // Resultado
    
            System.out.println("O resultado é: " + res);

            ex.close();
        }   
}
