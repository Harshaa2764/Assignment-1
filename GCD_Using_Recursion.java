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
public class GCD_Using_Recursion {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number :: ");
      int firstNum = sc.nextInt();
      System.out.println("Enter second number :: ");
      int secondNum = sc.nextInt();
      System.out.println("GCD of given two numbers is ::"+gcd(firstNum, secondNum));
   }

   public static int gcd(int num1, int num2) {
      if (num2 != 0){
         return gcd(num2, num1 % num2);
      } else{
         return num1;
      }
   } 
}
