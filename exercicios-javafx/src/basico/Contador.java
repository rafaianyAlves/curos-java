package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;
	private void atualizarlabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		} else if(contador <0) {
			label.getStyleClass().add("vermelho");
		}
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("fonte");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.getStyleClass().add("botoes:houver");
		botaoDecremento.setOnAction(e ->{
			contador--;
			atualizarlabelNumero(labelNumero);
			labelNumero.setText(Integer.toString(contador));
		});
		
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.getStyleClass().add("botoes:houver");
		botaoIncremento.setOnAction(e ->{
			contador++;
			atualizarlabelNumero(labelNumero);
			labelNumero.setText(Integer.toString(contador));
			
		});
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		
		
		
		VBox boxPrincipalConteudo = new VBox();
		
		boxPrincipalConteudo.getStyleClass().add("conteudo");
		boxPrincipalConteudo.setSpacing(10);
		boxPrincipalConteudo.setAlignment(Pos.CENTER);
		boxPrincipalConteudo.getChildren().add(labelTitulo);
		boxPrincipalConteudo.getChildren().add(labelNumero);
		boxPrincipalConteudo.getChildren().add(boxBotoes);
		
		String caminhoCss = getClass()
				.getResource("/basico/Contador.css")
				.toExternalForm();
		Scene cena = new Scene(boxPrincipalConteudo, 300,300);
		cena.getStylesheets().add(caminhoCss);
		cena.getStylesheets()
		.add("https://fonts.googleapis.com/css2?family=Viga");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}

}
