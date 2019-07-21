package lection16_Serialization.objects;

import java.io.Serializable;

public class Computer implements Serializable {
    //    private static final double version = 1.2;
    private String userName;
    private double ram;
    private int systemType;

    public Computer(String userName, double ram, int systemType) {
        this.userName = userName;
        this.ram = ram;
        this.systemType = systemType;
    }

    @Override
    public String toString() {
        return "User Name: " + userName + "\nRAM: " + ram + "\nSystem type: " + systemType;
    }
}
