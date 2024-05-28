package generics;

import java.util.*;

public class EvenNumb {

    public static<T extends Number> int colEvenNumb(Collection<T> collection){
        int col = 0;
        for (T elem: collection ){
            if (elem.intValue() % 2 == 0){
                col++;
            }
        }
        return col;
    }



}
