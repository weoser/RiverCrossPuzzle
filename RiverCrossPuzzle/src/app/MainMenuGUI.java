package app;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainMenuGUI extends Application {

	public void start(Stage primaryStage) throws Exception {
		Farmer fam = new Farmer();
		Carnivore mon = new Carnivore();
		Herbivore sheep = new Herbivore();
		Stage stage = new Stage();
		ImageView imv = new ImageView();
		ImageView imv2 = new ImageView();
		ImageView imv3 = new ImageView();
		Image image = SwingFXUtils.toFXImage(fam.getImages()[0], null);
		Image image3 = SwingFXUtils.toFXImage(mon.getImages()[0], null);
		Image image2 = SwingFXUtils.toFXImage(sheep.getImages()[0], null);
		imv.setImage(image);
		imv2.setImage(image2);
		imv3.setImage(image3);
		BorderPane pane = new BorderPane();
		pane.setCenter(imv);
		pane.setLeft(imv2);
		pane.setBottom(imv3);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String [] args) throws Exception {
		launch(args);
	}
}
