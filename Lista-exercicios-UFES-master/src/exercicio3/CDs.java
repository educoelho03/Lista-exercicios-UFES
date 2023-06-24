package exercicio3;

public class CDs extends DetalhesProduto {

    private int numFaixas;

    public CDs(String nome, double preco, int numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getPreco() + " e " + numFaixas;
    }

    public int lancouFaixa(){
        return numFaixas += 1;
    }

}
