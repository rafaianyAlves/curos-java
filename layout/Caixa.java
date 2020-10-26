package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {
	private static int i = 0;
	
	private String[] cores = {
			"#4682B4","#3CB371","#FFDEAD",
			"#BA55D3","#FFB6C1","#FA8072"
	};
	
	public Caixa() {
		this(100,100);
		
	}
	public Caixa(int largura, int altura) {
		setAlignment(Pos.CENTER);
		
		
		setMinHeight(largura);
		setMinWidth(altura);
		
        BackgroundFill fill = new BackgroundFill
        		(Color.web(cores[i]),CornerRadii.EMPTY,Insets.EMPTY);
		setBackground(new Background(fill));
        
        i++;
        if(i == 6) i = 0;
	}
	 public Caixa  conTexto(String texto) {
		 Label label = new Label(texto);
		 label.setFont(new Font(10));
		 getChildren().add(label);
		 return this;
	 }

		
	

}
