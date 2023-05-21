package exercícioL2;

/*Descrição: Algoritmo que recebe um valor e inverte as variaveis
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

//importação da class Scanner
import java.util.Scanner;

//inicialização da class principal
public class LayslaGuedes_Exercicio04L2 {
    public static void main(String[] args){
        Scanner exe4 = new Scanner(System.in);

        //criação e inicialização das variaveis
        int b, a, c;
        b = 0;
        a = 0;
        c = 0;

        //recebendo e lendo os valores
        System.out.println(" Digite dois números: ");
        b = exe4.nextInt();
        a = exe4.nextInt();

        //montando a logica e mostrando o resultado
        c = a;
        a = b;
        b = c;

        System.out.println(a + "e" + b);

        exe4.close();
    }

    
}
