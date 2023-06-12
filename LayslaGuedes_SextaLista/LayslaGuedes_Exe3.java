/*
* descrição: Criação de uma classe chamada "Casa" que tem 10 atributos e 5 Métodos
* autor: Laysla Anizio Guedes 
* data: 12/06/2023
*/ 

public class LayslaGuedes_Exe3 {
    public static void main(String[] args) {
        casa nova = new casa("Amarelo", "Tijolo", "Rua das palmeiras", "Ypes", "Maringá", "Classe Alta", "exagerada", "Claudio", 90, "356887548");
        System.out.println("Objeto");
        System.out.println(nova.cor);
        System.out.println(nova.material);
        System.out.println(nova.localidade);
        System.out.println(nova.bairro);
        System.out.println(nova.cidade);
        System.out.println(nova.Classe_social);
        System.out.println(nova.CEP);
        System.out.println(nova.origem);
        System.out.println(nova.Residente);
        System.out.println(nova.numero);

        System.out.println("Métodos");

        nova.abrir_garagem();
        nova.abrir_janela();
        nova.abrir_porta();
        nova.quantidade_pessoa();
        System.out.println(nova.numero_de_pessoas_novamente());
    }
}

class casa{
    //Atributos
    String cor,
    material,
    localidade,
    bairro,
    cidade,
    Classe_social,
    origem,
    Residente,
    CEP;
    int numero;
    //Método construtor
    casa(
        String cor_digi,
        String material_digi,
        String localidade_digi,
        String bairro_digi,
        String cidade_digi,
        String classesocial_digi,
        String origem_digi,
        String residente_digi,
        int numero_digi,
        String cep_digi
    ){
        cor = cor_digi;
        material = material_digi;
        localidade = localidade_digi;
        bairro = bairro_digi;
        cidade = cidade_digi;
        Classe_social = classesocial_digi;
        origem = origem_digi;
        Residente = residente_digi;
        numero = numero_digi;
        CEP = cep_digi;
    }
    //Métodos
    void abrir_porta(){
        System.out.println("Abrindo a porta");
    }

    void abrir_janela(){
        System.out.println("Abrindo a Janela");
    }

    void abrir_garagem(){
        System.out.println("abrindo a garagem");
    }

    void quantidade_pessoa(){
        System.out.println("Existe 3 pessoas no local");
    }

    int numero_de_pessoas_novamente(){
        return 3;
    }
}