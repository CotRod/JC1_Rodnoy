package lection18_Thread.objects;

import java.util.HashMap;

import static lection18_Thread.objects.Details.*;

public class MadScientist {
    private static HashMap<Details, Integer> scDet = new HashMap<Details, Integer>() {{
        put(HEAD, 0);
        put(BODY, 0);
        put(LEFT_HAND, 0);
        put(RIGHT_HAND, 0);
        put(LEFT_LEG, 0);
        put(RIGHT_LEG, 0);
        put(CPU, 0);
        put(RAM, 0);
        put(HDD, 0);
    }};

    static void get(Details det) {
        scDet.put(det, (scDet.get(det) + 1));
    }

    public static boolean checkRobot() {
        if (scDet.get(HEAD) > 0 && scDet.get(BODY) > 0 && scDet.get(LEFT_HAND) > 0 && scDet.get(RIGHT_HAND) > 0 && scDet.get(LEFT_LEG) > 0 && scDet.get(RIGHT_LEG) > 0 && scDet.get(CPU) > 0 && scDet.get(RAM) > 0 && scDet.get(HDD) > 0) {
            scDet.put(HEAD, (scDet.get(HEAD) - 1));
            scDet.put(BODY, (scDet.get(BODY) - 1));
            scDet.put(LEFT_HAND, (scDet.get(LEFT_HAND) - 1));
            scDet.put(RIGHT_HAND, (scDet.get(RIGHT_HAND) - 1));
            scDet.put(LEFT_LEG, (scDet.get(LEFT_LEG) - 1));
            scDet.put(RIGHT_LEG, (scDet.get(RIGHT_LEG) - 1));
            scDet.put(CPU, (scDet.get(CPU) - 1));
            scDet.put(RAM, (scDet.get(RAM) - 1));
            scDet.put(HDD, (scDet.get(HDD) - 1));
            return true;
        } else return false;
    }
}
