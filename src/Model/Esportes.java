package Model;
public interface Esportes {
    void cadastrarEsporte(String nomeDoEsporte, String modalidade);
    void listarEsportes();
    void removerEsporte(String nomeDoEsporte);
    String getNome();
}
