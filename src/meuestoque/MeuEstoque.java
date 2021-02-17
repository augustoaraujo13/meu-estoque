package meuestoque;

import java.util.Scanner;
import meuestoque.EstoqueDosProdutos.Produtos;
import meuestoque.EstoqueDosProdutos.ProdutosException;

public class MeuEstoque {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.println("------------------------");
            System.out.println("Vamos cadastrar um produto");
            System.out.println();
            System.out.println("Digite o nome do produto: ");
            String nome = teclado.next();
            System.out.println("Digite a categoria do produto");
            String categoria = teclado.next();
            System.out.println("Digite a quantidade do produto: ");
            int quantidade = teclado.nextInt();
            System.out.println("Digite o valor do produto: ");
            float valor = teclado.nextFloat();
            System.out.println("------------------------");
            System.out.println();

            Produtos p = new Produtos();
            p.setNome_do_produto(nome);
            p.setCategoria_do_produto(categoria);
            p.setQuantidade_do_produto(quantidade);
            p.setValor_do_produto(valor);
            p.Estocado();
            
        } catch (Exception e) {
            System.out.println("Os campos não foram completados corretamente");
        }
        
        finally{
        teclado.close();
        }
    }
}

