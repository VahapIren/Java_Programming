package day46_Polymorphism;

import day04_Variables.Square;
import day12_Scanner.Circle;
import day43_Abstraction.employeeTask.*;
import day44_AbstractionContinue_Interface.animalTask.Animal;
import day44_AbstractionContinue_Interface.animalTask.Cat;
import day44_AbstractionContinue_Interface.animalTask.Dog;
import day44_AbstractionContinue_Interface.animalTask.Playable;
import day45_AbstractionContinue_Interface.shape.Rectangle;
import day45_AbstractionContinue_Interface.shape.Shape;
import day45_AbstractionContinue_Interface.shape.Triangle;

import java.util.ArrayList;

public class PolymphismIntro {
    public static void main(String[] args) {

        String str="Wooden Spoon";
        Integer n1=2;
        Double n2=5.5;
        Boolean r1=true;
        Object[] array={str,n1,n2,r1,new Circle(),new Square()};


        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Employee> cydeoEmployees=new ArrayList<>();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);
        cydeoEmployees.add(developer);
        System.out.println("------------------------------------------");

        Employee employee1=new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee1.work();

        Employee employee2=new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        employee2.work();

        Employee employee3=new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        employee3.work();

        Animal animal=new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal.drink();
        animal.eat();
        // animal.play();
        //  animal.bark();

        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink();
        //  animal2.eat();

        Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");

        Shape shape=new day45_AbstractionContinue_Interface.shape.Circle(5);
        System.out.println("shape.area() = " + shape.area());

        //System.out.println(shape.radius);
        //System.out.println(shape.PI);

        boolean isSquare = shape instanceof day45_AbstractionContinue_Interface.shape.Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof day45_AbstractionContinue_Interface.shape.Circle;


        System.out.println("isSquare = " + isSquare);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);



    }

}
