package day44_AbstractionContinue_Interface.animalTask;

public final class Cat extends Animal{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Biryani");
    }
    public void meow(){
        System.out.println(getName()+" is meowing");
    }
}
