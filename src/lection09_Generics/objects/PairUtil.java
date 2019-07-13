package lection09_Generics.objects;

public final class PairUtil {
    public static <T,V> Pair <V,T>swap(Pair <T,V> ob){
        Pair<V,T> copyPair = new Pair<>(ob.getObj2(),ob.getObj1());
        return copyPair;
    }
}
