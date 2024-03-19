package OOP.Pizza;

public class PizzaOrder {
    private String name;

    private SizePizza size;
    private boolean sauce;

    private String address;

    private boolean isAcceptOrder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SizePizza getSize() {
        return size;
    }

    public void setSize(SizePizza size) {
        this.size = size;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSauce() {
        return sauce;
    }
    public void setSauce(boolean sauce){
        this.sauce = sauce;
    }

    public PizzaOrder(String name, SizePizza size, boolean sauce, String address){
        setName(name);
        setSize(size);
        setSauce(sauce);
        setAddress(address);
    }
    public void order(){
        if (!isAcceptOrder){
            isAcceptOrder = true;
            String isSauceGive;
            if (sauce){
                isSauceGive = " с соусом";
            }else {
                isSauceGive = " без соуса";
            }
            System.out.println("Заказ принят. " + size + " пицца " + name + isSauceGive + " на адрес " + address);
        }else {
            System.out.println("Заказ уже принят.");
        }

    }
    public void cancel(){
        System.out.println("Заказ не был принят");
    }

    @Override
    public String toString(){
        return getName() + "\n"
                + getSize() + "\n"
                + getAddress() + "\n"
                + isSauce();
    }
}
