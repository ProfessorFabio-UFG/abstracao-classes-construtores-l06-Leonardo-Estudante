package processo;

import javax.swing.JOptionPane;

import modelos.Produto;

public class Operacoes {

	public static void comprar(Produto produto) {
		//Atributos da Operação
		int quantidadeAdicional = 0;
		float valorNovo = 0.0f;
		
		//Leitura de Dados da Operação
		quantidadeAdicional = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade adicional: "));
		valorNovo = Float.parseFloat(JOptionPane.showInputDialog("Digite o novo valor: "));
		
		//Método de Produto
		produto.comprar(quantidadeAdicional, valorNovo);
	}

	public static void vender(Produto produto) {
		//Atributos da Operação
		int quantidade = 0;
		
		//Leitura de Dados da Operação
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida: "));
		
		//Método de Produto
		JOptionPane.showMessageDialog(null, produto.venda(quantidade));
	}

	public static void comprarSemAlterar(Produto produto) {
		//Atributos da Operação
		int quantidadeAdicional = 0;
		
		//Leitura de Dados da Operação
		quantidadeAdicional = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade adicional: "));
		
		//Método de Produto
		produto.comprarSemAlterarValor(quantidadeAdicional);
	}

	public static void inserir(Produto produto) {
		//Atributos da Operação
		String nomeProduto;
		int quantidade = 0;
		String tipo;
		float valorProduto = 0.0f;
		
		//Leitura de Dados da Operação
		nomeProduto = JOptionPane.showInputDialog("Digite o nome do Produto: ");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desse Produto: "));
		tipo = JOptionPane.showInputDialog("Digite o tipo do Produto: ");
		valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor desse Produto: "));
		
		//Método de Produto
		produto.inserir(nomeProduto, quantidade, tipo, valorProduto);
	}

	public static boolean igual(Produto produto) {
		if (produto.igual(produto)) {
			JOptionPane.showMessageDialog(null, "True");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "False");
			return false;
		}

	}
}
