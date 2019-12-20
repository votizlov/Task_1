package MainLogic.Carriages;

public class EconomyClassCarrage extends TransportCarriage {
    @Override
    public String getString() {
        return "-EconomyClassCarriage-";
    }

    public EconomyClassCarrage(){
        super();
        setMaxCargoAmount(50);
        setName("-EconomyClassCarriage-");
    }
}
