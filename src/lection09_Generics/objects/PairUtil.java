package lection09_Generics.objects;

public final class PairUtil {
    public static Pair swap(Pair ob){
        Pair <?,?> pairCopy = new Pair<>(ob.getObj2(),ob.getObj1());
        return pairCopy;
    }
}
