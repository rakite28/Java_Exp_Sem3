package Exp2;
import java.util.*;
public class PrimeInRange 
{
    public static void main(String args[])
    {
        int i,a,b,j,c=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter start no.");
            a=sc.nextInt();
            System.out.println("Enter end no.");
            b=sc.nextInt();
        }
        for(i=a;i<=b;i++)
        {
            //if(i%2==0) for odd numbers
            c=0;
            for(j=2;j<i/2+1;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==0)
            System.out.println(i);
            else
            continue;
        }

    }
}
