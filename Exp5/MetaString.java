package Exp5;

import java.util.*;

public class MetaString { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter two strings to check if they are Meta:"); 
        String s1 = s.next(); 
        String s2 = s.next(); 
        char[] charstobeswapped = new char[4]; 
 
        boolean flag = false; 
        if( s1.length() != s2.length() ){ 
            flag = false; 
        }else{ 
            int j = 0; 
            s1 = s1.toLowerCase(); 
            s2 = s2.toLowerCase(); 
            int noOfDifferentLetters = 0; 
            for(int i = 0 ; i <s1.length();i++){ 
                if( s1.charAt(i) != s2.charAt(i)){ 
                    noOfDifferentLetters++; 
                    if(noOfDifferentLetters > 2){ 
                        flag = false; 
                        break; 
                    } 
                    charstobeswapped[j] =  s1.charAt(i); 
                    charstobeswapped[j+1] =  s2.charAt(i); 
                    j = j+2 ; 
                } 
            }   
        } 
        if(charstobeswapped[0] == charstobeswapped[3] && charstobeswapped[1] == charstobeswapped[2]){ 
            flag = true; 
        } 
        s.close(); 
        //final statement 
 
        if(flag == true){ 
            System.out.println("The two strings are Meta"); 
        }else{ 
            System.out.println("The two strings are Not Meta"); 
        } 
 
    } 
}