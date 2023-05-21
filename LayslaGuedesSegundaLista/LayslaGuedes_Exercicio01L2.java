package exercícioL2;

/*Descrição: Algoritmo que recebe um valor e desconta 15% dele
 * Autor: Laysla Anizio Guedes
 * Data: 17/05/2023
 */
  // importação da class Scanner
 import java.util.Scanner;

 // inicialização da class principal
public class LayslaGuedes_Exercicio01L2 {
    public static void main(String[]args){
        Scanner exe1 = new Scanner(System.in);
     
         // criação e inicialização das variáveis
        double num, resul, resul2;
        num = 0.0;
        resul = 0.0;
        resul2 = 0.0;
        
         // recebendo e lendo os valores
        System.out.println(" Digite um valor: ");
        num= exe1.nextInt();
      
        // calculando o valor
        resul = (num/100)*15;
        resul2 = num - resul;

         // mostrando o resultado
        System.out.println("O valor original: " + num);
        System.out.println("O valor com desconto: " + resul2);

        exe1.close();

    }

    
}
