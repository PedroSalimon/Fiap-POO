package Exec_Capsulamento.br.fiap.Util;
import Exec_Capsulamento.br.fiap.fornecedor.Fornecedor;
import Exec_Capsulamento.br.fiap.produto.Produto;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Double.*;

public class Util {
    private Fornecedor[] fornecedor = new Fornecedor[3];
    private Produto [] produto = new Produto[2*fornecedor.length];
    private int indexProduto = 0, indexFornecedor = 0;

    public void menuCadastro () {
        int opcao = 0;
        String menu = "1. Cadastrar produto";
        menu += "\n2. Pesquisar produto";
        menu += "\n3. Pesquisar Fornecedor";
        menu += "\n4. Finalizar";

        while (true) {
            opcao = parseInt(showInputDialog(menu));
            if (opcao == 4) {
                return;
            }
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisar();
                    break;
                default:
                    showMessageDialog(null, "Opção Inválida");
            }

        }
    }

    private void cadastrarProduto () {
        String nome;
        int qtdEstoque;
        double valorUnitário;
        Fornecedor fornecedor = pesquisarFornecedor();
        if (fornecedor == null) {
            fornecedor = cadastrarFornecedor();
        }
        nome = showInputDialog("Nome do produto:");
        qtdEstoque = parseInt(showInputDialog("Qtd em estoque:"));
        valorUnitário = parseDouble(showInputDialog("Valor do produto:"));
        produto[indexProduto] = new Produto(nome, valorUnitário, qtdEstoque, fornecedor);
        indexProduto++;
    }

    private void pesquisarProduto () {
        String aux = "Produto Inexistente";
        String nome = showInputDialog("Nome do produto:");
        for (int i = 0; i < indexProduto; i ++) {
            if (produto[i].getNome().equalsIgnoreCase(nome)) {
                aux= "";
                aux +=  "Nome: " + produto[i].getNome() +
                        "\nValor: R$" + produto[i].getValor() +
                        "\nFornecedor: " + produto[i].getFornecedor().getNome();
                break;
            }
        }
        showMessageDialog(null, aux);
    }

    private Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do Fornecedor"));
        for (int i = 0; i < indexFornecedor; i++) {
            if (fornecedor[i].getCnpj() == cnpj) {
                return fornecedor[i];
            }
        }
        showMessageDialog(null, cnpj + " não está cadastrado");
        return null;
    }

    private void pesquisar () {
        Fornecedor fornecedor = pesquisarFornecedor();
        if (fornecedor != null) {
            showMessageDialog(null, fornecedor.getCnpj() +
                    "\n" + fornecedor.getNome());
        }
    }

    private Fornecedor cadastrarFornecedor () {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor:"));
        String nome = showInputDialog("Nome do fornecedor");
        fornecedor[indexFornecedor] = new Fornecedor(nome, cnpj);
        indexFornecedor++;
        return fornecedor[indexFornecedor-1];
    }
}
