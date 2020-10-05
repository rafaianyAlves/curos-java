package Lambdas;


import java.util.function.BinaryOperator;

public class CalculoTeste3 {public static void main(String[] args) {
	// qualquer numero literal é tipo int como (int -> Double)
	// double -> Double
	
	BinaryOperator<Double> calc =(x,y) -> {return x+y; };
	System.out.println(calc.apply(3.0, 4.0));

	calc = (x,y) -> {return x*y; };
	System.out.println(calc.apply(3.0, 4.0));
}
	
	// nao precisaria de uma intrface calculo, pois usamos aqui /n
    // BinaryOperator <> 
	

}
