package oop.phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public static void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ". Номер: " + number);
    }

    public static void sendMessage() {
        final String[] phoneNumber = {"+7 951 874 89 45", "+7 954 674 89 12", "+7 932 567 78 54"};
        for (String number : phoneNumber) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Номер телефона: " + number + "\n"
                + "Модель телефона " + model + "\n"
                + "Вес телефона(в граммах): " + weight;
    }
}
