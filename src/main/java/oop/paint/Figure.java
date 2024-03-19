package oop.paint;

public abstract class Figure {
    private Point point1;
    private Point point2;
    public abstract void area();
    public abstract void perimeter();
    public double getDistance(Point point1, Point point2){
        return Math.pow(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2), 0.5);
    }
}
