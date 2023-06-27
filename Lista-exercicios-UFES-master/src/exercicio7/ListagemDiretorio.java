package exercicio7;


import java.io.File;

public class ListagemDiretorio {
    public static void main(String[] args) {

        String diretorio = "C:/"; // Substitua pelo diretório desejado

        try {
            File pasta = new File(diretorio);
            if (pasta.exists() && pasta.isDirectory()) {
                File[] itens = pasta.listFiles();

                if (itens != null) {
                    for (File item : itens) {
                        String tipo = item.isDirectory() ? "Diretório" : "Arquivo";
                        System.out.println(item.getName() + " - " + tipo);
                    }
                }
            } else {
                System.out.println("O diretório especificado não existe ou não é um diretório válido.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao listar o diretório: " + e.getMessage());
        }
    }
}