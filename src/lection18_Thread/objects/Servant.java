package lection18_Thread.objects;

import java.util.Random;

import static lection18_Thread.objects.Util.rand;

public class Servant extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 50; j++) {
            Random rnd = new Random();
            for (int i = 0; i < (rnd.nextInt(3) + 1); i++) {
                Details det = Dump.get(rand());
                MadScientist.get(det);
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
