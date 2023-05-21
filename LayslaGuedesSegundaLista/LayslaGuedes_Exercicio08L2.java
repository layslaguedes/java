package exercícioL2;

/*Descrição: Algoritmo que analisa informaçôes de uma pessoa para assistir um filme
 * Autor: Laysla Anizio Guedes
 * Data: 18/05/2023
 */

//importação da class Scanner
import java.util.Scanner;

//inicialização da class principal
public class LayslaGuedes_Exercicio09L2 {
    public static void main(String[] args){
        Scanner exe8 = new Scanner(System.in);

        //criação e inicialização das variavais
        double valor;
        int classe;
        String filme;
        char conf;

        valor = 0.0;
        classe = 0;
        filme = " SUPER MARIO";
        conf = ' ';  
       
        //recebendo e lendo as variaveis
        System.out.println(" Filme em cartaz: " + filme);
        System.out.println(" CineLay!");
        System.out.println(" valor do ingresso: R$ 12,00");
        System.out.println(" Filme em cartaz: " + filme);
        System.out.println("Digite sua idade");
        classe= exe8.nextInt();
        System.out.println("Digite o valor do ingresso: ");
        valor = exe8.nextInt();
        
        //montando a logica e dando o resultado
        if(classe>=18 && valor<=20.0){
            System.out.println(" Tudo ok!");
        } else{
            System.out.println(" Digite tudo novamente!");
        } 

        exe8.close();
    }
    
    
}
