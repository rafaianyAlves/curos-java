package Generics;

import java.util.List;

public class ListaUtil {
	

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1); // assim que pega o ultimo
		//elemento da lista usando o indice
	}
		public static <T> T getUltimo2(List<T> lista) {
			return lista.get(lista.size() -1); // nao precisa se preocupar com cast
	}
	

}
