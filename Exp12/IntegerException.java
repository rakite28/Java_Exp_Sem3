package Exp12;

import java.io.IOException;

public class IntegerException {
    public static void main(String[] args) throws IOException { 
        int[] arr = new int[args.length]; 
        for (int i = 0; i < args.length; i++) { 
            try { 
                arr[i] = Integer.parseInt(args[i]); 
                System.out.println("Valid"); 
            } catch (NumberFormatException e) { 
                System.out.println("Invalid"); 
            } 
        } 
    }
}
