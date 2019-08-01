package lection18_Thread.objects;

import java.util.Random;

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
            Random rnd = new Random();
            for (int i = 0; i < (rnd.nextInt(3) + 1); i++) {
                Details detail = dump.get();
                if (detail == null) break;
                madScientist.putDetail(detail);
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
