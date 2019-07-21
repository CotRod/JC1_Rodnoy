package lection16_Serialization.objects;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private String model;
    private int amountOfButtons;

    public Touchpad(String model, int amountOfButtons) {
        this.model = model;
        this.amountOfButtons = amountOfButtons;
    }

    @Override
    public String toString(){
        return "Model: "+model+"\nAmount of buttons: "+amountOfButtons;
    }
}
