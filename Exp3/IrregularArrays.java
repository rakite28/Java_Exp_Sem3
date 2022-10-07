package Exp3;

public class IrregularArrays 
{
    public static void main(String[] args)
    {
        int[][] a =new int[3][];
        int  c=0;

        for(int i=0;i<3;i++)
        {
            a[i]=new int[i+1];
        }
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                c++;
                a[i][j] = c;
            }
        }
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }


    }
}
