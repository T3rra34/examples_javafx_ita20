package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class Controller {
    @FXML
    private  Button button;
    @FXML
    private void click(ActionEvent event) {
        button.setText("You've clicked");
    }
}