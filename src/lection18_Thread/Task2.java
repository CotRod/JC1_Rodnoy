package lection18_Thread;

import lection18_Thread.objects.Dump;
import lection18_Thread.objects.Factory;
import lection18_Thread.objects.MadScientist;
import lection18_Thread.objects.Servant;


public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        Dump dump = new Dump();
        MadScientist madScientist = new MadScientist();
        Factory factory = new Factory(dump);
        Servant servant = new Servant(dump, madScientist);
        factory.start();
        servant.start();
        servant.join();
        factory.join();

        System.out.println("Amount of robots : " + madScientist.amountOfRobots());
    }
}
