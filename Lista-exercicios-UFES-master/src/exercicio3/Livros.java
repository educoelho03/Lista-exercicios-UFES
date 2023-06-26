package exercicio3;

public class Livros extends DetalhesProduto {

    private String autor;

    public Livros(String nome, double preco, String autor, int codigoDeBarra) {
        super(nome, preco, codigoDeBarra);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return getNome() +  ", " + getPreco() + " e " + autor;
    }
}
