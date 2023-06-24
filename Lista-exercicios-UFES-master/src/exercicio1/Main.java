package exercicio1;

public class Main{
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("Apple", "24340025000100");
        Empresa empresa2 = new Empresa("Samsung", "92419480000148");
        Empresa empresa3 = new Empresa("Nestle", "69617106000135");

        Departamento d1 = new Departamento("RH");
        Departamento d2 = new Departamento("TI");
        Departamento d3 = new Departamento("Marketing");

        Funcionario f1 = new Funcionario("Eduardo", 3200);
        Funcionario f2 = new Funcionario("João", 1500);
        Funcionario f3 = new Funcionario("Guilherme", 5300);

        empresa1.adicionaDepartamento(d2);
        empresa2.adicionaDepartamento(d1);
        empresa3.adicionaDepartamento(d3);

        d1.adicionarFuncionario(f2);
        d2.adicionarFuncionario(f1);
        d3.adicionarFuncionario(f3);

        d1.listarFuncionarios();

    }
}
