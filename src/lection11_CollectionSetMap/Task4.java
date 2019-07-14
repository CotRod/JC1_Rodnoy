package lection11_CollectionSetMap;

import lection11_CollectionSetMap.objects.BlackBox;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            blackBox.addNum(rand.nextInt(100)-50);
        }
        System.out.println("Min = "+ blackBox.getMin()+"\nMax = "+blackBox.getMax());
    }

}
