package ExceptionsHW;

public class TransferToCloseCardException extends BankOnlineException{
    public TransferToCloseCardException(String message){
        super(message);
    }
}
