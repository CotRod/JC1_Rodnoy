package lection18_Thread.objects;


public class Factory extends Thread {
    private Dump dump;

    public Factory(Dump dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            dump.put();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
