package Exp2;
import java.util.*;
public class SwitchCaseCalculator 
{
    public static void main(String args[])
    {
        int a,b,ch,res=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number");
            a=sc.nextInt();
            System.out.println("Enter 2nd number");
            b=sc.nextInt();
            System.out.println("Enter\n1 for addition\n2 for subtraction\n3 for division\n4 for multiplication\n5 for remainder");
        
            ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            res=a+b;
            System.out.println("Result is"+res);
            break;

            case 2:
            res=a-b;
            System.out.println("Result is"+res);
            break;

            case 3:
            res=a*b;
            System.out.println("Result is"+res);
            break;

            case 4:
            res=a/b;
            System.out.println("Result is"+res);
            break;

            case 5:
            res=a%b;
            System.out.println("Result is"+res);
            break;

        }
        }
    }
}
