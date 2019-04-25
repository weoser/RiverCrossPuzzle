package app;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainMenuController implements Initializable {

	public ImageView imageView;
	public Button exit;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Image image = new Image(new File("mainMenuImage.png").toURI().toString());
				imageView.setImage(image);
			}
	public void Exit(ActionEvent event) {
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.close();
		}
}