package Model;

import javax.swing.*;

public class convocarReuniao extends JDialog {
    public convocarReuniao(JFrame parent) {
        super(parent, "Reunião convocada", true);
        setSize(300, 150);
        setLayout(new java.awt.GridLayout(2,2));

        add(new JLabel("Reunião convocada com sucesso!"));
        JButton okBtn = new JButton("OK");
        add(okBtn);

        okBtn.addActionListener(e -> {
            dispose();
        });

        setVisible(true);
    }

}
