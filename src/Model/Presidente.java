package Model;
public class Presidente extends Funcionario {
    private String partido;
    private int mandato;

    public Presidente(String nome, String cpf, String dataDeNascimento, String cargo, Double salario, String partido, int mandato) {
        super(nome, cpf, dataDeNascimento, cargo, salario);
        this.partido = partido;
        this.mandato = mandato;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getMandato() {
        return mandato;
    }

    public void setMandato(int mandato) {
        this.mandato = mandato;
    }

    public void convocarReuniao() {
        System.out.println("Reunião convocada pelo presidente " + getNome());
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Partido: " + partido);
        System.out.println("Mandato: " + mandato);
    }
}
