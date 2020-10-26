package layout;

//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.control.Label;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {
private static int i = 0;
	
	private String[] cores = {
			"#4682B4","#3CB371","#FFDEAD",
			"#BA55D3","#FFB6C1","#FA8072"
	};
	
public Quadrado() {
		this(100);
		
	}
	public Quadrado(int tamanho) {
	
		setHeight(tamanho);
		setWidth(tamanho);
		
       setFill(Color.web(cores[i]));
        
        i++;
        if(i == 6) i = 0;
	}
	
}
