import java.util.*;
public class Q2_5_2
{
    public static void main(String args[])
    {
        int i,j=1,k,n=5,c=0,d=1;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            
            for(k=1;k<=i;k++)
            {
                c++;
            }
            d=c;
            for(k=1;k<=i;k++)
            {
                System.out.print((char)(d+64));
                d--;
            }

            System.out.println();
        }
    }
}