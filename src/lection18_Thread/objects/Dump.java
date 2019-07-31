package lection18_Thread.objects;

import java.util.HashMap;

import static lection18_Thread.objects.Details.*;
import static lection18_Thread.objects.Util.rand;

public class Dump {
    private static HashMap<Details, Integer> dump = new HashMap<Details, Integer>() {{
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

    public Dump() {
        for (int i = 0; i < 20; i++) {
            put(rand()); //Прибавляем +1 к количеству рандомной детали
        }
    }

    public static void put(Details d) {
        dump.put(d, (dump.get(d) + 1));
    }

    public static Details get(Details d) {
        dump.put(d, (dump.get(d) - 1));
        return d;
    }
}
