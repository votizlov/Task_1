package MainLogic;

import MainLogic.Carriages.EconomyClassCarrage;
import MainLogic.Carriages.SimpleCargoCarriage;

import java.util.LinkedList;

public class TrainFormer {
    final int MAX_L = 3;
    public LinkedList<Train> formTrains(int passN,double cargoM,boolean longRange,boolean isElectrified){
        LinkedList<Train> trains = new LinkedList<Train>();
        LocoType usedType = isElectrified?LocoType.ELECTRIC:LocoType.DIESEL;
        int locoPWR = 100;
        Train tP = new Train(TrainType.PASSENGER);
        Train tC = new Train(TrainType.CARGO);
            while(passN!=0) {
                if(tP.getAvailableCargo()==0) {
                    if (tP.getLocomotives().size()<3) {
                            tP.addLocomotive(new Locomotive(locoPWR, usedType));
                    } else {
                        trains.add(tP);
                        tP = new Train(TrainType.PASSENGER);
                    }
                }
                EconomyClassCarrage c = new EconomyClassCarrage();
                c.fill(Math.min(passN, c.getMaxCargoAmount()));
                passN-=Math.min(passN, c.getMaxCargoAmount());
                tP.addCarriage(c);
            }
            if(!trains.contains(tP))
                trains.addLast(tP);
            while(cargoM!=0) {
                if(tC.getAvailableCargo()==0) {
                    if (tC.getLocomotives().size()<3) {
                        tC.addLocomotive(new Locomotive(locoPWR, usedType));
                    } else {
                        trains.add(tC);
                        tC = new Train(TrainType.CARGO);
                    }
                }
                SimpleCargoCarriage c = new SimpleCargoCarriage();
                c.fill((int) Math.min(cargoM, c.getMaxCargoAmount()));
                cargoM-=Math.min(cargoM, c.getMaxCargoAmount());
                tC.addCarriage(c);
            }
        if(!trains.contains(tC))
            trains.addLast(tC);

        return trains;
    }
}
