package MainLogic.Carriages;

public class SimpleCargoCarriage extends TransportCarriage {

    public int getMaxCargoAmount() {
        return maxCargoAmount;
    }

    @Override
    public String getString() {
        return "-SimpleCargo-";
    }

    public SimpleCargoCarriage(){
        super();
        setMaxCargoAmount(40);
        setName("-SimpleCargo-");
    }

}
