package lection18_Thread.objects;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
            put();
        }
    }

    public void put() {
        Random rnd = new Random();
        Details d;
        for (int j = 0; j < (rnd.nextInt(3) + 1); j++) {
            d = rand();
            dump.put(d, (dump.get(d) + 1));
        }
    }

    public Details get() {
        Details d;
        d = rand();
        if (dump.get(d)>0) {
            dump.put(d, (dump.get(d) - 1));
            return d;
        }else{
            for (Map.Entry<Details,Integer> entry:dump.entrySet()) {
                if (entry.getValue()>0)return entry.getKey();
            }
        }
        return null;
    }
}