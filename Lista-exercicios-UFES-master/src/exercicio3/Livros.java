package exercicio3;

public class Livros extends DetalhesProduto {

    private String autor;

    public Livros(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return getNome() +  ", " + getPreco() + " e " + autor;
    }
}
