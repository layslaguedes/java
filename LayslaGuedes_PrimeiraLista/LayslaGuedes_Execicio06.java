/* Descrição: Calculo do perimetro do círculo, com o valor do raio
 * Autor: Laysla Anizio Guedes
 * Data: 05/05/2023
 */

import java.util.Scanner;

public class LayslaGuedes_Execicio06{
    public static void main (String[] args){
        Scanner ex = new Scanner(System.in);

         // Declaração e Inicialização das variaveis

        System.out.println("Digite o valor do raio do círculo: ");
        Double R = ex.nextDouble(); 
        
         // Calculo com as variaveis

        Double P = 2*3.14*R;

        // Resultado

        System.out.println("O resultado é: " + P);

        ex.close();
    }   
 } 
