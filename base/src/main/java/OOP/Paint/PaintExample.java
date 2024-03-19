package OOP.Paint;

public class PaintExample {
    public static void main(String[] args) {
        Point center = new Point(1,1);
        Point pointCircle = new Point(1,4);
        Circle circle = new Circle(center, pointCircle);
        circle.draw();
        circle.area();
        circle.perimeter();

        Point sqPoint1 = new Point(1,1);
        Point sqPoint2 = new Point(1,4);
        Point sqPoint3 = new Point(4,4);
        Point sqPoint4 = new Point(4,1);
        Square square = new Square(sqPoint1, sqPoint2,sqPoint3,sqPoint4);
        square.draw(Color.RED);
        square.area();
        square.perimeter();

        Point trPoint1 = new Point(2, 4);
        Point trPoint2 = new Point(4, 5);
        Point trPoint3 = new Point(3, 8);
        Triangle triangle = new Triangle(trPoint1, trPoint2, trPoint3);
        triangle.draw(Color.YELLOW);
        triangle.area();
        triangle.perimeter();
    }
}
