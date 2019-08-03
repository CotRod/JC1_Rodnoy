package lection18_Thread.objects;

import java.util.ArrayList;

public class Servant extends Thread {
    private MadScientist madScientist;
    private Dump dump;

    public Servant(Dump dump, MadScientist madScientist) {
        this.dump = dump;
        this.madScientist = madScientist;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {

            ArrayList<Details> detail = dump.get();
            if (detail.size() != 0) {
                for (Details details : detail) {
                    madScientist.putDetail(details);
                }
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
