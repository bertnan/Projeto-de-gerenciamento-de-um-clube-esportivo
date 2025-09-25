package View;
import javax.swing.*;

public class InterfaceGrafica extends JFrame {
    public InterfaceGrafica() {
        setTitle("Sistema de Gerenciamento do Clube");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        // Menus
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuDepartamentos = new JMenu("Departamentos");
        JMenu menuOperacoes = new JMenu("Operações");

        // Itens de cadastro
        JMenuItem cadastrarFuncionario = new JMenuItem("Cadastrar Funcionário");
        JMenuItem cadastrarSocio = new JMenuItem("Cadastrar Sócio");
        JMenuItem cadastrarPresidente = new JMenuItem("Cadastrar Presidente");

        menuCadastro.add(cadastrarFuncionario);
        menuCadastro.add(cadastrarSocio);
        menuCadastro.add(cadastrarPresidente);

        // Departamentos
        JMenuItem deptTerrestre = new JMenuItem("Esportes Terrestres");
        JMenuItem deptAquatico = new JMenuItem("Esportes Aquáticos");
        menuDepartamentos.add(deptTerrestre);
        menuDepartamentos.add(deptAquatico);

        // Operações
        JMenuItem pagarMensalidade = new JMenuItem("Pagar Mensalidade");
        JMenuItem calcularSalario = new JMenuItem("Calcular Salário");
        JMenuItem convocarReuniao = new JMenuItem("Convocar Reunião");
        menuOperacoes.add(pagarMensalidade);
        menuOperacoes.add(calcularSalario);
        menuOperacoes.add(convocarReuniao);

        // Adiciona menus na barra
        menuBar.add(menuCadastro);
        menuBar.add(menuDepartamentos);
        menuBar.add(menuOperacoes);

        cadastrarSocio.addActionListener(e -> {
            new CadastroSocio(this); // passa a janela principal como "pai"
        });

        cadastrarPresidente.addActionListener(e -> {
            new CadastroPresidente(this);
        });

        cadastrarFuncionario.addActionListener(e -> {
            new CadastroFuncionario(this);
        });

        JMenu menuVisualizar = new JMenu("Visualizar");
        JMenuItem listarPessoas = new JMenuItem("Listar Pessoas");
        menuVisualizar.add(listarPessoas);

        listarPessoas.addActionListener(e -> new TabelaPessoas(this));

        menuBar.add(menuVisualizar);


        setJMenuBar(menuBar);

        setVisible(true);
    }
}
