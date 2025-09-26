package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Model.Esportes;

class TabelaEsportes extends JDialog {
    public TabelaEsportes(JFrame parent, Esportes departamento, String titulo) {
        super(parent, "Lista de " + titulo, true);
        setSize(400, 300);

        String[] colunas = {"Nome", "Modalidade","Qtd de atletas", "Aulas/Semana"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Esportes esporte : CadastroEsportes.getListaEsportesTerrestres()) {
            modelo.addRow(new Object[]{esporte.getNome(), esporte.getDepartamento(), ((Model.DeptoTerrestre) esporte).getNumeroDeAtletas(), ((Model.DeptoTerrestre) esporte).getNumeroDeAulasPorSemana()});
        }

        JTable tabela = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabela);

        add(scroll);
        setVisible(true);
    }
}

