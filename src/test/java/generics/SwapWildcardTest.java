package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static generics.SwapWildcard.swapElemInList;


public class SwapWildcardTest {

    @Test
    void testingSwapElemInList() throws Exception {
        List<Integer> listInt = new ArrayList<>(Arrays.asList(1, 3, 5));
        swapElemInList(listInt, 1, 2);
        assertEquals(listInt.get(1), 5);
        assertEquals(listInt.get(2), 3);

        List<Boolean> listBool = new ArrayList<>(Arrays.asList(true, false, false));
        swapElemInList(listBool, 0, 1);
        assertEquals(listBool.get(0), false);
        assertEquals(listBool.get(1), true);

        List<Object> listObj = new ArrayList<>(Arrays.asList(true, 4, 4.5));
        swapElemInList(listObj, 0, 2);
        assertEquals(listObj.get(0), 4.5);
        assertEquals(listObj.get(2), true);

        Assertions.assertThrows(Exception.class, () -> {
            swapElemInList(listInt, -1, 5);
        });
    }
}
