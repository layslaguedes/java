/* Descrição: Ler a idade e mostrar a feixa etária
 * Autor: Laysla Anizio Guedes
 * Data: 05/05/2023
 */

import java.util.Scanner;

public class LayslaGuedes_Execicio05{
    public static void main (String[] args){
        Scanner ex = new Scanner(System.in);

            // Declaração e Inicialização das variaveis

            System.out.println("Digite sua idade: ");
            int idade = ex.nextInt();

            // Mostra qual a feixa etaria da pessoa

            if (idade>=0 && idade<=12){
                System.out.println("Faixa Etária: Criança");
            } else if (idade>12 && idade<19){
                System.out.println("Faixa Etária: Adolescente");
            }else if (idade>=19 && idade<65){
                System.out.println("Faixa Etária: Adulto");
            } else{
                System.out.println("Faixa Etária: Idosa");
            }
            ex.close();

    }   
 } 
