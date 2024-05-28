package generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static generics.EvenNumb.colEvenNumb;

public class EvenNumbTest {
    @Test
    void testingEvenNumb(){
        List<Number> listNumb = new ArrayList<>(Arrays.asList(1,3,5,6));
        assertEquals(colEvenNumb(listNumb),1);
        List<Integer> listInt = new ArrayList<>(Arrays.asList(2,4,5,6));
        assertEquals(colEvenNumb(listInt), 3);
        List<Double> listDouble = new ArrayList<>(Arrays.asList(3.4,4.1,4.0));
        assertEquals(colEvenNumb(listDouble), 2);
    }

}
