package exercícioL2;
/*Descrição: Algoritmo recebe três números e mostrar qual é o maior deles
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
*/

// importação da class Scanner
import java.util.Scanner;

// inicialização da class principal
public class LayslaGuedes_Exercicio02L2 {
    public static void main(String[] args){
        Scanner exe2 = new Scanner(System.in);

        // criação e inicialização das variaveis
        int n1, n2, n3;
        n1 = 0;
        n2 = 0;
        n3 = 0;

        // recebendo e lendo os valores
        System.out.println(" Digite 3 números: ");
        n1= exe2.nextInt();
        n2= exe2.nextInt();
        n3= exe2.nextInt();
    
        // montando a logica e mostrando o resultado
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
