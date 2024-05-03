package oop.paint;

public class Circle extends Figure implements Drawable {
    private final Point pointCenter;
    private final Point point;
    final private double radius;

    public Circle(Point pointCenter, Point point) {
        this.pointCenter = pointCenter;
        this.point = point;
        this.radius = getDistance(pointCenter, point);
    }

    @Override
    public void area() {
        System.out.println(Math.PI * radius * radius);
    }

    @Override
    public void perimeter() {
        System.out.println(2 * Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("Нарисована окружность с центром в точке " +
                pointCenter.x + " " + pointCenter.y + " и радиусом = " + radius);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисована " + color + " окружность с центром в точке " +
                pointCenter.x + " " + pointCenter.y + " и радиусом = " + radius);
    }
}
