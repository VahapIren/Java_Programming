package day43_Abstraction.shapeTask;

public class MathClub {
    public static void main(String[] args) {

        //Shape shape=new Shape("Koni");
        Rectangle rectangle=new Rectangle(12,8);
        Square square=new Square(13);
        Circle circle=new Circle(20);

        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());
        System.out.println("square.area() = " + square.area());
        System.out.println("square.perimeter() = " + square.perimeter());
        System.out.println("circle.area() = " + circle.area());
        System.out.println("circle.perimeter() = " + circle.perimeter());

        System.out.println("-------------------------------------");

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);


    }
}
