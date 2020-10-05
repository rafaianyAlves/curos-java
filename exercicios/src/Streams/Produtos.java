package Streams;

public class Produtos {
	final String nomeDoProduto;
	final double preco;
	final double desconto;
	final double frete;
	
	public Produtos(String nomeDoProduto, double preco, double desconto, double frete) {
		this.preco = preco;
		this.nomeDoProduto = nomeDoProduto;
		this.desconto = desconto;
		this.frete = frete;
	}

}
