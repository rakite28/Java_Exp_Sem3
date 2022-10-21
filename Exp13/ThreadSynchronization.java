package Exp13;

public class ThreadSynchronization {
    public static void main(String[] args) { 
        Flight f = new Flight(2); 
        Thread t1 = new Thread(f); 
        t1.setName("Aditya"); 
        Thread t2 = new Thread(f); 
        t2.setName("Abhishek"); 
        Thread t3 = new Thread(f); 
        t3.setName("Micheal Myers"); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
} 
 
class Flight extends Thread { 
    int vacant = 5, required; 
 
    Flight(int required) { 
        this.required = required; 
    } 
 
    public synchronized void run() { 
        if (vacant >= required) { 
            System.out.println(required + " Tickets Have Been Booked For: " + Thread.currentThread().getName() + "!"); 
            try { 
                Thread.sleep(100); 
            } catch (Exception e) { 
            } 
 
            vacant -= required; 
        } else { 
            System.out.println("Sorry " + Thread.currentThread().getName() + ", But The Flight is Booked! (Only " 
                    + vacant + " Seat(s) Available)"); 
        } 
    } 
 
}
