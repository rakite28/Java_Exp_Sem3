package Exp2;
import java.util.*;
public class quadraticRoots {
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter coefficients: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double determinant = b*b - 4.0*a*c;
            if(determinant>0){
                double root1= (-b+ Math.sqrt(determinant)) / 2*a;
                double root2= (-b- Math.sqrt(determinant)) / 2*a;
                System.out.println("The roots are real");
                System.out.println("root 1 is "+root1+" and root 2 is "+root2);
            }else if(determinant==0){
                double root= (-b+ Math.sqrt(determinant)) / 2*a;
                System.out.println("The roots are real and equal");
                System.out.println("roots are "+root);
            }else{
                double root= -b/2*a;
                double img= Math.sqrt(-determinant) / 2*a;
                System.out.println("root 1 is " +root+ "+i" +img +" and root 2 is " +root+ "-i" +img);
            }
        }
    
}
