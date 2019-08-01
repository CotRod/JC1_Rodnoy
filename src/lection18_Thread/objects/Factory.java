package lection18_Thread.objects;


import java.util.Random;

public class Factory extends Thread {
    private Dump dump;

    public Factory(Dump dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Random rnd = new Random();
            for (int j = 0; j < (rnd.nextInt(3) + 1); j++) {
                dump.put();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
