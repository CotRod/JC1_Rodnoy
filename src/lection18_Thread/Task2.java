package lection18_Thread;

import lection18_Thread.objects.Dump;
import lection18_Thread.objects.Factory;
import lection18_Thread.objects.MadScientist;
import lection18_Thread.objects.Servant;

import java.util.concurrent.Semaphore;


public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        Dump dump = new Dump();
        MadScientist madScientist = new MadScientist();
        Semaphore semaphore = new Semaphore(1);
        Factory factory = new Factory(semaphore, dump);
        Servant servant = new Servant(semaphore, dump, madScientist);
        factory.start();
        servant.start();
        servant.join();
        factory.join();

        System.out.println("Amount of robots : " + madScientist.amountOfRobots());
    }
}
