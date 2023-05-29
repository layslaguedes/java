/*Descrição: Algoritmo que soma todos os numeros que o quadrado é divisivel por 4 
 * Autor: Laysla Anizio Guedes
 * Data: 29/05/2023
 */

    // inicialização da class principal
     public class LayslaGuedes_Exercicio01L4 {
    public static void main(String[] args) {

        //criação e inicialização das variaveis
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //numeros para ver se é divisivel por 4
        int soma = 0;
        
        //inicialização do "for" e do "if" para a soma dos numeros
        for (int numero : n) {
            int quadrado = numero * numero;
        
            if (quadrado % 4 == 0) {
                soma += numero;
            }
        }
        //para mostrar pro usuario a soma final
        System.out.println("A soma dos números no quadrado que é divisível por 4 é: " + soma);
    }
}