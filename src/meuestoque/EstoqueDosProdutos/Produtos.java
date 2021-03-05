package meuestoque.EstoqueDosProdutos;

import java.util.Scanner;

public class Produtos {

    private String nome_do_produto;
    private String categoria_do_produto;
    private float valor_do_produto;
    private int quantidade_do_produto;
    private float valor_total;

    public Produtos() {
    }

    public void estoque() {

        try {

            Scanner teclado = new Scanner(System.in);

            System.out.println("------------------------");
            System.out.println("Vamos cadastrar um produto");
            System.out.println();
            System.out.println("Digite o nome do produto: ");
            nome_do_produto= teclado.next();
            System.out.println("Digite a categoria do produto");
            categoria_do_produto = teclado.next();
            System.out.println("Digite a quantidade do produto: ");
            quantidade_do_produto = teclado.nextInt();
            System.out.println("Digite o valor do produto: ");
            valor_do_produto = teclado.nextFloat();
            System.out.println("------------------------");
            System.out.println();
            
            estocado();

        } catch (Exception e) {
            System.out.println("Os campos não foram completados corretamente");
        }

    }

    private void estocado() {
        System.out.println("------------------------");
        System.out.println("Seu estoque");
        System.out.println();
        System.out.println("Nome do produto: " + getNome_do_produto());
        System.out.println("Categoria do produto: " + getCategoria_do_produto());
        System.out.println("Valor do produto: " + getValor_do_produto());
        System.out.println("Quantidade do produto: " + getQuantidade_do_produto());
        System.out.printf("Valor total do estoque é: %.2f", getValor_total());
        System.out.println();
        System.out.println("------------------------");
    }

    private float calculandoEstoque() {

        float soma;
        soma = Float.valueOf(this.getQuantidade_do_produto()) * this.getValor_do_produto();
        this.valor_total = soma;
        return soma;

    }

    private String getNome_do_produto() {
        return nome_do_produto;
    }

    private void setNome_do_produto(String nome_do_produto) {
        this.nome_do_produto = nome_do_produto;
    }

    private String getCategoria_do_produto() {
        return categoria_do_produto;
    }

    private void setCategoria_do_produto(String categoria_do_produto) {
        this.categoria_do_produto = categoria_do_produto;
    }

    private float getValor_do_produto() {
        return valor_do_produto;
    }

    private void setValor_do_produto(float valor_do_produto) {
        this.valor_do_produto = valor_do_produto;
    }

    private int getQuantidade_do_produto() {
        return quantidade_do_produto;
    }

    private void setQuantidade_do_produto(int quantidade_do_produto) {
        this.quantidade_do_produto = quantidade_do_produto;
    }

    private float getValor_total() {
        return valor_total = calculandoEstoque();
    }

}
