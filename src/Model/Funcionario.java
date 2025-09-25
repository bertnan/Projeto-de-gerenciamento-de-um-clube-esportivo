package Model;
public class Funcionario extends Pessoa {
    private String cargo;
    private Double salario;


    public Funcionario(String nome, String cpf, String dataDeNascimento, String cargo, Double salario) {
        super(nome, cpf, dataDeNascimento);
        this.cargo = cargo;
        this.salario = salario;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }



    public void receberSalario() {
        System.out.println("Salário de R$" + salario + " recebido com sucesso!");
    }
}
