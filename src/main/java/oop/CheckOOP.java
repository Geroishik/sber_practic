package oop;

import oop.book.Author;
import oop.book.Book;
import oop.circle.Circle;
import oop.matrix.Matrix;
import oop.paint.Color;
import oop.paint.Point;
import oop.paint.Square;
import oop.paint.Triangle;
import oop.phone.Phone;
import oop.pizza.PizzaOrder;
import oop.pizza.SizePizza;

public class CheckOOP {
    public static void checkBook(){
        Author author = new Author("Chris", "male", "superChrisStar@gmail.com");
        Book book = new Book("My Biography", author, 2020);
        System.out.println(book);
    }

    public static void checkCircle(){
        Circle circle = new Circle(10, "red");
        System.out.println(circle);
    }

    public static void checkMatrix(){
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(2,3);
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                matrix1.setValue(line, column, line + column);
            }
        }
        for (int line = 0; line < 2; line++) {
            for (int column = 0; column < 3; column++) {
                matrix2.setValue(line, column, 4 - line - column);
            }
        }
        matrix1.printMatrix();
        matrix2.printMatrix();
        matrix1.sumMatrix(matrix1, matrix2);
        matrix1.printMatrix();
        matrix1.numPerMatrix(10);
        matrix1.printMatrix();
        matrix1.matrixPerMatrix(matrix1, matrix2).printMatrix();
    }

    public static void checkPaint(){
        Point center = new Point(1, 1);
        Point pointCircle = new Point(1, 4);
        oop.paint.Circle circle = new oop.paint.Circle(center, pointCircle);
        circle.draw();
        circle.area();
        circle.perimeter();

        Point sqPoint1 = new Point(1, 1);
        Point sqPoint2 = new Point(1, 4);
        Point sqPoint3 = new Point(4, 4);
        Point sqPoint4 = new Point(4, 1);
        Square square = new Square(sqPoint1, sqPoint2, sqPoint3, sqPoint4);
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

    public static void checkPhone(){
        Phone phoneAll = new Phone("+7 476 678 52 46", "IPhone 15 Pro Max", 256);
        Phone phoneTwo = new Phone("+7 567 678 45 65", "Samsung Galaxy A12");
        Phone phoneZero = new Phone();
        System.out.println(phoneAll.getNumber());
        System.out.println(phoneTwo.getNumber());
        System.out.println(phoneZero.getNumber());
        Phone.receiveCall("Игорь");
        Phone.receiveCall("Игорь", phoneAll.getNumber());
        Phone.sendMessage();
        System.out.println(phoneAll);
        System.out.println();
        System.out.println(phoneTwo);
        System.out.println();
        System.out.println(phoneZero);
    }

    public static void checkPizza(){
        PizzaOrder pizzaOrder = new PizzaOrder("Гавайская", SizePizza.MEDIUM, false, "ул. Козленская 16");
        pizzaOrder.order();
        pizzaOrder.order();
        pizzaOrder.cancel();
    }
    public static void main(String[] args) {
        checkBook();
        System.out.println();
        checkCircle();
        System.out.println();
        checkMatrix();
        System.out.println();
        checkPaint();
        System.out.println();
        checkPhone();
        System.out.println();
        checkPizza();
    }
}
