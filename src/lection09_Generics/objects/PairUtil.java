package lection09_Generics.objects;

public final class PairUtil {
    public static <T extends Pair> Pair swap(T obj) {

        return new Pair<>(obj.getObj2(), obj.getObj1());
    }
}
