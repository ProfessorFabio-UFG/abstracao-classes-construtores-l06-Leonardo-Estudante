package modelos;

public class Produto {

	// Atributos
	private int codigoSequencial = 0;
	private String nomeProduto;
	private int quantidade = 0;
	private String tipo;
	private float valorProduto = 0.0f;

	// Construtores
	public Produto(int codigoSequencial) {
		this.codigoSequencial = codigoSequencial;
	}

	public Produto(int codigoSequencial, String nomeProduto) {
		this.codigoSequencial = codigoSequencial;
		this.nomeProduto = nomeProduto;
	}

	public Produto(int codigoSequencial, String nomeProduto, int quantidade) {
		this.codigoSequencial = codigoSequencial;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
	}

	public Produto(int codigoSequencial, String nomeProduto, int quantidade, String tipo, float valorProduto) {
		this.codigoSequencial = codigoSequencial;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.valorProduto = valorProduto;
	}

	// Getters and Setters
	public int getCodigoSequencial() {
		return codigoSequencial;
	}

	public void setCodigoSequencial(int codigoSequencial) {
		this.codigoSequencial = codigoSequencial;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}

	// Métodos
	public String venda(int quantidadeVendida) {
		if (quantidadeVendida > quantidade) {
			throw new IllegalArgumentException("Quantidade inválida!");
		} else {
			quantidade -= quantidadeVendida;
			quantidadeVendida *= valorProduto;
			return "O valor total da venda foi: R$" + quantidadeVendida;
		}
	}

	public void comprar(int quantidadeAdicional, float valorNovo) {
		if (quantidadeAdicional < 0 || valorProduto < 0) {
			throw new IllegalArgumentException("Quantidade inválida");
		}
		quantidade += quantidadeAdicional;
		valorProduto = valorNovo;
	}

	public void comprarSemAlterarValor(int quantidadeAdicional) {
		if (quantidadeAdicional < 0) {
			throw new IllegalArgumentException("Quantidade inválida");
		}
		quantidade += quantidadeAdicional;
	}

	@Override
	public String toString() {
		return "Código do Produto: " + codigoSequencial + "\nNome: " + nomeProduto + "\nQuantidade: " + quantidade
				+ "\nTipo: " + tipo + "\nValor: " + valorProduto;
	}

	public void inserir(String nome, int quantidade, String tipo, float valor) {
		setNomeProduto(nome);
		setQuantidade(quantidade);
		setTipo(tipo);
		setValorProduto(valor);
	}

	public boolean igual(Produto produto) {
		if (nomeProduto.equals(tipo)) {
			return true;
		} else {
			return false;
		}
	}

}
