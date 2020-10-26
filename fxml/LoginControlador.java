package fxml;

import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
public class LoginControlador {
	
	@FXML
	private TextField emailField;
	
	@FXML 
	private PasswordField senhaField;
	
	public void entrar() {
		boolean emailValido = emailField.getText().equals("rafa.alves@itgcon.com.br");
		boolean senhaValida = senhaField.getText().equals("katyperry69");
				
		if(emailValido && senhaValida) {
			System.out.println("Sucesso");
		} else {
			System.out.println("falha");
		}
				
		
	}
	

}
