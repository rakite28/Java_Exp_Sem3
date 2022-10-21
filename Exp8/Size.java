package Exp8;

class Rectangle 
{ 
    double length; 
    double breadth; 
 
    // Default constructor 
    Rectangle() { 
        length = 0; 
        breadth = 0; 
    } 
 
    // Parameterized constructor 
    Rectangle(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 
 
    // area method 
    double area() { 
        return length * breadth; 
    } 
} 
 
class Cube { 
    double side; 
 
    // Default constructor 
    Cube() { 
        side = 0.0; 
    } 
 
    // Parameterized constructor 
    Cube(double side) { 
        this.side = side; 
    } 
 
    // volume method 
    double volume() { 
        return side * side * side; 
    } 
} 
 
class Size { 
 
    double calcSize(Object obj) { 
        if (obj instanceof Rectangle) 
            return ((Rectangle) obj).area(); 
 
        if (obj instanceof Cube) 
            return ((Cube) obj).volume(); 
 
        return -1; 
 
    } 
 
    public static void main(String args[]) { 
        Cube cube = new Cube(2); 
        Rectangle rect = new Rectangle(2, 3); 
        Size size = new Size(); 
        double isCube = size.calcSize(cube); 
        System.out.println(isCube); 
        double isRect = size.calcSize(rect); 
        System.out.println(isRect); 
        double defaultCase = size.calcSize(2); 
        System.out.println(defaultCase); 
    } 
}
