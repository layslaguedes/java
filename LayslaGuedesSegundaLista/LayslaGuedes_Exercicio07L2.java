package exercícioL2;

/*Descrição: Algoritmo que recebe um valor e mostra se acertou
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */

//importação da class Scanner
 import java.util.Scanner;

//inicialização da class principal
public class LayslaGuedes_Exercicio07L2 {
    public static void main(String[] args){
        Scanner exe7 = new Scanner(System.in);

        //criação e inicialização das variaveis
        int n1;
        n1 = 0;
    
        //recebendo e lendo os valores
        System.out.println(" Digite um valor: ");
        n1 = exe7.nextInt();
        
        //montando a logica e mostrando o resultado
        if(n1>94 && n1 <456){
            System.out.println(" Você acertou: ");

        } else{
            System.out.println(" Você errou!: ");
        }

        exe7.close();
    }
    
}
