package UI;

import MainLogic.Train;
import MainLogic.TrainFormer;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.LinkedList;

public class Controller {
    TrainFormer tf = new TrainFormer();
    public void saveFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.showSaveDialog(new Stage());
    }

    public void loadFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.showOpenDialog(new Stage());
    }

    public void form(ActionEvent event) {
        LinkedList<Train> trains= tf.formTrains();
    }
}
