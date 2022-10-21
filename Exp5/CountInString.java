package Exp5;

import java.util.*;

public class CountInString {
    public static void main(String[] args) { 
        Scanner ob = new Scanner(System.in); 
        System.out.println("Enter a String"); 
        String s = ob.nextLine(); 
        ob.close(); 
        int[] result = checkCount(s); 
        System.out.println("Number of Alphabets: " + result[0]); 
        System.out.println("Number of Consonants: " + result[1]); 
        System.out.println("Number of Vowels: " + result[2]); 
        System.out.println("Number of numbers: " + result[3]); 
        System.out.println("Number of Blank Spaces: " + result[4]); 
        System.out.println("Number of Special Characetrs: " + result[5]); 
    } 
 
    public static int[] checkCount(String s) { 
        s = s.toLowerCase(); 
        int[] count = new int[6]; 
        for (int i = 0; i < s.length(); i++) { 
            if (Character.isLetter(s.charAt(i))) { 
                count[0]++; 
                if ("aeiou".indexOf(Character.toString(s.charAt(i))) == -1) 
                    count[2]++; 
                else 
                    count[1]++; 
            } else if (Character.isDigit(s.charAt(i))) 
                count[3]++; 
            else if (Character.isSpaceChar(s.charAt(i))) 
                count[4]++; 
            else 
                count[5]++; 
        } 
        return count; 
    }
} 
 