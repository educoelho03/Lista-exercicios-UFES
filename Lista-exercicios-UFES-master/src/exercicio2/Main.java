package exercicio2;

public class Main{
    public static void main(String[] args) {

        Aleatorio aleatorio = new Aleatorio();

        for(int i = 0; i <= 10; i++){
            System.out.println("Numero aleatório: " + aleatorio);
        }

        aleatorio.renovar();


    }
}
