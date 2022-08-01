/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author Harshada
 */
public class Quotient_Remainder {
      public static void main (String[] args) {
           Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the value of num1:");  
    int num1 = sc.nextInt();  
    System.out.println("Enter the value of num2:");  
    int num2 = sc.nextInt();  
    int quotient = 0, remainder = 0;  
  
      
    quotient = num1 / num2;  
  
    remainder = num1 % num2;  
  
    System.out.println("Quotient when " + num1 + "/" + num2 + " is: "   
  
+ quotient);  
    System.out.println("Remainder when " + num1 + " is divided by "   
  
+ num2 + " is: " + remainder);  
    }  
}
