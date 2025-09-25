package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Model.Pessoa;

class TabelaPessoas extends JDialog {
    public TabelaPessoas(JFrame parent) {
        super(parent, "Lista de Pessoas", true);
        setSize(500, 300);

        String[] colunas = {"Tipo", "Nome", "CPF"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // percorre a lista e adiciona na tabela
        for (Pessoa p : CadastroPessoas.getLista()) {
            String tipo = p.getClass().getSimpleName(); // Sócio, Funcionario, Presidente
            modelo.addRow(new Object[]{tipo, p.getNome(), p.getCpf()});
        }

        JTable tabela = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabela);

        add(scroll);
        setVisible(true);
    }
}