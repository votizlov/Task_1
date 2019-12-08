package UI;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controller {
    public void saveFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.showSaveDialog(new Stage());
    }

    public void loadFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.showOpenDialog(new Stage());
    }
}
