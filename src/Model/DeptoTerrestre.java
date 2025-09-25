package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeptoTerrestre implements Esportes {
    List<String> esportesTerrestres = new ArrayList<>();
    // Implementação dos métodos da interface Esportes
    @Override
    public void cadastrarEsporte(String nomeDoEsporte, String modalidade) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastre um esporte terrestre:");
        nomeDoEsporte = scanner.nextLine();
        System.out.println("Informe a modalidade:");
        modalidade = scanner.nextLine();
        esportesTerrestres.add(nomeDoEsporte + " - " + modalidade);
        System.out.println("Esporte terrestre cadastrado: " + nomeDoEsporte + " - " + modalidade);
        scanner.close();
    }

    @Override
    public void listarEsportes() {
        // Lógica para listar esportes terrestres
        for (String esporte : esportesTerrestres) {
            System.out.println(esporte);
        }
    }

}
