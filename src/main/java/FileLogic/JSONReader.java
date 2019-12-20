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
import java.util.Scanner;

public class JSONReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public LinkedList<Train> readTrains(String path) throws Exceptions.WrongFileException {
        LinkedList<Train> trains = new LinkedList<Train>();

        try {
            FileInputStream fis = new FileInputStream(path);
            JsonFactory jf = new JsonFactory();
            JsonParser jp = jf.createParser(fis);
            jp.setCodec(new ObjectMapper());
            jp.nextToken();
            if(!jp.hasCurrentToken())
                throw new Exceptions.WrongFileException("Поезда тут нет!");
            while (jp.hasCurrentToken()) {
                trains.add(jp.readValueAs(Train.class));
                jp.nextToken();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trains;
    }
}
