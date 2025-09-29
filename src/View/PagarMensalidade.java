package View;

import javax.swing.*;

public class PagarMensalidade extends JDialog {
    public PagarMensalidade(JFrame parent) {
        super(parent, "Pagar Mensalidade", true);
        setSize(300, 150);
        setLayout(new java.awt.GridLayout(2,2));

        add(new JLabel("Mensalidade paga com sucesso!"));
        JButton okBtn = new JButton("OK");
        add(okBtn);

        okBtn.addActionListener(e -> {
            dispose();
        });

        setVisible(true);
    }

}
