package View;

import javax.swing.*;
import Model.Presidente;

class CadastroPresidente extends JDialog {
    private JTextField nomeField, cpfField, cargoField, salarioField, mandatoField;
    private JButton salvarBtn;

    public CadastroPresidente(JFrame parent) {
        super(parent, "Cadastro de Presidente", true);
        setSize(500, 400);
        setLayout(new java.awt.GridLayout(6,2));

        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        add(new JLabel("Data de Nascimento:"));
        JTextField dataField = new JTextField();
        add(dataField);

        add(new JLabel("Cargo:"));
        cargoField = new JTextField("Presidente"); // já pode vir preenchido
        add(cargoField);

        add(new JLabel("Salário:"));
        salarioField = new JTextField();
        add(salarioField);

        add(new JLabel("Partido:"));
        JTextField partidoField = new JTextField();
        add(partidoField);

        add(new JLabel("Mandato (anos):"));
        mandatoField = new JTextField();
        add(mandatoField);

        salvarBtn = new JButton("Salvar");
        add(salvarBtn);

        salvarBtn.addActionListener(e -> {
            Presidente presidente = new Presidente(
                nomeField.getText(),
                cpfField.getText(),
                cargoField.getText(),
                dataField.getText(),
                Double.parseDouble(salarioField.getText()),
                partidoField.getText(),
                Integer.parseInt(mandatoField.getText())
            );
            CadastroPessoas.adicionarPessoa(presidente);
            JOptionPane.showMessageDialog(this,
                "Presidente cadastrado: " + presidente.getNome());
            dispose();
        });

        setVisible(true);
    }
}