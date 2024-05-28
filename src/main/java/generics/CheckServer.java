package generics;

public class CheckServer<TData> {
    private final ServerValidators<TData> serverValidators;

    public CheckServer(ServerValidators<TData> server){
        serverValidators = server;
    }

    public void checkRequest(TData elem) {
        if (elem == null) {
            throw new NullPointerException("Invalid request");
        } else {
            serverValidators.requestValidator(elem);
        }
    }

    public TData checkResponse() {
        if (serverValidators.isEmptyData()){
            throw new ArrayIndexOutOfBoundsException("Server data is empty");
        }
        return serverValidators.responseValidator();
    }

    public void checkDel() {
        if (serverValidators.isEmptyData()){
            throw new ArrayIndexOutOfBoundsException("Server data is empty");
        }else {
            serverValidators.delValidator();
        }
    }

}
