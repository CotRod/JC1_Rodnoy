package lection18_Thread.objects;

import java.util.ArrayList;
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

    synchronized void put() {
        Details d = rand();
        dump.put(d, (dump.get(d) + 1));
    }

    synchronized Details get() {
        Details d;
        d = rand();
        if (dump.get(d) > 0) {
            dump.put(d, (dump.get(d) - 1));
            return d;
        } else {
            ArrayList<Details> details = new ArrayList<>();
            for (Map.Entry<Details, Integer> entry : dump.entrySet()) {
                if (entry.getValue() > 0) details.add(entry.getKey());
            }
            if (details.size() == 0) return null;
            Random rnd = new Random();
            d=details.get(rnd.nextInt(details.size()));
            dump.put(d, (dump.get(d) - 1));
            return d;
        }
    }
}
