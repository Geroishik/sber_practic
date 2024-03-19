package OOP.Circle;

public class Circle {
    double radius;
    String color;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString(){
        return "Радиус: " + radius + "\n"
                + "Цвет: " + color + "\n"
                + "Площадь круга: " + area() + "\n"
                + "Периметр круга: " + perimeter() + "\n";
    }

}
