package exercícioL2;

/*Descrição: Algoritmo que recebe um numero e mostra o sucessor, ele mesmo e o antecessor
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

//importação da class Scanner
 import java.util.Scanner;

//inicialização da class principal
public class LayslaGuedes_Exercicio05L2 {
    public static void main(String[] args){
        Scanner exe5 = new Scanner(System.in);

        //criação e inicialização das variavais
        int n1, ant, sus;
        n1 = 0;
        ant = 0;
        sus = 0;

        // recebendo e lendo as variaveis
        System.out.println(" Digite um número: ");
        n1 = exe5.nextInt();
     
       //calculando os valores
        ant = n1 - 1;
        sus = n1 + 1;

        // mostrando o resultado
        System.out.println("O sucessor é: " + sus);
        System.out.println("O número certo é: " + n1);
        System.out.println("O antecessor é: " + ant);

        exe5.close();
    }
    
}
