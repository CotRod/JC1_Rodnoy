package lection18_Thread.objects;

import java.util.Random;

import static lection18_Thread.objects.Details.*;

public class Util {
    public static Details rand() {
        Random rnd = new Random();
        switch (rnd.nextInt(9)) {
            case 0:
                return HEAD;
            case 1:
                return BODY;
            case 2:
                return LEFT_HAND;
            case 3:
                return RIGHT_HAND;
            case 4:
                return LEFT_LEG;
            case 5:
                return RIGHT_LEG;
            case 6:
                return CPU;
            case 7:
                return RAM;
            default:
                return HDD;
        }
    }
}
