package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuGUI extends Application {

	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Story1.fxml"));
		Scene scene = new Scene(root,800,500);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String [] args) throws Exception {
		launch(args);
	}
}
