package testunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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


    private Answer<Integer> answer = new Answer<Integer>() {
        @Override
        public Integer answer(InvocationOnMock invocation) throws Throwable {
            Object mock = invocation.getMock();
            Object[] args = invocation.getArguments();
            LowClass lc = Mockito.mock(LowClass.class);
            int num = (int) args[0];
            lc.setValue(num * (num + 1) / 2);
            Mockito.verify(lc).setValue(num * (num + 1) / 2);
            lc.getValue();
            Mockito.verify(lc).getValue();
            return num * (num + 1) / 2;
        }
    };

    @Test
    void testingCol() throws Exception {
        LowClass lowClassMock = Mockito.mock(LowClass.class);
        MiddleClass middleClass = Mockito.mock(MiddleClass.class);
        Mockito.when(middleClass.sumToNum(5, lowClassMock)).thenAnswer(answer);
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