/*Descrição: Algoritmo que gera 50 numeros inteiros e reais no aleatorio, soma ambos e mostra qual a maior soma no final
 * Autor: Laysla Anizio Guedes
 * Data: 29/05/2023
 */
    // inicialização da class Random
    import java.util.Random;

    //inicialização da class principal
    public class LayslaGuedes_Exercicio03L4 {
    public static void main(String[] args) {

        //criação e inicialização das variaveis
        int si = 0;
        double sr = 0.0;
        
        // "for" para gerar 50 numeros inteiros aleatórios e somá-los
        for (int i = 0; i < 50; i++) {
            int ni = NumeroInteiroAleatorio();
            si += ni;
        }
        
        // "for" para gerar 50 numeros reais aleatórios e somá-los
        for (int i = 0; i < 50; i++) {
            double nr = NumeroRealAleatorio();
            sr += nr;
        }
        
        // "if" e "else" para comparar as duas somas e ver qual é maior ou se são iguais
        if (si > sr) {
            System.out.println("A soma dos números inteiros é maior: " + si);
        } else if (si < sr) {
            System.out.println("A soma dos números reais é maior: " + sr);
        } else {
            System.out.println("As duas somas são iguais: " + si);
        }
    }
    
    // Gera um número inteiro aleatório entre 0 e 1000
    private static int NumeroInteiroAleatorio() {
        Random exe3 = new Random();
        return exe3.nextInt(1001);
    }
    
    // Gera um número real aleatório entre 0.0 e 1.0
    private static double NumeroRealAleatorio() {
        Random exe3 = new Random();
        return exe3.nextDouble();
    }
}

 