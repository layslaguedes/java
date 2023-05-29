/*Descrição: Algoritmo que recebe texto com quantidade mínima de 10 caracteres 
 * Autor: Laysla Anizio Guedes
 * Data: 28/05/2023
 */

 // inicialização da class Scanner
import java.util.Scanner;

//inicialização da class princinpal
public class LayslaGuedes_Exercicio04L4 {
    public static void main(String[] args) {
        Scanner exe4 = new Scanner(System.in);
        
        //inicializando e criando as variaveis
        System.out.print("Digite um texto: ");
        String texto = exe4.nextLine(); //nextLine() é utilizado para ler uma linha de texto digitada pelo usuário e armazená-la na variável texto
        
        //inicio do "se" e do "senao" e mostrando o resultado
        if (texto.length() > 10) { //length() utilizada para verificar o tamanho do texto
            System.out.println("Você digitou um palavrão!");
        } else {
            System.out.println("Você digitou uma palavrinha.");
        }

        exe4.close();
    }
}
