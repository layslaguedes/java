/*
* descrição: Criação de uma Classe "Alimento" com 10 atributos
* Autor: Laysla Anizio Guedes
* data: 12/06/2023
*/ 

public class LayslaGuedes_Exe1 {
    public static void main(String[] args) {
        alimento criacao_alimento = new alimento("Gelados", "sorvete", "Doce", "choco", "normal", 01, 30, 30,90, 100);
        System.out.println(" Informação Sobre o Alimento: ");

        System.out.println(criacao_alimento.Grupo_alimentar);
        System.out.println(criacao_alimento.aroma);
        System.out.println(criacao_alimento.data_compra);
        System.out.println(criacao_alimento.data_venda);
        System.out.println(criacao_alimento.nome);
        System.out.println(criacao_alimento.peso);
        System.out.println(criacao_alimento.preco);
        System.out.println(criacao_alimento.quantidade_estoque);
        System.out.println(criacao_alimento.sabor);
        System.out.println(criacao_alimento.textura);
    
    }
}

class alimento{ 
    //Atributos
    String nome,Grupo_alimentar,sabor,aroma,textura;
    int preco,data_venda,data_compra,peso,quantidade_estoque;
    //Método construtor
    alimento(
        String grupo_digi,
        String nome_digi,
        String sabor_digi,
        String aroma_digi,
        String textura_digi,
        int preco_digi,
        int data_venda_digi,
        int data_compra_digi,
        int peso_digi,
        int quantidade_estoque_digi
    ){
        nome = nome_digi;
        Grupo_alimentar = grupo_digi;  
        sabor = sabor_digi;
        aroma = aroma_digi;
        textura = textura_digi;
        preco = preco_digi;
        data_venda = data_venda_digi;
        data_compra = data_compra_digi;
        peso = peso_digi;
        quantidade_estoque = quantidade_estoque_digi;
    }

}