package Exp12;

import java.util.Scanner;

public class Result {
    private int marks; 
    private int dataCenter; 
    private int seatNo; 
    private String name; 
    private String Date; 
 
    public Result(int marks, int dataCenter, int seatNo, String name, String Date) { 
        this.marks = marks; 
        this.dataCenter = dataCenter; 
        this.seatNo = seatNo; 
        this.name = name; 
        this.Date = Date; 
    } 
 
    int getMarks() { 
        return marks; 
    } 
 
    int getSeatNo() { 
        return seatNo; 
    } 
 
    int getDataCenter() { 
        return dataCenter; 
    } 
 
    String getName() { 
        return name; 
    } 
 
    String getDate() { 
        return Date; 
    } 
 
    void ValidateMarks(int marks) throws MarksOutOfBoundsException { 
        if (this.marks > 100 || this.marks < 0) 
            throw new MarksOutOfBoundsException("Marks out Of Bounds"); 
    } 
 
    public static void main(String[] args) { 
 
    } 
} 
 
class MarksOutOfBoundsException extends Exception { 
 
    /** 
     * 
     */ 
    private static final long serialVersionUID = 1L; 
 
    public MarksOutOfBoundsException(String message) { 
        super(message); 
    } 
} 
 
class CalcResult { 
    public static void main(String[] args) { 
        Scanner ob = new Scanner(System.in); 
        System.out.println("Enter Marks, Data centre number, Seat number, Name and Date"); 
        int marks = ob.nextInt(); 
        int dataCenterNo = ob.nextInt(); 
        int seatNo = ob.nextInt(); 
        String name = ob.next(); 
        String date = ob.next(); 
        ob.close(); 
        Result r = new Result(marks, dataCenterNo, seatNo, name, date); 
        try { 
            r.ValidateMarks(marks); 
            System.out.println(r.getMarks()); 
        } catch (MarksOutOfBoundsException e) { 
            System.out.println("Exception caught"); 
            System.out.println(e.getMessage()); 
        } 
 
    } 
} 
