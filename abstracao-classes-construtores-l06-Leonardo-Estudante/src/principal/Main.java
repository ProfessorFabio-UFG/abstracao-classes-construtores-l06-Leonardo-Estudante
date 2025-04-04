package principal;

import modelos.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import processo.*;

public class Main {
	public static void main(String[] args) {

		int codigoLoop = 0;
		List<Produto> produtoList = new ArrayList<>();
		
		String[] opcoes = { "Venda", "Comprar", "Comprar Sem Alterar Valor", "Inserir", "Igual", "Criar novo Produto",
				"Mostrar Dados", "Sair" };

		Produto produto = Criar_Produto.criar();
		produtoList.add(produto);

		while (codigoLoop == 0) {

			int resposta = JOptionPane.showOptionDialog(null, "Operações", "Produto", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, opcoes, "Botao 3");

			switch (resposta) {
			case 0:
				Operacoes.vender(produto);
				System.out.println(produto);
				break;
			case 1:
				Operacoes.comprar(produto);
				break;
			case 2:
				Operacoes.comprarSemAlterar(produto);
				break;
			case 3:
				Operacoes.inserir(produto);
				break;
			case 4:
				Operacoes.igual(produto);
				break;
			case 5:
				Produto novoProduto = Criar_Produto.criar();
				produtoList.add(novoProduto);
				break;
			case 6:
				for(Produto prod : produtoList) {
					JOptionPane.showMessageDialog(null, prod);
				}
				break;
			case 7:
				codigoLoop = 1;
				break;
			}
		}
	}
}
