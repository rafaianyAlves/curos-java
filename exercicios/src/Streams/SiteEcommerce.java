package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SiteEcommerce {
	public static void main(String[] args) {
		Produtos p1 = new  Produtos("iPhoneX" , 4500.85, 0.35, 0.00);
		Produtos p2 = new Produtos("Caderno" , 15.95, 0.20, 5.00);
		Produtos p3 = new Produtos("Notebook" , 5550.96, 0.55, 0.00);
		Produtos p4 = new Produtos("MacBook Air" , 10500.00, 0.45,0.00);
		       
		List<Produtos> produtos = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Produtos> superDescontos = p -> p.desconto >= 0.30;
		Predicate<Produtos> freteGratis = p -> p.frete ==0;
		Predicate<Produtos> produtoRelevante = p -> p.preco >=500;
		Function<Produtos, String > ganhouDesconto = p -> " Aproveite o " 
		+ p.nomeDoProduto 
		+ " por R$"
		+ p.preco;
		
		produtos.stream()
		.filter(superDescontos)
		.filter(freteGratis)
		.filter(produtoRelevante)
		.map(ganhouDesconto)
		.forEach(System.out::println);
		
	
	}

}
