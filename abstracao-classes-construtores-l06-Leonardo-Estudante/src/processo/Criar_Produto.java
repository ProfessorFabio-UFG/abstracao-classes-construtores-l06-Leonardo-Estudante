package processo;

import modelos.Produto;
import javax.swing.JOptionPane;

public class Criar_Produto {

	public static Produto criar() {
		//Atributos de Produto
		int codigoSequencial;
		String nomeProduto;
		int quantidade = 0;
		String tipo;
		float valorProduto = 0.0f;
		Produto produto = null;
		
		//Entrada de Dados
		codigoSequencial = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo desse Produto: "));

		nomeProduto = JOptionPane.showInputDialog("Digite o nome do Produto: ");
		
		try {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desse Produto: "));	
		} catch(Exception e) {
			quantidade = 0;
		}

		tipo = JOptionPane.showInputDialog("Digite o tipo do Produto: ");
		
		try {
			valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor desse Produto: "));
		} catch(Exception e) {
			valorProduto = 0.0f;
		}
		
		//Verificações para decidir qual construtor utilizar
		if (nomeProduto.isEmpty() && quantidade == 0 && valorProduto == 0 && tipo.isEmpty()) {
			produto = new Produto(codigoSequencial);
		} else if (quantidade == 0 && valorProduto == 0 && tipo.isEmpty()) {
			produto = new Produto(codigoSequencial, nomeProduto);
		} else if (valorProduto == 0 && tipo.isEmpty()) {
			produto = new Produto(codigoSequencial, nomeProduto, quantidade);
		} else {
			produto = new Produto(codigoSequencial, nomeProduto, quantidade, tipo, valorProduto);
		}

		return produto;
	}
}
