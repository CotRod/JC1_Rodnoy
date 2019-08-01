package lection19_ThreadSynch;

import lection18_Thread.objects.Dump;
import lection18_Thread.objects.Factory;
import lection18_Thread.objects.MadScientist;
import lection18_Thread.objects.Servant;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Dump dump = new Dump();
        MadScientist mSci1 = new MadScientist();
        MadScientist mSci2 = new MadScientist();
        Factory factoryThread = new Factory(dump);
        Servant servant1 = new Servant(dump, mSci1);
        Servant servant2 = new Servant(dump, mSci2);
        factoryThread.start();
        servant1.start();
        servant2.start();

        factoryThread.join();
        servant1.join();
        servant2.join();
        System.out.println("First Scientist - Amount of robots: " + mSci1.amountOfRobots());
        System.out.println("Second Scientist - Amount of robots: " + mSci2.amountOfRobots());
    }
}
