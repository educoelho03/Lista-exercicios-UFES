package exercicio3;

public class CDs extends DetalhesProduto {

    private int numFaixas;

    public CDs(String nome, double preco, int numFaixas, int codigoDeBarra) {
        super(nome, preco, codigoDeBarra);
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getPreco() + " com " + numFaixas + " faixas lançadas.";
    }

    public int lancouFaixa(){
        return numFaixas += 1;
    }

}
