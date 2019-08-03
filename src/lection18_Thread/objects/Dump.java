package lection18_Thread.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static lection18_Thread.objects.Details.*;
import static lection18_Thread.objects.Util.rand;

public class Dump {
    private HashMap<Details, Integer> dump = new HashMap<Details, Integer>() {{
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
    private Random rnd = new Random();

    public Dump() {
        put("First Night");
    }

    synchronized void put() {
        int randomNum = fromOneToFour();
        for (int j = 0; j < randomNum; j++) {
            Details d = rand();
            dump.put(d, (dump.get(d) + 1));
        }
    }

    synchronized ArrayList<Details> get() {

        ArrayList<Details> gettingDetails = new ArrayList<>();
        Details d;
        int randomNum = fromOneToFour();
        for (int i = 0; i < randomNum; i++) {
            ArrayList<Details> avaialbleDetails = new ArrayList<>();
            for (Map.Entry<Details, Integer> entry : dump.entrySet()) {
                if (entry.getValue() > 0) avaialbleDetails.add(entry.getKey());
            }
            if (avaialbleDetails.size() == 0) break;
            d = avaialbleDetails.get(rnd.nextInt(avaialbleDetails.size()));
            dump.put(d, (dump.get(d) - 1));
            gettingDetails.add(d);
        }
        return gettingDetails;
    }

    private int fromOneToFour() {
        return rnd.nextInt(4) + 1;
    }

    private void put(String s) {
        for (int i = 0; i < 20; i++) {
            Details d = rand();
            dump.put(d, (dump.get(d) + 1));
        }
    }
}
