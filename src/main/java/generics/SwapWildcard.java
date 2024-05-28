package generics;

import java.util.Collections;
import java.util.List;

public class SwapWildcard {

    public static void swapElemInList(List<?> collection, int index1, int index2) throws Exception {
        if (index1 >= 0 && index1 < collection.size() && index2 >= 0 && index2 < collection.size()) {
            Collections.swap(collection, index1, index2);
        } else {
            throw new Exception("Index out of range");
        }

    }
}
