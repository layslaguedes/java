/*Descrição: Algoritmo que conta de 10 a 0 e mostra fim ao final 
 * Autor: Laysla Anizio Guedes
 * Data: 28/05/2023
 */

//inicialização da class princinpal
public class LayslaGuedes_Exercicio05L4 {
    public static void main(String[] args) {

        //inicialização do for com a criação da variavel "a"
        for (int a = 10; a >= 0; a--) { // "--" para programar para menos que 10
            System.out.println(a);
        }
        
        // exibe a palavra "fim" ao chegar ao 0
        System.out.println("FIM");
    }
}

