package exercicio3;

import java.util.Objects;

public class DetalhesProduto implements Comparable<DetalhesProduto>{

    protected String nome;
    protected double preco;
    protected int codigoDeBarra;

    public DetalhesProduto(String nome, double preco, int codigoDeBarra) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalhesProduto outroProduto = (DetalhesProduto) o;
        return codigoDeBarra == outroProduto.codigoDeBarra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeBarra);
    }

    @Override
    public int compareTo(DetalhesProduto outroProduto) {
        return nome.compareTo(outroProduto.getNome());
    }

    public int compareTo(DetalhesProduto produto1, DetalhesProduto produto2){
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}
