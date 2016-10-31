import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ChoiceDialog;
import java.awt.List;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class UserLoop extends Application{
	@Override
	public void start(Stage primaryStage) {
	
	TextInputDialog inputUser = new TextInputDialog();
	inputUser.setHeaderText("Enter username");
	TextInputDialog inputPass = new TextInputDialog();
	inputPass.setHeaderText("Enter password");
	int counter = 3;

	do {
	Alert instructions = new Alert(AlertType.INFORMATION);
	instructions.setTitle("Login account");
	instructions.setContentText("Enter your username and password to login your account");
	instructions.showAndWait();
	Optional<String> result = inputUser.showAndWait();
	String username = result.get();
	counter--;

	if (username.equals("natasya")) {
	Optional<String> resultPass = inputPass.showAndWait();
	String password = resultPass.get();
			 
		if (password.equals("papaya")) {
		ArrayList<String> choices = new ArrayList<String>();				choices.add("Staff");
	     	choices.add("Administrartor");
	       	choices.add("Faculty");
	        choices.add("Student");
	        choices.add("Guest");
	        ChoiceDialog<String> dialog = new ChoiceDialog<String>("Staff",choices);
	        dialog.setTitle("Pick an account type");
	        Optional<String>input = dialog.showAndWait();
	       	String value = input.get();
	       			
	       		if (value.equals("Student")) {
	       		Alert login = new Alert(AlertType.INFORMATION);
	       		login.setContentText("Welcome Natasya!");
	       		login.showAndWait();
			break;

	       		} else {
	       		Alert failedacc = new Alert(AlertType.INFORMATION);
	       		failedacc.setContentText("Wrong account");					failedacc.showAndWait();
	       	}
		} else {
		Alert failedpass = new Alert(AlertType.INFORMATION);
		failedpass.setContentText("Invalid password");
		failedpass.showAndWait();
		}
	} else {
	Alert faileduser = new Alert(AlertType.INFORMATION);
	faileduser.setContentText("Invalid username");
	faileduser.showAndWait();
		}
		
	}
	while (counter>0); {
	if (counter<=0) {
	Alert limit = new Alert(AlertType.INFORMATION);
	limit.setContentText("Contact Administration");
	limit.showAndWait(); }
	}
	}		
}

