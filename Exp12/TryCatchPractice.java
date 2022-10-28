package Exp12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TryCatchPractice
{
    public static void main(String[] args) throws IOException
    {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter month number");
        str=br.readLine();
        a=Integer.parseInt(str);
        try
        {
            if(a>12||a<1)
            throw new NumberFormatException();
            System.out.println("Month number Entered is" +a);
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Invalid Month Number");
        }
    }
}
