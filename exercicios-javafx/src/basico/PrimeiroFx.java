package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {

		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		
		botaoA.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0)); // FECHA A APLIACA��O OMGGG
		
		VBox box = new VBox(); // organiza os elementos na vertical
		
		
		box.setAlignment(Pos.TOP_CENTER); // meio da tela os bot�es
		box.setSpacing(10); // espa�amento entre eles
		box.getChildren().add(botaoA);		
		box.getChildren().add(botaoB);	
		box.getChildren().add(botaoC);	
		
		Scene cena = new Scene(box,100,100);
		
		primaryStage.setScene(cena);
		primaryStage.show();
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
