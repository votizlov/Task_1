package MainLogic.Carriages;

public class EconomyClassCarrage extends TransportCarriage {
    private int maxHumans = 50;

    int getCargoAmount() {
        return maxHumans;
    }
}
