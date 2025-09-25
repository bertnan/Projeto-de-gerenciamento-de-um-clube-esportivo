package View;
import javax.swing.*;
import Model.Socio;


class CadastroSocio extends JDialog {
    private JTextField nomeField, cpfField, numeroSocioField;
    private JButton salvarBtn;

    public CadastroSocio(JFrame parent) {
        super(parent, "Cadastro de Sócio", true);
        setSize(500, 400);
        setLayout(new java.awt.GridLayout(4,2));

        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        add(new JLabel("Número Sócio:"));
        numeroSocioField = new JTextField();
        add(numeroSocioField);

        add(new JLabel("Data de Nascimento:"));
        JTextField dataField = new JTextField();
        add(dataField);

        add(new JLabel("Mensalidade:"));
        JTextField mensalidadeField = new JTextField(); 
        add(mensalidadeField);

        add(new JLabel("Plano:"));
        JTextField planoField = new JTextField(); 
        add(planoField);



        salvarBtn = new JButton("Salvar");
        add(salvarBtn);

        salvarBtn.addActionListener(e -> {
            // Aqui você instancia um Sócio
            Socio socio = new Socio(nomeField.getText(), cpfField.getText(), dataField.getText(), Integer.parseInt(numeroSocioField.getText()), Double.parseDouble(mensalidadeField.getText()), planoField.getText(), false);
            JOptionPane.showMessageDialog(this, "Sócio cadastrado: " + socio.getNome());
            dispose();
        });

        salvarBtn.addActionListener(e -> {
        Socio socio = new Socio(
        nomeField.getText(),
        cpfField.getText(),
        dataField.getText(),
        Integer.parseInt(numeroSocioField.getText()),
        Double.parseDouble(mensalidadeField.getText()),
        planoField.getText(),
        false
        
        );
        CadastroPessoas.adicionar(socio); // <<< salva na lista
        JOptionPane.showMessageDialog(this,
        "Sócio cadastrado: " + socio.getNome());
    dispose();
});

        setVisible(true);
    }
}