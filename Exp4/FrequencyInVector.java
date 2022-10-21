package Exp4;

import java.util.*;

public class FrequencyInVector {
    public static void main(String[] args) { 
        // filling vector array 
        Scanner s = new Scanner(System.in); 
        Vector<Integer> vec = new Vector<Integer>(); 
        System.out.println("How many elements are in the vector?"); 
        int n = s.nextInt(); 
        for (int i = 0; i < n; i++) { 
            System.out.println("Enter element " + (i + 1)); 
            int elementobeadded = s.nextInt(); 
            vec.add(i, elementobeadded); 
        } 
        System.out.println("Which integers frequency do you want?"); 
        int k = s.nextInt(); 
        int count = 0; 
        for (int i = 0; i < n; i++) { 
            if (vec.get(i) == k) { 
                count++; 
            } 
        } 
        System.out.println("Frequency of " + k + " is " + count); 
 
        // System.out.print(vec); 
        s.close(); 
 
    }
}
