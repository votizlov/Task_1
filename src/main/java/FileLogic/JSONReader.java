package FileLogic;

import MainLogic.Train;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JSONReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public ArrayList<Train> readTrains(String path) throws Exceptions.WrongFileException {
        ArrayList<Train> trains = new ArrayList<Train>();
        try {
            trains = objectMapper.readValue(new File(path),trains.getClass());
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exceptions.WrongFileException("Поезда тут нет!!!");
        }
        return trains;
    }
}
