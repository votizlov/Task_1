package MainLogic;

import MainLogic.Carriages.EconomyClassCarrage;
import MainLogic.Carriages.SimpleCargoCarriage;
import com.fasterxml.jackson.annotation.*;

public class Locomotive implements Drawable {//todo Jackson не может десереализовать данный объект из файла, несмотря на то, что этот класс не является абстрактным?!?!?!??1!7?71871891
    private int watt;
    private LocoType type;
    private String name;

    public Locomotive(int watt, LocoType type) {
        this.watt = watt;
        this.type = type;
        this.name = type.name();
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public void setType(LocoType type) {
        this.type = type;
    }

    public LocoType getType() {
        return type;
    }

    @Override
    public String getString() {
        return type.toString()+"-";
    }
}
