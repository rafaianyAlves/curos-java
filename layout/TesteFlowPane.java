package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane{
	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
	
		
		
		
		setHgap(10); // distancia um do outro na horizontal
		setVgap(10); // distancia um do outro na vertical
		setPadding(new Insets(10)); // espaçamento interno, aqui 10px em todas as direções
		
		setOrientation(Orientation.VERTICAL); // a orientação muda na vertical
		setAlignment(Pos.CENTER_RIGHT); // centraliza no lado direito
		
		getChildren().addAll(q1,q2,q3,q4,q5);
		
	}

}
