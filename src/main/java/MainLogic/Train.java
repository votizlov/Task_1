package MainLogic;

import MainLogic.Carriages.TransportCarriage;
import MainLogic.Carriages.UtilCarriage;

import java.util.LinkedList;

public class Train {
    private LinkedList<TransportCarriage> carriages;
    private LinkedList<UtilCarriage> utilCarriages;
    private LinkedList<Locomotive> locomotives;
    private TrainType type;

    public Train(TrainType type) {
        carriages = new LinkedList<TransportCarriage>();
        locomotives = new LinkedList<Locomotive>();
        this.type = type;
    }

    public Train(double cargoM, boolean longRange, boolean isElectrified) {

    }

    public Train() {
    }

    public Train(double cargoM, boolean longRange) {
    }

    public void addCarriage(TransportCarriage c){
        carriages.addLast(c);
    }
    public void addLocomotive(Locomotive l){
        locomotives.add(l);
    }
    public LinkedList<Locomotive> getLocomotives(){return locomotives;}

    public LinkedList<TransportCarriage> getCarriages() {
        return carriages;
    }

    public int getAvailableCargo() {
        int w = 0;
        for (Locomotive l:locomotives
             ) {
            w+=l.getWatt();
        }
        int m = 0;
        for (TransportCarriage c:carriages
        ){
            m+=c.getCurrentCargo();
        }
        return w-m;
    }
}
