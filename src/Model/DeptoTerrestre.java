package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeptoTerrestre implements Esportes {
    List<String> modalidades = new ArrayList<>();

    private String nome;
    private String departamento;
    private int numeroDeAtletas;
    private int numeroDeAulasPorSemana;

    public DeptoTerrestre(String nome, String departamento, int numeroDeAtletas, int numeroDeAulasPorSemana) {
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

    @Override
    public void cadastrarEsporte(String nomeDoEsporte, String modalidade) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastre um esporte terrestre:");
        nomeDoEsporte = scanner.nextLine();
        System.out.println("Informe a modalidade:");
        modalidade = scanner.nextLine();
        modalidades.add(nomeDoEsporte + " - " + modalidade);
        System.out.println("Esporte terrestre cadastrado: " + nomeDoEsporte + " - " + modalidade);
        scanner.close();
    }



    public void removerEsporte(String nomeDoEsporte) {
        // Lógica para remover um esporte terrestre
        modalidades.removeIf(esporte -> esporte.startsWith(nomeDoEsporte + " - "));
        System.out.println("Esporte terrestre removido: " + nomeDoEsporte);
    }

    @Override
    public void listarModalidades() {
        // Lógica para listar esportes terrestres
        for (String esporte : modalidades) {
            System.out.println(esporte);
        }
    }



}
