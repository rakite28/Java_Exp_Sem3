package Exp10;

import java.util.*; 
 
class Student { 
    int rollNo; 
 
    Student(int rollNo) { 
        System.out.println("Student constructor was called"); 
        this.rollNo = rollNo; 
    } 
 
    void setRollno(int rollNo) { 
        this.rollNo = rollNo; 
    } 
 
    int getRollNo() { 
        return this.rollNo; 
    } 
 
} 
 
class Test extends Student { 
    int sem1Marks; 
    int sem2Marks; 
 
    Test(int sem1Marks, int sem2Marks, int rollNo) { 
        super(rollNo); 
        System.out.println("Test constructor was called"); 
        this.sem1Marks = sem1Marks; 
        this.sem2Marks = sem2Marks; 
    } 
 
    void setSem1Marks(int sem1) { 
        this.sem1Marks = sem1; 
    } 
 
    int getSem1Marks() { 
        return this.sem1Marks; 
    } 
 
    void setSem2Marks(int sem2Marks) { 
        this.sem2Marks = sem2Marks; 
    } 
 
    int getRollNo() { 
        return this.sem2Marks; 
    } 
} 
 
class Result extends Test implements Sports { 
    int total; 
 
    Scanner ob = new Scanner(System.in); 
 
    Result(int sem1Marks, int sem2Marks, int rollNo) { 
 
        super(sem1Marks, sem2Marks, rollNo); 
        System.out.println("Result Constructor was called"); 
    } 
 
    public void score() { 
        this.total = (sem1Marks + sem2Marks) / 2 + score; 
        System.out.println("The score of this student is (Average of sem1 and sem2 + sports score): " + this.total); 
    } 
 
    public static void main(String[] args) { 
        Result res = new Result(80, 100, 6); 
        res.score(); 
    } 
 
} 
 
interface Sports { 
    int score = 49; 
}
