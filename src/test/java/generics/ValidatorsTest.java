package generics;

import org.junit.jupiter.api.Test;

public class ValidatorsTest {

    @Test
    void testingCheckServer(){
        Server1 server1 = new Server1();
        CheckServer<Integer> checkServer1 = new CheckServer<>(server1);
        checkServer1.checkRequest(45);
        checkServer1.checkResponse();
        checkServer1.checkDel();

        Server2 server2 = new Server2();
        CheckServer<Double> checkServer2 = new CheckServer<>(server2);
        checkServer2.checkRequest(45.4);
        checkServer2.checkResponse();
        checkServer2.checkDel();
    }
}
