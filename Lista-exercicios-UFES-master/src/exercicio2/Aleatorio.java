package exercicio2;
import java.util.Random;


public class Aleatorio {

    private static final int VALOR_MAXIMO_DEFAULT = 100;
    Random random = new Random(System.currentTimeMillis());
    private int numeroAleatorio;
    private int valorMaximo;

    public Aleatorio(){
        this(VALOR_MAXIMO_DEFAULT);
    }

    public Aleatorio(int valorMaximo) {
        numeroAleatorio = random.nextInt(valorMaximo + 1);
    }

    public int geraNumAleatorio(){
        return numeroAleatorio;
    }

    public void renovar(){
        numeroAleatorio = random.nextInt(valorMaximo + 1);
        System.out.println("Numero aleatorio renovado: " + numeroAleatorio);
    }
}