package View;

import Model.*;
import javax.swing.*;

public class CadastroDeptoTerrestre extends JDialog {
    private JTextField nomeField, deptoField, atletasField, aulasField;
    private JButton salvarBtn;

    public CadastroDeptoTerrestre(JFrame parent){
        super(parent, "Cadastro de Esporte Terrestre", true);
        setSize(400, 300);
        setLayout(new java.awt.GridLayout(5,2));

        add(new JLabel("Nome do Esporte:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Departamento:"));
        deptoField = new JTextField();
        add(deptoField);

        add(new JLabel("Número de Atletas:"));
        atletasField = new JTextField();
        add(atletasField);

        add(new JLabel("Número de Aulas por Semana:"));
        aulasField = new JTextField();
        add(aulasField);

        salvarBtn = new JButton("Salvar");
        add(salvarBtn);

        salvarBtn.addActionListener(e -> {
            DeptoTerrestre esporte = new DeptoTerrestre(
                nomeField.getText(),
                deptoField.getText(),
                Integer.parseInt(atletasField.getText()),
                Integer.parseInt(aulasField.getText())
            );
            CadastroEsportes.adicionar(esporte);

            if(!deptoField.getText().equals("Terrestre")){
                JOptionPane.showMessageDialog(this,
                "Departamento inválido. Somente esportes terrestres podem ser cadastrados.");
                dispose();
                return;
            }


            JOptionPane.showMessageDialog(this,
                "Esporte Terrestre cadastrado: " + esporte.getNome());
            dispose();
        });

        setVisible(true);
    }
}
