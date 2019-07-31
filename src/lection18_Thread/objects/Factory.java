package lection18_Thread.objects;

import java.util.Random;

import static lection18_Thread.objects.Util.rand;

public class Factory extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            Random rnd = new Random();
            for (int j = 0; j < (rnd.nextInt(3) + 1); j++) {
                Dump.put(rand());
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
