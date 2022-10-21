package Exp3;

import java.util.*;

public class SumTableFormat {
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the number of students:"); 
        int n_students = s.nextInt(); 
        System.out.println("Enter the number of subjects:"); 
        int n_subjects = s.nextInt(); 
        int i, j; 
        int[][] arrayforeachstudent = new int[n_students][n_subjects]; 
 
        System.out.println("Enter the marks for all students:"); 
 
        for (i = 0; i < n_students; i++) { 
 
            for (j = 0; j < n_subjects; j++) { 
                arrayforeachstudent[i][j] = s.nextInt(); 
 
            } 
        } 
        // System.out.println(Arrays.deepToString(arrayforeachstudent)); 
 
        // printing values 
        System.out.println("printing values\n"); 
        int allthemarks = 0; 
        for (i = 0; i < n_students; i++) { 
            int totalmarksperstudent = 0; 
            for (j = 0; j < n_subjects; j++) { 
                totalmarksperstudent += arrayforeachstudent[i][j]; 
                System.out.print(arrayforeachstudent[i][j] + "   "); 
            } 
            System.out.print("  |  " + totalmarksperstudent + "\n"); 
            allthemarks += totalmarksperstudent; 
        } 
        // array for storing marks per subject 
        int[] indisubmarks = new int[n_subjects]; 
        System.out.println("---------------------------------------------------------------"); 
        // finding total marks per subject 
        for (j = 0; j < n_subjects; j++) { 
            indisubmarks[j] = 0; 
            for (i = 0; i < n_students; i++) { 
                indisubmarks[j] += arrayforeachstudent[i][j]; 
            } 
            // printing last row for total individual subject marks 
 
            System.out.print(indisubmarks[j] + "   "); 
 
        } 
        System.out.print("  |  " + allthemarks); 
 
        s.close(); 
    }
}
