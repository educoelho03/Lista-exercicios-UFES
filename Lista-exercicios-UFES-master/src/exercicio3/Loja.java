package exercicio3;

import java.util.Arrays;
import java.util.Comparator;

public class Loja {
    public static void main(String[] args) {

        DetalhesProduto[] produtos = new DetalhesProduto[5];

        produtos[0] = new Livros("Capitão cueca", 19.90, "Bill Gates", 1001);
        produtos[1] = new CDs("Deluxe", 10d, 23, 1002);
        produtos[2] = new DVDs("Carros", 6.99, 130, 1003);
        produtos[3] = new DVDs("Star Wars", 15.99, 210, 1004);
        produtos[4] = new Livros("Percy Jackson", 49.90, "Rick Riodan", 1005);


        System.out.println("Vetor original");
        for (DetalhesProduto produto : produtos) {
            System.out.println(produto);
        }


        Arrays.sort(produtos);
        System.out.println("Vetor ordenado por nome");
        for (DetalhesProduto produto : produtos) {
            System.out.println(produto);
        }


        Arrays.sort(produtos, new ComparadorPorPreco());
        System.out.println("\nVetor ordenado por preço:");
        for (DetalhesProduto produto : produtos) {
            System.out.println(produto);
        }
    }

    static class ComparadorPorPreco implements Comparator<DetalhesProduto> {
        @Override
        public int compare(DetalhesProduto produto1, DetalhesProduto produto2) {
            return Double.compare(produto1.getPreco(), produto2.getPreco());
        }
    }

    public static void buscaProduto(DetalhesProduto detalhesProduto, DetalhesProduto[] vetorProdutos) {
        for (int i = 0; i < vetorProdutos.length; i++) {
            if (vetorProdutos[i].equals(detalhesProduto)) {
                System.out.println("Produto encontrado na posição: " + i + " do vetor.");
                return;
            }
        }
        System.out.println("Produto nao encontrado.");
    }
}

