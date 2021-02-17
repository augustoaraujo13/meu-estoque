package meuestoque.EstoqueDosProdutos;

public class Produtos {

    private String nome_do_produto;
    private String categoria_do_produto;
    private float valor_do_produto;
    private int quantidade_do_produto;
    private float valor_total;

    public Produtos() {
    }

    public void Estocado() {
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

    public float calculandoEstoque() {

        float soma;
        soma = Float.valueOf(this.getQuantidade_do_produto()) * this.getValor_do_produto();
        this.valor_total = soma;
        return soma;

    }

    public String getNome_do_produto() {
        return nome_do_produto;
    }

    public void setNome_do_produto(String nome_do_produto) {
        this.nome_do_produto = nome_do_produto;
    }

    public String getCategoria_do_produto() {
        return categoria_do_produto;
    }

    public void setCategoria_do_produto(String categoria_do_produto) {
        this.categoria_do_produto = categoria_do_produto;
    }

    public float getValor_do_produto() {
        return valor_do_produto;
    }

    public void setValor_do_produto(float valor_do_produto) {
        this.valor_do_produto = valor_do_produto;
    }

    public int getQuantidade_do_produto() {
        return quantidade_do_produto;
    }

    public void setQuantidade_do_produto(int quantidade_do_produto) {
        this.quantidade_do_produto = quantidade_do_produto;
    }

    public float getValor_total() {
        return valor_total = calculandoEstoque();
    }

}
