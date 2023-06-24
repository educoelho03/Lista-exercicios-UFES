package exercicio3;

public class DetalhesProduto {

    protected String nome;
    protected double preco;

    public DetalhesProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }



}
