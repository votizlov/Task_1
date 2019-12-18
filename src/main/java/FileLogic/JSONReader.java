package FileLogic;

import MainLogic.Train;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class JSONReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public LinkedList<Train> readTrains(String path) throws Exceptions.WrongFileException {
        LinkedList<Train> trains = new LinkedList<Train>();
        try {
            trains = objectMapper.readValue(new File(path),trains.getClass());
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exceptions.WrongFileException("Поезда тут нет!!!");
        }
        return trains;
    }
}
