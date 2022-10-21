package Exp9;

class AbstractClass { 
    public static void main(String[] args) { 
        Rect r = new Rect(5.0, 6.0); 
        Tri t = new Tri(3.0, 2.0); 
        Circle c = new Circle(7.0); 
        System.out.println("Area of Reactangle is: " + r.area()); 
        System.out.println("Area of Triangle is: " + t.area()); 
        System.out.println("Area of Circle is: " + c.area()); 
 
    } 
} 
 
abstract class Area { 
 
    abstract double area(); 
} 
 
class Rect extends Area { 
    private double length; 
    private double breadth; 
 
    Rect(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
 
    } 
 
    double area() { 
        return this.length * this.breadth; 
    } 
} 
 
class Tri extends Area { 
    private double height; 
    private double base; 
 
    Tri(double height, double base) { 
        this.height = height; 
        this.base = base; 
 
    } 
 
    double area() { 
        return this.height * this.base * 0.5; 
    } 
} 
 
class Circle extends Area { 
    private double radius; 
 
    Circle(double radius) { 
        this.radius = radius; 
    } 
 
    double area() { 
        return this.radius * this.radius * 3.14; 
    } 
}
