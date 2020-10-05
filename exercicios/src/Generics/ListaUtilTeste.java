package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
	List<String> langs = Arrays.asList("Java", "PHP", "c++");
	List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
	System.out.println(ultimaLinguagem);
	
	Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
	System.out.println(ultimoNumero); // sem usar generics
	
	String ultimaLinguagem1 =  ListaUtil.getUltimo2(langs);
	System.out.println(ultimaLinguagem1);
	
	 Integer ultimoNumero1 = ListaUtil.getUltimo2(nums);
	System.out.println(ultimoNumero1); 

	}

}
