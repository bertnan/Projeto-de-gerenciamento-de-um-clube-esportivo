package Model;
public interface Esportes {
    String getDepartamento();
    void cadastrarEsporte(String nomeDoEsporte, String modalidade);
    void listarModalidades();
    void removerEsporte(String nomeDoEsporte);
    String getNome();
}
