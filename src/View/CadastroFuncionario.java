package View;

import javax.swing.*;
import Model.Funcionario;

class CadastroFuncionario extends JDialog {
    private JTextField nomeField, cpfField, cargoField, salarioField;
    private JButton salvarBtn;

    public CadastroFuncionario(JFrame parent) {
        super(parent, "Cadastro de Funcionário", true);
        setSize(300, 200);
        setLayout(new java.awt.GridLayout(5,2));

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
        cargoField = new JTextField();
        add(cargoField);

        add(new JLabel("Salário:"));
        salarioField = new JTextField();
        add(salarioField);

        salvarBtn = new JButton("Salvar");
        add(salvarBtn);

        salvarBtn.addActionListener(e -> {
            Funcionario f = new Funcionario(
                nomeField.getText(),
                cpfField.getText(),
                dataField.getText(),
                cargoField.getText(),
                Double.parseDouble(salarioField.getText())
            );
            JOptionPane.showMessageDialog(this,
                "Funcionário cadastrado: " + f.getNome());
            dispose();
        });

        setVisible(true);
    }
}
