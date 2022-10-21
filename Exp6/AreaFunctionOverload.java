package Exp6;

public class AreaFunctionOverload {
    public void rectArea(double length, double breadth) { 
        double area = length * breadth; 
        System.out.println("Area of Rectangle (double): " + area); 
    } 
 
    public void rectArea(double side) { 
        double area = side * side; 
        System.out.println("Area of Square (double): " + area); 
    } 
 
    public void rectArea(int length, int breadth) { 
        int area = length * breadth; 
        System.out.println("Area of Rectangle (int): " + area); 
    } 
 
    public static void main(String[] args) { 
        AreaFunctionOverload o = new AreaFunctionOverload(); 
        o.rectArea(1, 5); 
        o.rectArea(4); 
        o.rectArea(2.5, 3.5); 
    }  
}
