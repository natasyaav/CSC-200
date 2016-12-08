import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Array extends Application {
	public static void main(String[] args) {
		launch(args);	
	}
	@Override
	public void start(Stage primaryStage) {
		VBox vbox = new VBox();
		Scene scene = new Scene(vbox);
		String[] List = new String[10];
		TextField[] text = new TextField[10];
		Button button = new Button("Submit");
		for(int i=0; i<text.length; i++) {
			text[i] = new TextField();
			vbox.getChildren().add(text[i]);
		}
		vbox.getChildren().add(button);
		button.setOnAction(e-> {
			System.out.println("Before sort:");
			for(int i=0; i<text.length; i++) {
				List[i] = text[i].getText();
				System.out.println(List[i]);
			}
			SortArray.sort(List);
			System.out.println("After sort:");
			for(int i=0; i<text.length; i++){
			System.out.println(List[i]);
			}
		});
		primaryStage.setScene(scene);
		primaryStage.show();
			}
}
