package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane{
	
	public TesteGridPane() {
		Caixa c1 = new Caixa();
		Caixa c2 = new Caixa();
		Caixa c3 = new Caixa();
		Caixa c4 = new Caixa();
	
		
		setGridLinesVisible(true);
		
		getColumnConstraints().addAll(cc(), cc(), cc(), cc());
		getRowConstraints().addAll(rc(),rc(),rc(),rc());
		
		setVgap(10); // mostra a separação no painel
		setHgap(10);
		
		add(c1, 0, 0);
		add(c2, 1, 2);
		add(c3, 2, 3);
		add(c4, 3, 1);
		
		
		
		
		
	}
	private ColumnConstraints cc() { // construção das colunas
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(40);
		cc.setFillWidth(true);
		return cc;
	}
	
	private RowConstraints rc() { // construção das linhas
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(40);
		rc.setFillHeight(true);
		return rc;
	}

}
