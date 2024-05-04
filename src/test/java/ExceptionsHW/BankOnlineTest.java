package ExceptionsHW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankOnlineTest {

    @Test
    void testingSend() {
        BankOnline bankOnline = new BankOnline();
        assertThrows(NullArgumentTransferException.class, ()-> {
            bankOnline.send("3456345634563456", null);
        });
        assertThrows(InvalidCardNumberException.class, ()->{
            bankOnline.send("1111111111g11111", 4.5);
        });
        assertThrows(TransferToCloseCardException.class, ()-> {
            bankOnline.send("2222222222222222", 50.9);
        });
        assertThrows(NegativeTransferException.class, ()-> {
            bankOnline.send("3456345634563456", -5.4);
        });
        assertThrows(OutOfLimitTransferException.class, ()-> {
            bankOnline.send("3456345634563456", 123456789.0);
        });
    }
}