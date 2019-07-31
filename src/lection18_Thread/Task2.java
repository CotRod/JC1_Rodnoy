package lection18_Thread;

import lection18_Thread.objects.Dump;
import lection18_Thread.objects.Factory;
import lection18_Thread.objects.MadScientist;
import lection18_Thread.objects.Servant;


public class Task2 {

    public static void main(String[] args) {
        Dump dump = new Dump();
        Factory factory = new Factory();
        Servant servant = new Servant();
        factory.start();
        servant.start();
        try {
            servant.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int amountOfRobots = 0;
        while (MadScientist.checkRobot()) {
            amountOfRobots++;
        }
        System.out.println("Amount of robots : " + amountOfRobots);
    }
}
