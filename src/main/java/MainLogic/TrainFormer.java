package MainLogic;

import java.util.LinkedList;

public class TrainFormer {
    public LinkedList<Train> formTrains(int passN,double cargoM,boolean longRange,boolean isElectrified){
        LinkedList<Train> trains = new LinkedList<Train>();

        while (passN!=0 || cargoM!=0){
            if(passN!=0)
                trains.add(new Train(passN,longRange,isElectrified));
            if(cargoM!=0)
                trains.add(new Train(cargoM,longRange));
        }

        return trains;
    }
}
