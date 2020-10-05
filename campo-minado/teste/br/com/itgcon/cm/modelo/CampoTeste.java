package br.com.itgcon.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.itgcon.cm.excecao.ExplosaoException;
import br.com.itgcon.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo = new Campo(3,3);
	 @Test
	void testeVizinhoRealDistancia1() {
		 
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		 
			Campo vizinho1 = new Campo(3,2);
			boolean resultado1 = campo.adicionarVizinho(vizinho1);
		assertTrue(resultado1);
	}
	 @Test
	 void testeVizinhorRealDistancia2() {
			Campo vizinho = new Campo(2,2);
			boolean resultado = campo.adicionarVizinho(vizinho);
			assertTrue(resultado);

}
	 @Test
	 void testeNaoVizinhoDistancia2() {
			Campo vizinho = new Campo(1,1);
			boolean resultado = campo.adicionarVizinho(vizinho);
			assertFalse(resultado);
}
	 @Test
	 void testeValorPadraoAtributoMarcado() {
		 assertFalse(campo.isMarcado());
	 }
	 @Test
	 void testeAlterarMarcacao() {
		 campo.alternarMarcacao();
		 assertTrue(campo.isMarcado());
	 }
	 @Test
	 void testeAlterarMarcacaoDuasChamadas() {
		 campo.alternarMarcacao();
		 campo.alternarMarcacao();
		 assertFalse(campo.isMarcado());
	 }
	 @Test
	 void testeAbrirNaoMinadoNaoMarcado() {
		 assertTrue(campo.abrir());
	 }
	 @Test
	 void testeAbrirMinadoMarcado() {
		 campo.alternarMarcacao();
		 campo.minar();
		 assertFalse(campo.abrir());
	 }
	 @Test
	 void testeAbrirMinadoNaoMarcado() {
		 campo.minar();
		 assertThrows(ExplosaoException.class, () -> { 
			 campo.abrir();
		 }); // esta no pacote de excecao por isso vai funcionar, é o metodo pro jogo "reiniciar" dps
		 assertFalse(campo.abrir()); // aqui abre uma explosao no campo minado a exceção
	 }
	 @Test
	 void testeAbrirComVizinhos1() {
		Campo vizinhoDoVizinho1 = new Campo(1,1);
		
		Campo vizinho1 = new Campo(2,2);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		campo.adicionarVizinho(vizinho1);
		campo.abrir();
		
		 assertTrue(vizinhoDoVizinho1.isAberto()&& vizinho1.isAberto());
		 
	 }
	 @Test
	 void testeAbrirComVizinhos2() {
		 
		Campo vizinhoDoVizinho2= new Campo(1,1);
		Campo vizinhoDoVizinho3= new Campo(1,1);
		vizinhoDoVizinho3.minar();
		
		Campo vizinho4 = new Campo(2,2);
		vizinho4.adicionarVizinho(vizinhoDoVizinho2);
		vizinho4.adicionarVizinho(vizinhoDoVizinho3);
		
		campo.adicionarVizinho(vizinho4);
		campo.abrir();
		
		 assertTrue(vizinho4.isAberto()&& vizinhoDoVizinho3.isFechado());
		 
	 }
	 

	 
}