package lection09_Generics;

import lection09_Generics.objects.Pair;
import lection09_Generics.objects.TwoNum;

import static lection09_Generics.objects.PairUtil.swap;

public class Test {
    public static void main(String[] args) {
        Pair <String,Integer> pair1 = new Pair <>("Hello",13);
        System.out.println(pair1);

        Pair pair2 = swap(pair1);
        System.out.println(pair2);

        TwoNum <Integer,Integer> twoNum= new TwoNum<>(15,10);
        System.out.println(twoNum.toSumUp());
        System.out.println(twoNum.toSubtract());
        System.out.println(twoNum.toMultiply());
        System.out.println(twoNum.toDivide());
    }
}
