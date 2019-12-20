package MainLogic.Carriages;

import MainLogic.Carriage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SimpleCargoCarriage.class, name = "-SimpleCargo-"),

        @JsonSubTypes.Type(value = EconomyClassCarrage.class, name = "-EconomyClassCarriage-") }
)
public abstract class TransportCarriage implements Carriage {
    public int getCurrentCargo() {
        return currentCargo;
    }

    int currentCargo = 0;
    int maxCargoAmount;
    public int getMaxCargoAmount(){
        return maxCargoAmount;
    }
    public void fill(int i){
        if(currentCargo+i<=getMaxCargoAmount())
            currentCargo+=i;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxCargoAmount(int i) {
        maxCargoAmount = i;
    }
}
