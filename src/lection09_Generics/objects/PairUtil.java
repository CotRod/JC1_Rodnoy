package lection09_Generics.objects;

public final class PairUtil {
    public static <T,V> Pair swap(Pair <T,V> ob){
        return new Pair<>(ob.getObj2(),ob.getObj1());
    }
}
