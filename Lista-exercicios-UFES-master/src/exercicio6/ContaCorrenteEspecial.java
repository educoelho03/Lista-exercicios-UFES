package exercicio6;

public class ContaCorrenteEspecial extends ContaCorrente {

    @Override
    public void sacar(double valor)  {
        double taxa = valor * 0.001; // Calcula a taxa de operação reduzida para clientes especiais
        double valorTotal = valor + taxa; // Calcula o valor total a ser debitado

        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Taxa de operação: R$" + taxa);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
