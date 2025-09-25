package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeptoAquatico implements Esportes {
    List<String> esportesAquaticos = new ArrayList<>();
    // Implementação dos métodos da interface Esportes
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
