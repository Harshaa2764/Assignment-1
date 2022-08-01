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
public class GCD {
   public static void main(String[] args) {

        int num1, num2;
        
        //Reading the input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = (int)scanner.nextInt();
        
        System.out.print("Enter second number:");
        num2 = (int)scanner.nextInt();
        
        //closing the scanner to avoid memory leaks
        scanner.close();
        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

        //displaying the result
        System.out.printf("GCD of given numbers is: %d", num2);
    }  
}
