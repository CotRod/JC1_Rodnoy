package lection16_Serialization.objects;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    private Touchpad tchpad;
    private transient int laptopTime;

    public Notebook(String userName, double ram, int systemType,String model,int amount, int laptopTime) {
        super(userName, ram, systemType);
        tchpad = new Touchpad(model,amount);
        this.laptopTime = laptopTime;
    }

    public String toString(){
        return super.toString()+"\n"+tchpad+"\nTime: "+laptopTime;
    }
}
