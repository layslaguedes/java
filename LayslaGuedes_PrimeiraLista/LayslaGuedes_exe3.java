/* Descrição: Tranformar reais em dólar
 * Autor: Laysla Anizio Guedes
 * Data: 05/05/2023
 */
import java.util.Scanner;

public class exe3 {
        public static void main (String[] args){
            Scanner ex = new Scanner(System.in);

             // Declaração e Inicialização das variaveis
    
            System.out.println("Digite um valor: ");
            Double n1 = ex.nextDouble();
            System.out.println("Digite o valor do dólar atual: ");
            Double vd = ex.nextDouble();

             // Calculo com as variaveis
    
            Double res = n1/vd;

            // Resultado
    
            System.out.println("O valor é: " + res);

            ex.close();
        }   
}