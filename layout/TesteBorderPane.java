package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {
	
	public TesteBorderPane() { 
		Caixa c1 = new Caixa().conTexto("Topo");
		setTop(c1);
		Caixa c2 = new Caixa().conTexto("Esquerda");
		setLeft(c2);
		Caixa c3 = new Caixa().conTexto("Direita");
		setRight(c3);
		Caixa c4 = new Caixa().conTexto("Fundo");
		setBottom(c4);
		
		Caixa c5 = new Caixa().conTexto("Centro");
		setCenter(c5);
		           
	}

}
