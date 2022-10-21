package Exp11; 
 
public class VolumePackage { 
    public double coneVol(double height, double radius) { 
        return (0.333 * 3.14 * radius * radius * height); 
    } 
 
    public static void main(String[] args) { 
        VolumePackage v = new VolumePackage(); 
        System.out.println("Volume: " + v.coneVol(5.0, 1.0)); 
    } 
} 