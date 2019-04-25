package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuGUI extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		Scene scene = new Scene(root,800,500);
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String [] args) {
		launch(args);
	}
}
