package oop.pizza;

public enum SizePizza {
    SMALL ("Маленькая"),
    MEDIUM ("Средняя"),
    BIG ("Большая");

    private String title;

    SizePizza (String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }
}
