package layout;


import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	public TesteStackPane() {
		
		Caixa c1 = new Caixa().conTexto("1");
		Caixa c2 = new Caixa().conTexto("2");
		Caixa c3 = new Caixa().conTexto("3");
		Caixa c4 = new Caixa().conTexto("4");
		Caixa c5 = new Caixa().conTexto("5");
		Caixa c6 = new Caixa().conTexto("6");
		
		getChildren().addAll(c2,c3,c4,c5,c6,c1); // como é pilha o ultimo adicionado será o primeiro a aparecer na tela
		 // uau, mudou mesmo a cor e os numeros, como se fosse em um app de calular, OMG
		setOnMouseClicked(e-> {
			if(e.getSceneX() > getScene().getWidth()/2){ // detecta o lado em que a pessoa clicou o mouse, nesse caso é o lado direito e com o else aparece o ESQUERDO.
				getChildren().get(0).toFront();  // se estiver no indice 5 volta para o indice 0, e manda para frente
			} else {
			    getChildren().get(5).toBack();
			}
		});
		
	 Thread t = new Thread(() ->{ 
		 while(true) {
			 
			 try {
				Thread.sleep(3000);
			
				Platform.runLater(()-> {
					getChildren().get(0).toFront();
				});
				 
			} catch (Exception e) {
			} 
			 
		 }
	 });
	 t.setDaemon(true); // se a thread principal da aplicação morrer, essa aqui também irá
	 t.start();
	         
	}

}
