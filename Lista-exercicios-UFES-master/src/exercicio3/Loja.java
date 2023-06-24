package exercicio3;

public class Loja {
    public static void main(String[] args) {

        DetalhesProduto[] produtos = new DetalhesProduto[5];

        produtos[0] = new Livros("Capitão cueca", 19.90, "Bill Gates");
        produtos[1] = new CDs("Deluxe", 10d, 23);
        produtos[2] = new DVDs("Carros", 6.99, 130);
        produtos[3] = new DVDs("Star Wars", 15.99, 210);
        produtos[4] = new Livros("Percy Jackson", 49.90, "Rick Riodan");


        for(DetalhesProduto produto: produtos){
            System.out.println(produto);;

        }

    }
}

