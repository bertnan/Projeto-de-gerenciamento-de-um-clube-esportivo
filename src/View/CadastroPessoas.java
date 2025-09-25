package View;

import Model.Pessoa;
import Model.Presidente;
import Model.Funcionario;

import java.util.ArrayList;

public class CadastroPessoas {
    private static ArrayList<Pessoa> lista = new ArrayList<>();

    public static void adicionar(Pessoa p) {
        lista.add(p);
    }

    public static ArrayList<Pessoa> getLista() {
        return lista;
    }

    public static void adicionarPessoa(Presidente presidente) {
        lista.add(presidente);
    }

    public static void adicionarPessoa(Funcionario funcionario) {
        lista.add(funcionario);
    }
}
