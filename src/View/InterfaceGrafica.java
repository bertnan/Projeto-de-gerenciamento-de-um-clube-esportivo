package View;
import javax.swing.*;

import Model.DeptoAquatico;
import Model.DeptoTerrestre;
import Model.Esportes;

public class InterfaceGrafica extends JFrame {
    private DeptoTerrestre deptTerrestres = new DeptoTerrestre("Departamento de Esportes Terrestres", "Terrestre", 0, 0);
    private DeptoAquatico deptAquaticos = new DeptoAquatico("Departamento de Esportes Aquáticos", "Aquático", 0, 0);


    public InterfaceGrafica() {
        setTitle("Sistema de Gerenciamento do Clube");
        setSize(900,600);
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
        JMenuItem cadastrarEsporteTerrestre = new JMenuItem("Cadastrar Esporte Terrestre");
        JMenuItem cadastrarEsporteAquatico = new JMenuItem("Cadastrar Esporte Aquático");

        menuCadastro.add(cadastrarFuncionario);
        menuCadastro.add(cadastrarSocio);
        menuCadastro.add(cadastrarPresidente);
        menuCadastro.addSeparator();
        menuCadastro.add(cadastrarEsporteTerrestre);
        menuCadastro.add(cadastrarEsporteAquatico);

        // Departamentos


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

        cadastrarEsporteTerrestre.addActionListener(e -> {
            new CadastroDeptoTerrestre(this);
        });

        cadastrarEsporteAquatico.addActionListener(e -> {
            new CadastroDeptoAquatico(this);
        });

        JMenu menuVisualizar = new JMenu("Visualizar");
        JMenuItem listarPessoas = new JMenuItem("Listar Pessoas");
        menuVisualizar.add(listarPessoas);

        listarPessoas.addActionListener(e -> new TabelaPessoas(this));
        
        // opções de listar
        JMenuItem deptTerrestreList = new JMenuItem("Listar Esportes Terrestres");
        JMenuItem deptAquaticoList = new JMenuItem("Listar Esportes Aquáticos");

        menuDepartamentos.add(deptTerrestreList);

        menuDepartamentos.add(deptAquaticoList);

        // ações de listar
        deptTerrestreList.addActionListener(e -> new TabelaEsportes(this, deptTerrestres, "Esportes Terrestres"));
        deptAquaticoList.addActionListener(e -> new TabelaEsportesAquaticos(this, deptAquaticos, "Esportes Aquáticos"));

        menuBar.add(menuDepartamentos);
        

        menuBar.add(menuVisualizar);


        setJMenuBar(menuBar);

        setVisible(true);
    }
}
