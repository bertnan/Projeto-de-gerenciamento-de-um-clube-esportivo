package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import Model.*;

public class CadastroEsportes extends JDialog {
    private JTextField nomeField;
    private JTextField deptoField;
    private JTextField atletasField;
    private JTextField aulasField;
    private JButton salvarBtn;
    private static ArrayList<Esportes> ListaEsportesTerrestres = new ArrayList<>();
    private static ArrayList<Esportes> ListaEsportesAquaticos = new ArrayList<>();

    public CadastroEsportes(JFrame parent, Esportes departamento) {
        super(parent, "Adicionar Esporte", true);
        setSize(300, 150);
        setLayout(new java.awt.GridLayout(2,2));

        add(new JLabel("Nome do Esporte:"));
        nomeField = new JTextField();
        add(nomeField);

        salvarBtn = new JButton("Adicionar");
        add(salvarBtn);

        salvarBtn.addActionListener(e -> {
            String nome = nomeField.getText();
            if (!nome.isEmpty()) {
                departamento.cadastrarEsporte(nome, nome);
                JOptionPane.showMessageDialog(this, "Esporte adicionado: " + nome);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Digite o nome do esporte!");
            }
        });

        setVisible(true);
    }

    public static void adicionarEsporteTerrestre(Esportes esporte) {
        ListaEsportesTerrestres.add(esporte);
    }

    public static void adicionarEsporteAquatico(Esportes esporte) {
        ListaEsportesAquaticos.add(esporte);
    }

    public static ArrayList<Esportes> getListaEsportesTerrestres() {
        return ListaEsportesTerrestres;
    }

    public static ArrayList<Esportes> getListaEsportesAquaticos() {
        return ListaEsportesAquaticos;
    }


}
