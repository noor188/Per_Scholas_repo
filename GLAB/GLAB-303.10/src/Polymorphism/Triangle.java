package Polymorphism;

public class Triangle extends Shape{

    public Triangle(){}

    public Triangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public void setBase(double base) {
        super.base = base;
    }
    @Override
    public void setWidth(double width) {
        super.width = width;
    }
    @Override
    public double getArea() {
        return 0.5*base*height;
    }

    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle"  );
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

}
