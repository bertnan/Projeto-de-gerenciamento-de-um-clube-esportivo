package Model;
public class Socio extends Pessoa {
    private int numeroSocio;
    private Double mensalidade;
    private String plano;
    private boolean matricula;

    public Socio(String nome, String cpf, String dataDeNascimento, int numeroSocio, Double mensalidade, String plano, boolean matricula) {
        super(nome, cpf, dataDeNascimento);
        this.numeroSocio = numeroSocio;
        this.mensalidade = 100.0; // Valor fixo para a mensalidade
        this.plano = plano;
        this.matricula = false;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade() {
        if (matricula = true) {
            System.out.println("Mensalidade de R$" + mensalidade + " paga com sucesso!");
        }
        else {
            System.out.println("Sócio não matriculado. Não é possível pagar a mensalidade.");
        }
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Número do Sócio: " + numeroSocio);
        System.out.println("Mensalidade: R$" + mensalidade);
        System.out.println("Plano: " + plano);
        System.out.println("Matrícula: " + (matricula ? "Ativa" : "Inativa"));
    }

}
