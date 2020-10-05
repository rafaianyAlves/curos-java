package Lambdas;

public class CalcularTeste2 {
	public static void main(String[] args) {
		Calculo calc = (x,y) -> {
			return x+y;};
			System.out.println(calc.executar(3, 4));
			
			calc = (x,y) -> {
				return x*y;
			};
			System.out.println(calc.executar(3, 4));
//			System.out.println(calc.muitoLegal());
			System.out.println(calc.legal());
	}
}
