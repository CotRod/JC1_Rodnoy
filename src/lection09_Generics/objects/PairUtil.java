package lection09_Generics.objects;

public final class PairUtil {
    public static <T,V> Pair swap(Pair <T,V> ob){
        Pair <V,T> pairCopy = new Pair<>(ob.getObj2(),ob.getObj1());
        return pairCopy;
    }
}
