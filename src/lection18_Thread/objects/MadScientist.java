package lection18_Thread.objects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

    void putDetail(Details det) {
        scDet.put(det, (scDet.get(det) + 1));
    }

    public int amountOfRobots() {
        if (hasEnoughDetailsForRobot()) {
            int robots = 999;
            for (Map.Entry<Details, Integer> entry : scDet.entrySet()) {
                if (entry.getValue() < robots) {
                    robots = entry.getValue();
                }
            }
            for (Map.Entry<Details, Integer> entry : scDet.entrySet()) {
                entry.setValue(entry.getValue() - robots);
            }
            return robots;
        } else return 0;
    }

    private boolean hasEnoughDetailsForRobot() {
        return scDet.get(HEAD) > 0 && scDet.get(BODY) > 0 && scDet.get(LEFT_HAND) > 0 && scDet.get(RIGHT_HAND) > 0 && scDet.get(LEFT_LEG) > 0 && scDet.get(RIGHT_LEG) > 0 && scDet.get(CPU) > 0 && scDet.get(RAM) > 0 && scDet.get(HDD) > 0;
    }
}
