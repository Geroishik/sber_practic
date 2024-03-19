package OOP.Phone;

public class CheckPhone {
    public static void main(String[] args){
        Phone phoneAll = new Phone("+7 476 678 52 46", "IPhone 15 Pro Max", 256);
        Phone phoneTwo = new Phone("+7 567 678 45 65", "Samsung Galaxy A12");
        Phone phoneZero = new Phone();
        System.out.println(phoneAll.getNumber());
        System.out.println(phoneTwo.getNumber());
        System.out.println(phoneZero.getNumber());
        Phone.receiveCall("Игорь");
        Phone.receiveCall("Игорь", phoneAll.number);
        Phone.sendMessage();
        System.out.println(phoneAll);
        System.out.println();
        System.out.println(phoneTwo);
        System.out.println();
        System.out.println(phoneZero);
    }
}
