package MainLogic.Carriages;

import MainLogic.Carriage;

public abstract class TransportCarriage implements Carriage {
    int currentCargo = 0;
    abstract int getMaxCargoAmount();
    public void fill(int i){
        if(currentCargo+i<=getMaxCargoAmount())
            currentCargo+=i;
    }
}
