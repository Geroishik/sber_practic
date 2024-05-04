package test.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleClassTest {
    @Test
    void testingMock() throws Exception {
        LowClass lowClassMock = Mockito.mock(LowClass.class);
        Mockito.when(lowClassMock.getValue())
                .thenReturn(15);
        MiddleClass middleClass = new MiddleClass();
        int sum = middleClass.sumToNum(5, lowClassMock);
        assertEquals(sum, 15);
    }

    @Test
    void testingQuantityCall() throws Exception {
        LowClass lowClassMock = Mockito.mock(LowClass.class);
        MiddleClass middleClass = new MiddleClass();
        middleClass.sumToNum(5, lowClassMock);
        Mockito.verify(lowClassMock).setValue(15);
        Mockito.verify(lowClassMock).getValue();
    }

    @Test
    void testingException() {
        MiddleClass middleClass = new MiddleClass();
        LowClass lowClass = new LowClass();
        Assertions.assertThrows(Exception.class, () -> {
            middleClass.sumToNum(0, lowClass);
        });
    }

    @Test
    void testingPrivate() {
        MiddleClass middleClass = new MiddleClass();
        try {
            Method method = MiddleClass.class.getDeclaredMethod("numOnetoTen", int.class);
            method.setAccessible(true);
            assertEquals(method.invoke(middleClass, 9), 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}