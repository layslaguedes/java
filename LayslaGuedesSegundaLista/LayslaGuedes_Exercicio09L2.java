package exercícioL2;

/*Descrição: Algoritmo que recebe dois valores e compara eles, exibindo qual é o maior ou se são iguais
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

 //importação da class Scanner
 import java.util.Scanner;

//inicialização da class principal
public class LayslaGuedes_Exercicio09L2 {
    public static void main(String[] args){
        Scanner exe9 = new Scanner(System.in);

        //criação e inicialização das variavais
        double n1, n2;
        n1 = 0.0;
        n2 = 0.0;
    
        // recebendo e lendo as variaveis
        System.out.println(" Digite dois valores: ");
        n1 = exe9.nextInt();
        n2 = exe9.nextInt();
        
        //montando a logica e dando o resultado
        if(n1 == n2){
            System.out.println(" Os números são iguais: ");

        } else if(n1 > n2){
            System.out.println(" O primeiro número é maior: ");
        } else {
            System.out.println(" O segundo número é maior: ");
        }

        exe9.close();
    }
    
    
}
