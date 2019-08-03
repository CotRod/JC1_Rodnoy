package lection18_Thread.objects;


import java.util.concurrent.Semaphore;

public class Factory extends Thread {
    private Dump dump;
    private Semaphore semaphore;

    public Factory(Semaphore semaphore, Dump dump) {
        this.semaphore = semaphore;
        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dump.put();
            semaphore.release();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
