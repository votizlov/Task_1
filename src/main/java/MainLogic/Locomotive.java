package MainLogic;

public class Locomotive {
    private int watt;
    private LocoType type;

    public Locomotive(int watt, LocoType type) {
        this.watt = watt;
        this.type = type;
    }

    public int getWatt() {
        return watt;
    }

    public LocoType getType() {
        return type;
    }
}
