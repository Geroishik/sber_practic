package ExceptionsHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankOnline {
    private final List<String> closeCard = new ArrayList<>(Arrays.asList("1111111111111111",
            "2222222222222222", "3333333333333333", "4444444444444444", "5555555555555555",
            "6666666666666666", "7777777777777777", "8888888888888888", "9999999999999999"));

    public boolean checkCardNumb(String cardNumb) {
        boolean isAllNumb = true;
        for (int charNum = 0; charNum < cardNumb.length(); charNum++) {
            if (!Character.isDigit(cardNumb.charAt(charNum))) {
                isAllNumb = false;
            }
        }
        return cardNumb.length() == 16 && isAllNumb;
    }

    public void send(String cardNumber, Double money) throws BankOnlineException {
        if (cardNumber == null || money == null) {
            throw new NullArgumentTransferException("Null argument in send");
        }
        if (!checkCardNumb(cardNumber)) {
            throw new InvalidCardNumberException("Invalid card number");
        }
        if (closeCard.contains(cardNumber)){
            throw new TransferToCloseCardException("Transfer to close card");
        }
        if (money < 0){
            throw new NegativeTransferException("Negative value transfer");
        }
        if (money > 50000){
            throw new OutOfLimitTransferException("Out of limit transfer");
        }
    }
}
