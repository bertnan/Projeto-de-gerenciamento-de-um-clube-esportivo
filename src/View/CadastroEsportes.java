package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import Model.*;

public class CadastroEsportes extends JDialog {
    private static ArrayList<Esportes> listaEsportes = new ArrayList<>();

    public static void adicionar(Esportes esporte) {
        listaEsportes.add(esporte);
    }

    public static ArrayList<Esportes> getListaEsportes() {
        return listaEsportes;
    }
}
