package lection11_CollectionSetMap.objects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BlackBox {
    private List<Integer> bb = new LinkedList<>();

    public void addNum(int i) {
        bb.add(i);
    }

    public int getMin() {
        return Collections.min(bb);
    }

    public int getMax() {
        return Collections.max(bb);
    }
}
