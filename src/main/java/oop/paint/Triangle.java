package oop.paint;

public class Triangle extends Figure implements Drawable {
    private final Point point1;
    private final Point point2;
    private final Point point3;
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.side1 = getDistance(point1, point2);
        this.side2 = getDistance(point2, point3);
        this.side3 = getDistance(point1, point3);
    }

    @Override
    public void area() {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        System.out.println(Math.pow(halfPerimeter * (halfPerimeter - side1) *
                (halfPerimeter - side2) * (halfPerimeter - side3), 0.5));
    }

    @Override
    public void perimeter() {
        System.out.println(side1 + side2 + side3);
    }

    @Override
    public void draw() {
        System.out.println("Нарисован треугольник, заданный вершинами с координатами: \n" +
                point1.x + " " + point1.y + "\n" +
                point2.x + " " + point2.y + "\n" +
                point3.x + " " + point3.y);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован " + color + " треугольник, заданный вершинами с координатами: \n" +
                point1.x + " " + point1.y + "\n" +
                point2.x + " " + point2.y + "\n" +
                point3.x + " " + point3.y);
    }
}
