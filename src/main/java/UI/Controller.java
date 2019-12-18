package UI;

import FileLogic.Exceptions;
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

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Controller {
    public TextArea outputArea;
    public TextField passNum;
    public CheckBox check;
    public CheckBox check2;
    public TextField cargoM;
    private TrainFormer tf = new TrainFormer();
    private JSONReader reader = new JSONReader();
    private JSONWriter writer = new JSONWriter();
    private LinkedList<Train> trains;


    public void saveFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        try {
            writer.writeTrains(fc.showSaveDialog(new Stage()).getAbsolutePath(),trains);
        } catch (Exceptions.WrongFileException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
        }
    }

    public void loadFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        try {
            reader.readTrains(fc.showOpenDialog(new Stage()).getAbsolutePath());
        } catch (Exceptions.WrongFileException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
        }
    }

    public void form(ActionEvent event) {
        trains= tf.formTrains(
                Integer.parseInt(passNum.getText()),
                Integer.parseInt(cargoM.getText()),
                check.isSelected(),
                check2.isSelected());
    }
}
