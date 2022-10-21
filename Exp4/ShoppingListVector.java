package Exp4;

import java.util.*; 

public class ShoppingListVector 
{

    static void printmenu() { 
        System.out.println("1. Add an item to a speific position"); 
        System.out.println("2. Delete an item from a speific position"); 
        System.out.println("3. Show list"); 
        System.out.println("4. EXIT "); 
    } 
 
    public static void main(String[] args) { 
        Vector<String> shoppingList = new Vector<String>(); 
        Scanner s = new Scanner(System.in); 
 
        for (int i = 0; i < args.length; i++) { 
            shoppingList.add(args[i]); 
        } 
 
        printmenu(); 
 
        System.out.println("Enter the command number you want to execute: "); 
 
        int k = s.nextInt(); 
 
        while (k != 4) { 
            switch (k) { 
                case 1: 
                    System.out.println("Enter the item to be added:"); 
                    String tobeadded = s.next(); 
                    System.out.println("Enter the position to be added at"); 
                    int i = s.nextInt(); 
                    shoppingList.insertElementAt(tobeadded, (i - 1)); 
                    System.out.println("Item added!"); 
                    printmenu(); 
                    System.out.println("Enter next command number"); 
                    k = s.nextInt(); 
                    break; 
 
                case 2: 
 
                    System.out.println("Enter the position of the item to be deleted:"); 
                    int p = s.nextInt(); 
                    shoppingList.remove(p - 1); 
                    System.out.println("Item removed!"); 
                    printmenu(); 
                    System.out.println("Enter next command number"); 
                    k = s.nextInt(); 
                    break; 
 
                case 3: 
                    System.out.println("Shopping list is... \n"); 
 
                    for (int l = 0; l < shoppingList.size(); l++) { 
                        System.out.println((l + 1) + ")" + shoppingList.elementAt(l)); 
                    } 
                    System.out.println("\n"); 
 
                    printmenu(); 
                    System.out.println("Enter next command number"); 
                    k = s.nextInt(); 
                    break; 
 
                default: 
                    System.out.println("Please enter a valid command number:"); 
                    k = s.nextInt(); 
                    break; 
 
            } 
        } 
        // System.out.print(shoppingList); 
        s.close(); 
    } 
}