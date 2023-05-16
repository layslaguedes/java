/*Descrição: Algoritmo para calcular a média de 500 números 
 *Autor: Laysla Anizio Guedes
 *Data: 15/05/2023
 */

    // importação da class scanner
    import java.util.Scanner;

    //inicialização da class principal
        public class LayslaGuedes_Execicio03 {
    public static void main (String[] optns ){
        Scanner exe3 = new Scanner (System.in);

        // Criação das Variaveis 
        int contador;
        double soma, media;
        //Inicialização das Variaveis
        contador = 0;
        soma = media = 0.0;

        // pegando a quantidade certa de números 
        while(contador<500){
            System.out.println("Digite um número: ");

            // pegando os números inseridos pelo usuario 
            soma += exe3.nextDouble();
            contador++;
        }
        // Calcula a media
        media = soma/contador;

        System.out.println("A variavel soma vale: " + soma);
        System.out.println("A variavel contador vale: " + contador);
        // mostra a media
        System.out.println("A média é: " + media);

        exe3.close();
    }  
}
