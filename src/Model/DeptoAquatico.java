package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeptoAquatico implements Esportes {
    List<String> esportesAquaticos = new ArrayList<>();
    private String nome;
    private String departamento;
    private int numeroDeAtletas;
    private int numeroDeAulasPorSemana;

    public DeptoAquatico(String nome, String departamento, int numeroDeAtletas, int numeroDeAulasPorSemana) {
        this.nome = nome;
        this.departamento = departamento;
        this.numeroDeAtletas = numeroDeAtletas;
        this.numeroDeAulasPorSemana = numeroDeAulasPorSemana;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumeroDeAtletas() {
        return numeroDeAtletas;
    }

    public void setNumeroDeAtletas(int numeroDeAtletas) {
        this.numeroDeAtletas = numeroDeAtletas;
    }

    public int getNumeroDeAulasPorSemana() {
        return numeroDeAulasPorSemana;
    }

    public void setNumeroDeAulasPorSemana(int numeroDeAulasPorSemana) {
        this.numeroDeAulasPorSemana = numeroDeAulasPorSemana;
    }

    public void removerEsporte(String nomeDoEsporte) {
        // Lógica para remover esporte aquático
        esportesAquaticos.removeIf(esporte -> esporte.startsWith(nomeDoEsporte));
        System.out.println("Esporte aquático removido: " + nomeDoEsporte);
    }

    @Override
    public void cadastrarEsporte(String nomeDoEsporte, String modalidade) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastre um esporte aquático:");
        nomeDoEsporte = scanner.nextLine();
        System.out.println("Informe a modalidade:");
        modalidade = scanner.nextLine();
        esportesAquaticos.add(nomeDoEsporte + " - " + modalidade);
        System.out.println("Esporte aquático cadastrado: " + nomeDoEsporte + " - " + modalidade);
        scanner.close();
    }

    @Override
    public void listarEsportes() {
        // Lógica para listar esportes aquáticos
        for (String esporte : esportesAquaticos) {
            System.out.println(esporte);
        }
    }
    
}
