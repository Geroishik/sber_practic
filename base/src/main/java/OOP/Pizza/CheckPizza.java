package OOP.Pizza;

public class CheckPizza {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder("Гавайская", SizePizza.MEDIUM, false, "ул. Козленская 16");
        pizzaOrder.order();
        pizzaOrder.order();
        pizzaOrder.cancel();
    }
}
