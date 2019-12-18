package MainLogic;

import java.util.LinkedList;

public class Train {
    private LinkedList<Carriage> carriages;
    private LinkedList<Locomotive> locomotives;
    private TrainType type;

    public Train(TrainType type) {
        this.type = type;
    }

    public Train(double cargoM, boolean longRange, boolean isElectrified) {

    }

    public Train(int passN, boolean harsh) {
    }

    public Train(double cargoM, boolean longRange) {
    }

    public void addCarriage(Carriage c){
        carriages.addLast(c);
    }
    public void addLocomotive(Locomotive l){
        locomotives.add(l);
    }

    public int getAvailableCargo() {
        return 0;
    }
}
