package exercicio3;

public class DVDs extends DetalhesProduto {

    private int duracao;

    public DVDs(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        int horas = duracao / 60;
        int minutos = duracao % 60;

        return getNome() + ", " + getPreco() + "com duração de: " + horas + "h" + minutos + "min";
    }


}
