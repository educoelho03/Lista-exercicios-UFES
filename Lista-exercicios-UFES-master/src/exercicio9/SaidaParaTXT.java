package exercicio9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaidaParaTXT {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i, n;

        System.out.print("Informe o número para a tabuada:\n");
        n = ler.nextInt();

        FileWriter arq = new FileWriter("C:\\Users\\ecoelho\\OneDrive - Constancia Investimentos\\Desktop\\tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("+--Resultado--+%n");
        for (i = 1; i <= 10; i++) {
            gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
        }
        gravarArq.printf("+-------------+%n");

        arq.close();

        System.out.println("Tabuada do " + n + " foi gravado com sucesso em C:\\Users\\ecoelho\\OneDrive - Constancia Investimentos\\Desktop\\tabuada.txt");
    }

}