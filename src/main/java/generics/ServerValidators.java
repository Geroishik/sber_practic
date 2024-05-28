package generics;

public interface ServerValidators<T> {

    T responseValidator();

    void requestValidator(T elem);

    void delValidator();

    boolean isEmptyData();
}
