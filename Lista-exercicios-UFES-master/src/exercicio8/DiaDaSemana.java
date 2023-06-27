package exercicio8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        boolean dataValida = false;
        String dataString;

        while (!dataValida) {
            System.out.print("Digite uma data (dd/MM/yyyy): ");
            dataString = scanner.nextLine();

            // Verificar se a data contém letras
            Pattern pattern = Pattern.compile("[a-zA-Z]");
            Matcher matcher = pattern.matcher(dataString);

            if (matcher.find()) {
                System.out.println("Formato de data inválido. A data não deve conter letras.");
            } else {
                try {
                    FileWriter arq = new FileWriter("C:\\datas.txt");
                    PrintWriter gravarArq = new PrintWriter(arq);

                    formatoData.setLenient(false); // Impede a interpretação de datas inválidas, como 31/02/2023
                    Date data = formatoData.parse(dataString);

                    Calendar calendario = Calendar.getInstance();
                    calendario.setTime(data);

                    int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
                    String nomeDiaSemana = obterNomeDiaSemana(diaSemana);

                    System.out.println("A data " + formatoData.format(data) + " cai em um(a) " + nomeDiaSemana + ".");
                    dataValida = true;

                    gravarArq.println("A data " + formatoData.format(data) + " cai em um(a) " + nomeDiaSemana + ".");

                    arq.close();
                } catch (java.text.ParseException | IOException e) {
                    System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
                }
            }
        }

        scanner.close();
    }

    private static String obterNomeDiaSemana(int diaSemana) {
        return switch (diaSemana) {
            case Calendar.SUNDAY -> "Domingo";
            case Calendar.MONDAY -> "Segunda-feira";
            case Calendar.TUESDAY -> "Terça-feira";
            case Calendar.WEDNESDAY -> "Quarta-feira";
            case Calendar.THURSDAY -> "Quinta-feira";
            case Calendar.FRIDAY -> "Sexta-feira";
            case Calendar.SATURDAY -> "Sábado";
            default -> "Desconhecido";
        };
    }
}
