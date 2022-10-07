package Exp1;
import java.util.*;

public class CountDigits {
    public static void main(String args[])
    {
        int i=0,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a no.");
            n=sc.nextInt();
        }
        while(n!=0)
        {
            i++;
            n=n/10;
        }
        System.out.println("The number of digits are"+i);
    }
}
