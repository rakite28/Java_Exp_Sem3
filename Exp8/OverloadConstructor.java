package Exp8;

public class OverloadConstructor {
    
    private double length; 
    private double breadth; 
    private double area; 
 
    public static void main(String[] args) { 
        OverloadConstructor square = new OverloadConstructor(2.5); 
        System.out.println("Area of Square: " + square.getArea()); 
 
        OverloadConstructor rect = new OverloadConstructor(2.5, 10.0); 
        System.out.println("Area of Rectangle: " + rect.getArea()); 
 
    } 
 
    public OverloadConstructor(double side) { 
        this.length = side; 
        this.breadth = side; 
    } 
 
    public OverloadConstructor(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 
 
    public double getLength() { 
        return this.length; 
    } 
 
    public double getBreadth() { 
        return this.breadth; 
    } 
 
    public double getArea() { 
        this.area = this.length * this.breadth; 
        return this.area; 
    }
}
