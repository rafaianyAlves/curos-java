package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> soma = (ac, n) -> ac+n;
		BinaryOperator<Integer> subtracao = (ac, n) -> ac-n;
		BinaryOperator<Integer> multiplicacao = (ac, n) -> ac*n;
		int total = nums.stream().reduce(soma).get();	
		System.out.println(total);
		
		Integer total1 = nums.stream().reduce(100, soma);
		System.out.println(total1);
		
		
		Integer total2 = nums.stream().reduce(15, subtracao);
		System.out.println(total2);
		
		Integer total3 = nums.stream().reduce(5, multiplicacao);
		System.out.println(total3); 
		
		nums.stream()
		.filter(n -> n> 2)
		.reduce(soma)
		.ifPresent(System.out::println);	 // se esta presente (isPresent) nao esquecer	
		//pode usar get(); pode ser int ou Integer
		//forma reduzida de fazer uma soma;
	}

}
