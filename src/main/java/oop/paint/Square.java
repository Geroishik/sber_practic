package oop.paint;

public class Square extends Figure implements Drawable {
    private final Point point1;
    private final Point point2;
    private final Point point3;
    private final Point point4;
    private final double side;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.side = getDistance(point1, point2);
    }

    @Override
    public void area() {
        System.out.println(side * side);
    }

    @Override
    public void perimeter() {
        System.out.println(4 * side);
    }

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат, заданный вершинами с координатами: \n" +
                point1.x + " " + point1.y + "\n" +
                point2.x + " " + point2.y + "\n" +
                point3.x + " " + point3.y + "\n" +
                point4.x + " " + point4.y);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован " + color + " квадрат, заданный вершинами с координатами: \n" +
                point1.x + " " + point1.y + "\n" +
                point2.x + " " + point2.y + "\n" +
                point3.x + " " + point3.y + "\n" +
                point4.x + " " + point4.y);
    }
}
