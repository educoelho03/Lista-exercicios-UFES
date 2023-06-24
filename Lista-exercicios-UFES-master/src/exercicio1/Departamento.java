package exercicio1;

public class Departamento {
    private final String nome;
    private final Funcionario[] funcionarios;
    private int quantidadeFuncionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new Funcionario[100];
        this.quantidadeFuncionarios = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (quantidadeFuncionarios < 100) {
            boolean funcionarioJaExiste = false;

            for (int i = 0; i < quantidadeFuncionarios; i++) {
                if (funcionarios[i].getNome().equals(funcionario.getNome())) {
                    funcionarioJaExiste = true;
                    break;
                }
            }

            if (!funcionarioJaExiste) {
                funcionarios[quantidadeFuncionarios] = funcionario;
                quantidadeFuncionarios++;
                System.out.println(funcionario.getNome() + " adicionado com sucesso.");
            } else {
                System.out.println("Este funcionário já trabalha neste departamento.");
            }
        } else {
            System.out.println("Limite máximo de funcionários atingido.");
        }
    }

    public void listarFuncionarios(){
        System.out.println("Funcionarios do departamento " + nome + ": ");
        for(int i = 0; i < quantidadeFuncionarios; i++){
            System.out.println(funcionarios[i].getNome());
        }
    }
}
