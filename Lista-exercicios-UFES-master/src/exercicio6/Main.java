package exercicio6;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();

        conta1.setSaldo(1000);
        System.out.println("Saldo da sua conta " + conta1.consultarSaldo());

        conta1.depositar(10);
        System.out.println("Saldo da sua conta " + conta1.consultarSaldo());

        conta1.sacar(500);
        System.out.println("Saldo da sua conta " + conta1.consultarSaldo());

    }
}
