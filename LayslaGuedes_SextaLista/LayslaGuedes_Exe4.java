/*
* descrição: Criação de uma classe chamada "Vovoh" que tem um método construtor
* autor: Laysla Anizio Guedes
* data: 12/06/2023
* 
*/ 

public class LayslaGuedes_Exe4 {
    public static void main(String[] args) {
        vovoh familiar = new vovoh("Antonio", "antonio@gmail.com", 78, 8);
        System.out.println("Informação do vovoh: ");
        System.out.println(familiar.nome);
        System.out.println(familiar.email);
        System.out.println(familiar.idade);
        System.out.println(familiar.senha_do_cartao);
    }
}

class vovoh{
    //Atributos
    String nome,email;
    int idade,senha_do_cartao;
    //Método Construtor
    vovoh(
        String nome_digi,
        String email_digi, 
        int idade_digi, 
        int numero_cartao_digi
    ){
        this.nome = nome_digi;
        this.email = email_digi;
        this.idade = idade_digi;
        this.senha_do_cartao = numero_cartao_digi;
    }
}
