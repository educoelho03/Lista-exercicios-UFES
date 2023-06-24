package exercicio1;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private Departamento[] departamentos;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    int quantidadeDepartamentos = 0;


    public Empresa(String nomeEmpresa, String CNPJ) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = CNPJ;
        this.departamentos = new Departamento[10];
    }

    public void adicionaDepartamento(Departamento departamento){
        if(quantidadeDepartamentos < 10){
            departamentos[quantidadeDepartamentos] = departamento;
            quantidadeDepartamentos++;
        }else {
            System.out.println("Esta empresa não suporta mais departamentos.");
        }
    }

    public double bonusSalario(Funcionario salario){
        return salario.getSalario();
    }

}
