package FileLogic;

import MainLogic.Train;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

public class JSONWriter {
    ObjectMapper mapper = new ObjectMapper();
    public void writeTrains(String path, LinkedList<Train> trains) throws Exceptions.WrongFileException {
        for (Train t:trains
             ) {
            try {
                mapper.writeValue(new File(path),t);
            } catch (IOException e) {
                e.printStackTrace();
                throw new Exceptions.WrongFileException("Неправильный путь");
            }
        }
    }
}
