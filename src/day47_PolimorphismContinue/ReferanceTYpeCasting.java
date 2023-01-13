package day47_PolimorphismContinue;

import day43_Abstraction.employeeTask.*;
import day44_AbstractionContinue_Interface.animalTask.Animal;
import day44_AbstractionContinue_Interface.animalTask.Cat;
import day44_AbstractionContinue_Interface.animalTask.Dog;
import day45_AbstractionContinue_Interface.shape.Circle;
import day45_AbstractionContinue_Interface.shape.Cube;
import day45_AbstractionContinue_Interface.shape.Shape;
import day45_AbstractionContinue_Interface.shape.Square;

public class ReferanceTYpeCasting {
    public static void main(String[] args) {

        Shape shape=(Shape) new Circle(4); //upcasting
        Shape shape2= new Circle(5);

        Animal animal=new Dog("Max", "Husky", 'M', 3, "Small", "White");  //upcasting
       //Dog dog=(Dog) animal; //downcasting
        ((Dog)animal).bark();


        System.out.println("animal.getName() = " + animal.getName());
        //System.out.println("dog.getName() = " + dog.getName());

        Shape shape1=new Square(5);
        System.out.println(((Square) shape1).getSide());

        Animal animal2=new Cat("Jim", "Scotish", 'M', 3, "Small", "White");
       // Cat cat=(Cat) animal2;
        //cat.meow();
        ((Cat)animal2).meow();
       // ((Dog)animal2).bark();
        System.out.println("-------------------------------------");

        Employee employee=new Tester("Ali",30,'M',42,"SDET",145000.00);

        ((Tester)employee).bugReport();
        //((Developer)employee).unitTest();  ClassCastException

        //Driver driver=(Driver) employee;  //ClassCastException
        Person person=(Person) employee;  //upcasting
        Teacher teacher=(Teacher) employee;  //ClassCastException
        System.out.println("-----------------------------------------");


        Shape s1=new Circle(10);
        s1.area();
        s1.perimeter();
        //((Cube)s1).volume();  //ClassCastException



    }
}
