package lection18_Thread.objects;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Servant extends Thread {
    private MadScientist madScientist;
    private Dump dump;
    private Semaphore semaphore;

    public Servant(Semaphore semaphore, Dump dump, MadScientist madScientist) {
        this.semaphore = semaphore;
        this.dump = dump;
        this.madScientist = madScientist;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ArrayList<Details> detail = dump.get();
            if (detail.size() != 0) {
                for (Details details : detail) {
                    madScientist.putDetail(details);
                }
            }
            semaphore.release();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
