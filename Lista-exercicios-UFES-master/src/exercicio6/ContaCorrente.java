package exercicio6;

public class ContaCorrente {

    private double valor;
    private double saldo;
    private String agencia;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Não é possivel depositar um valor negativo.");
        } else{
            saldo += valor;
            System.out.println("Valor depositado com sucesso.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            double taxa = valor * 0.005; // 0,5% do valor sacado
            double valorTotal = valor - taxa;
            saldo -= valorTotal;
            System.out.println("Valor sacado com sucesso.");
        } else {
            System.out.println("Não é permitido sacar um valor maior que o saldo da sua conta.");
        }
    }

    public double consultarSaldo(){
        return getSaldo();
    }

}
