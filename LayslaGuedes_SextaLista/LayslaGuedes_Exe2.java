/*
 * descrição: Criação de uma Classe chamada "Cinto"
 * autor: Laysla Anizio Guedes
 * data: 12/06/2023
*/

public class LayslaGuedes_Exe2 {

    public static void main(String[] args) {
        
        cinto haha = new cinto("nome");
        haha.abrir();
        haha.solta();
        haha.subir();
        haha.apertar();
        System.out.println(haha.nome_marca());
    
    }
}

class cinto{
    //atributos
    String nome;

    //metodo construtor
    cinto(String nome_digi){
        nome = nome_digi;
    }

    //metodo
    void abrir(){
        System.out.println("abriu");
    }

    void solta(){
        System.out.println("soltou");
    }

    void subir(){
        System.out.println("Subindo");
    }

    void apertar(){
        System.out.println("Apertou");
    }

    String nome_marca(){
        return "Gucci";
    }
}