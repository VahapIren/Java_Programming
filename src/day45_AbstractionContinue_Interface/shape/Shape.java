package day45_AbstractionContinue_Interface.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name: "+name);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
