public class abstracts{
   
    public static void main(String[] args) {
        
        shape s1 = new Circle("red", 2);
        shape s2 = new Rectangle("yellow", 5, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

    
}

abstract class shape {
    String color;
    abstract double area();
    public abstract String toString();

    public shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor(){
        return color; 
    }
}

class Circle extends shape{
    double radius;

    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Circle color is "+ super.getColor()
        + " and area is :" + area();
    }
}

class Rectangle extends shape{

    double length;
    double width;

    public Rectangle (String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
        System.out.println("Rectangle constructor called");
    }

    @Override
    double area() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle color is "+ super.getColor()+
        " and area is: "+ area();
    }
}

// For reference: https://www.geeksforgeeks.org/abstraction-in-java-2/





