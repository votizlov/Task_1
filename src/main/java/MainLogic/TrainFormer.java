package MainLogic;

import java.util.LinkedList;

public class TrainFormer {
    final int MAX_L = 3;
    public LinkedList<Train> formTrains(int passN,double cargoM,boolean longRange,boolean isElectrified){
        LinkedList<Train> trains = new LinkedList<Train>();
        LocoType usedType = isElectrified?LocoType.ELECTRIC:LocoType.DIESEL;
        int locoPWR = 500;
        Train tP = new Train(TrainType.PASSENGER);
        Train tC = new Train(TrainType.CARGO);

            while(passN!=0) {
                if(tP.getAvailableCargo()==0) {
                    trains.add(tP);
                    for (int i = 0; i < MAX_L; i++) {
                        tP.addLocomotive(new Locomotive(locoPWR,usedType));
                    }
                    tP = new Train(TrainType.PASSENGER);
                }

            }
            while(cargoM!=0) {
                if(tC.getAvailableCargo()==0) {
                    trains.add(tC);
                    for (int i = 0; i < MAX_L; i++) {
                        tC.addLocomotive(new Locomotive(locoPWR,usedType));
                    }
                    tC = new Train(TrainType.CARGO);
                }
            }


        return trains;
    }
}
