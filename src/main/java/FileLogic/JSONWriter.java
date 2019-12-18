package FileLogic;

import MainLogic.Train;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class JSONWriter {
    ObjectMapper mapper = new ObjectMapper();
    public void writeTrains(String path, LinkedList<Train> trains) throws Exceptions.WrongFileException {
        try {
            mapper.writeValue(new File(path),trains);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exceptions.WrongFileException("Неправильный путь");
        }
    }
}
