package testunit;

public class MiddleClass {
    public int sumToNum(int num, LowClass lowClass) throws Exception {
        if (num < 1) {
            throw new Exception("Summation to a number less than one");
        }
        lowClass.setValue(num * (num + 1) / 2);
        return lowClass.getValue();
    }

    private int numOnetoTen(int num) {
        if (num < 10) {
            return num + 1;
        }
        return 1;
    }

}
