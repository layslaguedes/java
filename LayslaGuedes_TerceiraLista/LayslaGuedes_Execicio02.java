/* Descrição: Algoritmo lê dois números inteiros e mostra os valores entre eles
 * Autor: Laysla Anizio Guedes
 * Data: 16/05/2023
 */
    // inicialização da class scanner
    import java.util.Scanner;

        //inicialização da class principal
        public class LayslaGuedes_Execicio02 {
        public static void main(String[]args){
        Scanner exe2 = new Scanner(System.in);

        //recebendo os velores das variaveis e iniciando elas
        System.out.println("Digite um número: ");
        int n1 = exe2.nextInt();
        System.out.println("Digite um número: ");
        int n2 = exe2.nextInt();

        // inicio do for
        for (int contador = n1; contador < n2; contador++){
            //imprimindo o contador dos números
            System.out.println(contador);
        }
        exe2.close();
    }
    
}
