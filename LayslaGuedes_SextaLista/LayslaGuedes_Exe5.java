/*
* descrição: Criação de uma classe "qualquer" que tem 11 métodos, com método construtor e possui 10 atributos.
* Autor: Laysla Anizio Guedes
* data: 12/06/2023
* 
*/ 

public class LayslaGuedes_Exe5 {
    public static void main(String[] args) {
        dados criacao = new dados("Laysla", "Ypes", "Estudante", "Dancar", "Guedes", 29867533, 000000000, 93456020, 17, 70);

        System.out.println("Objeto: ");
        System.out.println(criacao.nome);
        System.out.println(criacao.sobrenome);
        System.out.println(criacao.idade);
        System.out.println(criacao.cpf);
        System.out.println(criacao.rg);
        System.out.println(criacao.hoob);
        System.out.println(criacao.bairro);
        System.out.println(criacao.numero_telefone);
        System.out.println(criacao.ocupacao);
        System.out.println(criacao.peso);
       


        System.out.println("Métodos: ");
        criacao.andar();
        criacao.dormir();
        criacao.assistir();
        criacao.chorar();
        criacao.sentindo();
        criacao.falar();
        criacao.pensar();
        criacao.piscar();
        criacao.respirar();
        criacao.segurar();
    }
}

class dados{
    //atributos
    String nome,
    bairro,
    ocupacao,
    hoob,
    sobrenome;
    int rg,
    cpf,
    numero_telefone,
    idade,
    peso;
    //Método Construtor
    dados(
        String nome_digitado,
        String bairro_digitado,
        String ocupacao_digitado,
        String hoob_digitado,
        String sobrenome_digitado,
        int rg_digitado,
        int cpf_digitado,
        int numero_telefone_digitado,
        int idade_digitado,
        int peso_digitado
    ){
        this.nome = nome_digitado;
        this.bairro = bairro_digitado;
        this.ocupacao = ocupacao_digitado;
        this.hoob = hoob_digitado;
        this.sobrenome = sobrenome_digitado;
        this.rg = rg_digitado;
        this.cpf = cpf_digitado;
        this.numero_telefone = numero_telefone_digitado;
        this.idade = idade_digitado;
        this.peso = peso_digitado;
    }
    //Métodos
    void andar(){
        System.out.println("Sempre andando");
    }

    void respirar(){
        System.out.println("Sempre respirando");
    }

    void pensar(){
        System.out.println("Sempre pensando");
    }

    void piscar(){
        System.out.println("Sempre piscando");
    }

    void falar(){
        System.out.println("Quase sempre falando");
    }

    void dormir(){
        System.out.println("Sempre dormindo");
    }

    void assistir(){
        System.out.println("Sempre assistindo");
    }

    void segurar(){
        System.out.println("Sempre segurando");
    }

    void chorar(){
        System.out.println("quase sempre chorando");
    } 
 
    void sentindo(){
        System.out.println("Quase sempre sentindo");
    }
}
