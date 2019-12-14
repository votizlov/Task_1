package UI;

import FileLogic.JSONReader;
import FileLogic.JSONWriter;
import MainLogic.Train;
import MainLogic.TrainFormer;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Controller {
    public TextArea outputArea;
    public TextField passNum;
    public CheckBox check;
    public TextField cargoM;
    private TrainFormer tf = new TrainFormer();
    private JSONReader reader = new JSONReader();
    private JSONWriter writer = new JSONWriter();
    private LinkedList<Train> trains;


    public void saveFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        writer.writeTrains(fc.showSaveDialog(new Stage()).getAbsolutePath(),trains);
    }

    public void loadFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        try {
            reader.readTrains(fc.showOpenDialog(new Stage()).getAbsolutePath());
        } catch (NullPointerException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("пизда");
        }
    }

    public void form(ActionEvent event) {
        trains= tf.formTrains(
                Integer.parseInt(passNum.getText()),
                Integer.parseInt(cargoM.getText()),
                check.isSelected());
    }
}
